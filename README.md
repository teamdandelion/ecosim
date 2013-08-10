ecosim
======

Dev Setup
=========
Commands to generate eclipse project files, build the program, and run it:
```
./gradlew --daemon --parallel eclipse
./gradlew --daemon --parallel build
./gradlew --daemon --parallel run
```
You might want to set up a shorter alias for the command. To abbreviate to `g`:
```
alias g='./gradlew --daemon --parallel'
```
