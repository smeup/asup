@echo off

if ""=="%1"  goto :EXPLAIN
if ""=="%2"  goto :EXPLAIN

set TMP_SQL=%TEMP%\%0.sql

echo RESTORE DATABASE %1 FROM %2 WITH 70 BUFFERS BUFFER 4096 WITHOUT PROMPTING; >> %TMP_SQL% 
echo ROLLFORWARD DATABASE %1 TO END OF LOGS; >> %TMP_SQL%

db2 -tvf %TMP_SQL%

del %TMP_SQL%

echo Restore of %1 terminated
goto FINE

:EXPLAIN
echo Usage: %0 dbName backupDirectory
goto FINE

:FINE
