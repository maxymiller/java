@echo off
title calc matriz
::mode 85,20
set "cdhome=%cd%"
set "user=%username%"
set "maxyerror=0"
echo user: %user%
echo pasta: %cdhome%
::pause
cls

cd "calc matriz (V4)"

echo bem vindo user %user% code java matriz

javac -version
if %errorlevel% == 0 goto javacsus
goto javacerror

:javacsus
javac Main.java

:javacerror
java -version
if %errorlevel% == 0 goto javasus
goto javaerror

:javasus
java Main


pause
exit

:javaerror
echo error: download jdk java
pause
exit

:error
color c
echo error
pause
