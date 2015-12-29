@echo off

if ""=="%1"  goto :EXPLAIN
if ""=="%2"  goto :EXPLAIN

set TMP_SQL=%TEMP%\%0.sql

echo CONNECT TO %1; >> %TMP_SQL% 
echo QUIESCE DATABASE IMMEDIATE FORCE CONNECTIONS; >> %TMP_SQL% 
echo CONNECT RESET; >> %TMP_SQL% 
echo BACKUP DATABASE %1 TO %2 WITH 1 BUFFERS BUFFER 1024 PARALLELISM 1 WITHOUT PROMPTING; >> %TMP_SQL% 
echo CONNECT TO %1; >> %TMP_SQL% 
echo UNQUIESCE DATABASE; >> %TMP_SQL% 
echo CONNECT RESET; >> %TMP_SQL% 
echo QUIT; >> %TMP_SQL% 


db2 -tvf %TMP_SQL%

del %TMP_SQL%

echo Backup of %1 terminated
goto FINE

:EXPLAIN
echo Usage: %0 dbName backupDirectory
goto FINE

:FINE
