@echo off
rem (c) Copyright IBM Corp. 2007 All rights reserved.
rem 
rem The following sample of source code ("Sample") is owned by International 
rem Business Machines Corporation or one of its subsidiaries ("IBM") and is 
rem copyrighted and licensed, not sold. You may use, copy, modify, and 
rem distribute the Sample in any form without payment to IBM, for the purpose of 
rem assisting you in the development of your applications.
rem 
rem The Sample code is provided to you on an "AS IS" basis, without warranty of 
rem any kind. IBM HEREBY EXPRESSLY DISCLAIMS ALL WARRANTIES, EITHER EXPRESS OR 
rem IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
rem MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. Some jurisdictions do 
rem not allow for the exclusion or limitation of implied warranties, so the above 
rem limitations or exclusions may not apply to you. IBM shall not be liable for 
rem any damages you suffer as a result of using, copying, modifying or 
rem distributing the Sample, even if IBM has been advised of the possibility of 
rem such damages.

rem BATCH FILE: bldapp.bat
rem Builds C applications on Windows
rem Usage: bldapp prog_name [ db_name [ userid password ]]

rem Default compiler is set to Microsoft Visual C++
rem To use a different compiler, comment out 'set BLDCOMP=cl'
rem and uncomment 'set BLDCOMP=icl' or 'set BLDCOMP=ecl'
rem Microsoft C/C++ Compiler
set BLDCOMP=cl

rem Intel C++ Compiler for 32-bit and 64-bit applications
rem set BLDCOMP=icl

rem Older Intel C++ Compiler for Itanium 64-bit applications
rem set BLDCOMP=ecl

rem Uncomment the next line if building 32-bit applications using
rem a DB2 64-bit product on Windows 64-bit
rem set BITWIDTH=32onWin64

rem The INCLUDE path environment variable must have 
rem %DB2PATH%\include ahead of any Microsoft Platform SDK
rem include directories.

call "C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC\vcvarsall.bat" x64

set INCLUDE=%INCLUDE%;C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC\include


if "%BITWIDTH%" == "32onWin64" set LIB=%DB2PATH%\lib\Win32;%LIB%

if exist "%1.sqx" goto embedded
if exist "%1.sqc" goto embedded
goto non_embedded

:embedded
rem Precompile and bind the program.
rem Note: some .sqc/.sqx files contain no SQL but link in 
rem utilemb.sqc/.sqx, so if you get this warning, ignore it:
rem SQL0053W  No SQL statements were found in the program.
call embprep %1 %2 %3 %4
rem  Compile the program.
if exist "%1.cxx" goto cpp_emb
%BLDCOMP% -Zi -Od -c -W2 -DWIN32 %1.c utilemb.c
goto link_embedded
:cpp_emb
%BLDCOMP% -Zi -Od -c -W2 -DWIN32 %1.cxx utilemb.cxx
rem Link the program.
:link_embedded
rem set BUFFEROVERFLOWLIB if using vs2005 or earlier
rem set BUFFEROVERFLOWLIB=bufferoverflowU.lib
link -debug -out:%1.exe %1.obj utilemb.obj db2api.lib %BUFFEROVERFLOWLIB%
goto exit

:non_embedded
rem  Compile the program.
if exist "%1.cxx" goto cpp_non
%BLDCOMP% -Zi -Od -c -W2 -DWIN32 %1.c utilapi.c
goto link_non_embedded
:cpp_non
%BLDCOMP% -Zi -Od -c -W2 -DWIN32 %1.cxx utilapi.cxx
rem Link the program.
:link_non_embedded
rem set BUFFEROVERFLOWLIB if using vs2005 or earlier
rem set BUFFEROVERFLOWLIB=bufferoverflowU.lib
link -debug -out:%1.exe %1.obj utilapi.obj db2api.lib %BUFFEROVERFLOWLIB%
:exit
@echo on
