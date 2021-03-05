# 84Script
A C-like programming language that compiles to TI-BASIC

# Why
Idk why not, seems like a neat hobby project

# Generated structure
This section is about how the generated .8xp file(s) are structured programatically, and how they work.

## Program registers
* ``I`` - The initialization register. Used for program initialization. Set to true after its used and reset to 0 once program execution has completed.
* ``F`` - The function register. Used to determine which function is being invoked.
* ``G`` - Calling register. Used to determine if a function is meant to be invoked.

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