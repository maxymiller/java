#!/bin/bash
homepwd="$PWD"
username="$USER"
nul="$homepwd/tmp/nul"
echo "bem vindo user $username code java maxymiller e java"

if javac --version; then
javac Main.java
else
echo "[error]: javac"
fi
if java --version; then
java Main
else
echo "[error]: java"
echo "[error]: download jdk java"
read
fi
