# 84Script
A C-like programming language that compiles to TI-BASIC

[Discord](https://discord.gg/rGyzCDaD6W)

# Why
Idk why not, seems like a neat hobby project

# Roadmap
Current progress of the project, shows what is currently done and what needs to be done.

Key:
✅ - Completed
🔄 - In progress
❌ - Incomplete

```
🔄 - TI-Basic
	✅ - 8xp file reading/generation
	✅ - Ti token compilation
	✅ - Ti token decompilation (for debugging)
	🔄 - Complete Ti token enum
🔄 - 84Script
	🔄 - Antlr
		🔄 - Complete antlr grammar for 84Script
		✅ - Java code generation
	🔄 - Compilation
		🔄 - EFSCompiler.java
		✅ - EFS Statement Block
		🔄 - EFS Script Block
		🔄 - Include other files
		🔄 - Functions
			✅ - Function parsing
			✅ - Function defining
			✅ - Function compiling
			✅ - Function calling
		🔄 - Expressions
			✅ - Bracket expressions "(<expression>)"
			✅ - Identifier expression
			✅ - Number expression
			✅ - Constant expression (pi, e, ...)
			✅ - Boolean expression
				✅ - True
				✅ - False
				✅ - Greater than
				✅ - Less than
				✅ - Equal to
				✅ - Not equal
				✅ - Greater than or equal to
				✅ - Less than or equal to
			❌ - Text expression
			✅ - Add expression
			✅ - Subtract expression
			✅ - Multiplication expression
			✅ - Division expression
			✅ - Method call expression
		🔄 - Statements
			✅ - Assign statement
			✅ - Add assign statement
			✅ - Subtract assign statement
			❌ - Multiply assign statement
			❌ - Divide assign statement
			✅ - Increment statement
			✅ - Decrement statement
			❌ - If statement
			❌ - While statement
			✅ - Var statement
			✅ - Return statement
			🔄 - TiBasic statement
				🔄 - TiBasic grammar
				✅ - TiBasic parser & lexer
				🔄 - TiBasic compiler
	❌ - STIL (Standard TI Library)
	🔄 - 8xp from 84Script generation
```

# Using 84Script
84Script is quite simple to write code with, much like how TI-Basic itself is. If you're already farmiliar with a language such as Python, C, Java, etc. using 84Script should be quite simple.

## Functions
Functions can be made using the ``def`` keyword, similarly to Python.
Parameters are only accessible to the current function. They may be passed down to other functions as well.
Example:
```
def Add(numA, numB)
{
    return numA + numB;
}
```

## Multiple files
You can include multiple files using 84Script.
```
include: STIL.efs
include: anotherFile.efs
```

## Inline Ti-Basic
Much like C++ inline assembly, you can use inline Ti-Basic.
This feature will not be well supported though, and will mostly be used for creating a standard library for 84Script.
```
def display(myText)
{
	__tibasic {
		Disp myText;
	}
}
```

## Inline assembly
Ti calculators have the ability to run assembly code, I would like to implement some kind of inline assembly at some point. Unfortunately, as far as I'm aware, modern firmwares are restricted from the use of assembly, so this feature may never come to be. If it does come to exist in the future, it will behave much like the "Inline Ti-Basic", but with a ``__asm`` block like you'd find in C++.

## STIL
STIL (Standard TI Library) is an 84Script source file you can include in your code to invoke Ti-Basic in a 84Script format. For example, "display". Ti-Basic has a "Disp" token, which will display whatever variable succeeds it. Using it in STIL is as simple as a call to ``display(xyz)`` in your code.
Considering the compiler isnt really done yet, don't expect much here to stay as is. Many compiler features are required for this lib to even be written.

## Variables
All variables are only available in their given scope. They may be accessed and modified after their declaration, but not deleted. Keep this in mind when initializing them with repeating code. Variables are always numerical, other types of data, such as strings, are not possible for use with variables. Their numerical abilities are determined by the calculator's settings. If the calculator is in "Real" mode, only real numbers can be stored. Function calls create copies of the variables in each call, meaning recursive calls could fill the parameter stack (``L2``) with multiple of the same variables potentially taking up more memory than needed. In many cases, loops will be preferable to recursive calls.
Variables can be defined using the ``var`` keyword.
Example:
```
var awesomeVariable = 2.33;
```

# Generated structure
This section is about how the generated .8xp file(s) are structured programatically, and how they work. This is important for debugging your code when either you or the compiler makes a mistake.

## Program registers
* ``I`` - The initialization register. Used for program initialization. Set to true after its used and reset to 0 once program execution has completed.
* ``F`` - The function register. Used to determine which function is being invoked.
* ``G`` - Calling register. Used to determine if a function is meant to be invoked.
* ``C`` - Return register. The value a function returns.

## Variables
* The list ``L1`` is the variable stack. This is sized as variables are created and destroyed via the call stack.
* The list ``L2`` is used as a parameter stack for function calls. This is sized based on function calls, added to when a call begins, and removed once one completes. 

## Visualization

|    Start   |
|  :-------: |
|    Init    |
| Func Table |
|  Program   |

Its quite a simple, yet effective structure.

# Limitations
84Script is limited by a number of factors, all of which are limitations of Ti-Basic.
* Only 6 strings can be stored at a time
* You can only concatenate strings
* All numeric vars are restricted by calculator settings