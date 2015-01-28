#README

This is a simple C++ exercise, where you have to implement a class called `MyString`, which will act more or less like the standard `string` class, but without using it as a private field. You will find descriptive comments at `mystring.cpp` about what should every prototype of `mystring.h` file should do.

##Compilation and running the code
If you are willing to use an IDE you may skip this, since the IDE itself is doing the compilation and the running of the code. Otherwise, if you are going to use a command-line compiler (`g++`), you will have to do as written below:

Firstly, you have to change directory (using Terminal, CMD, or any other CLI) to the directory where `mystring.h`, `mystring.cpp` and `main.cpp` are, and then execute this to compile:

```bash
g++ main.cpp mystring.cpp mystring.h -o main -w
```

This will compile the code for you. Then, you can run it by executing:
```bash
./main
```

##Submitting your code

[Here](https://github.com/thingslab/Challenges#submitting-your-code) you can check how to submit your code when you finish.
