# Software Security Course

## Java Assignment

in this section we have been requested to demonstrate that handling the underlying null 
pointer dereference by catching the NullPointerException is inappropriate for several reasons,
by writing two simple and short code :

1. sending null instead of valid string to login_to_moodle() func 
2. sending null instead of valid array to is_prime() func

*both are fixed inside the functions in login_to_moodle_fixed() & is_prime_fixed()*



#### How to run the file:
 * goto Java folder 
 * you will see the "exer1.java" file
 * open this file with your IDE 
 * run the code, explanation will be printed to console.

## C Assignment

gcc version of my ubuntu is - ``` gcc (Ubuntu 9.3.0-17ubuntu1~20.04) 9.3.0 ```

### Part 1

in this part we have been requested to write a small C-language program including three functions each 
demonstrating a different issue of your choice flagged by GCC-sanitizer.

 - goto C folder 
 - goto fsanitizer folder
 - you`ll found 3 files:
    - divide_by_zero.c using ``` -fsanitize=integer-divide-by-zero ``` flag
    - stack_overflow.c using ``` -fsanitize=address ``` flag
    - leak.c using ``` -fsanitize=leak ```
    
 - in addition, you will find makefile.
 - open terminal and run the ``` make ``` command - you will see 6 exec files. 
 
 *Explanation of each file :*
 
  1. the 3 files that called ``` leak_with_fs ``` , ``` divide_by_zero_with_fs ```, ``` stack_overflow_with_fs ```
    are compilied with GCC-sanitizer.
    - -fsanitize=leak ``` -> ``` flag is a a memory leak detector. 
    - -fsanitize=integer-divide-by-zero ``` -> ``` detect integer division by zero
    - -fsanitize=address ``` -> ``` detect out-of-bounds and use-after-free bugs.
  2. the 3 other files compiled without –fsanitize options.
  
  Example :
  
  ![leaks](https://user-images.githubusercontent.com/72066777/114628805-20084980-9cc0-11eb-9eb5-f67c5143010f.PNG)

### Part 2

in this part we have been requested to create three small functions to demonstrate usage of 
``` -fstack-protector ```, ``` -fstack-protector-all ```, ``` -fstack-protector-strong ``` compilation options that 
existing in order to protect out stack from being attack (like buffer overflow attacks).
we also used ``` -fno-stack-protector  ``` in order to compare the results.

in this part i will add pictures to show the results.

 * goto C folder
 * goto stack protector folder
 * open terminal and run the ``` make ``` command.
 * 3 files will be created
 
Explanation of this 4 flags:

1. ``` -fno-stack-protector ``` disables stack protection. when we compiled the files with this flags, our script run 
  without any error\warnings, despite the fact the script have serious problems.
2. ``` -fstack-protector ```  enables stack protection for vulnerable functions like array of length 8 bytes and more.
  when we compiled a script that contains an 3 byte array length, the script ran without any errors and warnings.
  but with 8 byte array length, error has been detected.
3. ``` -fstack-protector-all ``` adds stack protection to *all* functions regardless of their vulnerability.
  with this we have been able to detect a problems that the other flags could not succeed.
4. ``` -fstack-protector-strong ``` enables stack protection for vulnerable functions, like array with *any* size!
  with this flags, an error detected even on script with small array - 3 bytes only !
  
  
Pictures with explanations :

in this pic, you can see that we ran the script twice- *first try* with the ``` -fstack-protector ``` flag.
an " *** stack smashing detected *** " printed to terminal, and the script stopped.
*second try* with ``` -fno-stack-protector ```, no errors was printed to the screen, and the program
hasnt stopped !! (BAD - in the script we exceed array boundaries and over write memory in stack).

![no_stack_protector](https://user-images.githubusercontent.com/72066777/114630242-d10fe380-9cc2-11eb-9770-6e7fcd481003.PNG)

 in the second pic, we ran the protector_all.c script twice - *first try* with ``` -fstack-protector ```.
 no error has been detected despite the border deviation, because the array in this script is in length of 3 byte.
 in the *second try*, with the ``` -fstack-protector-all ``` flag, an error was detected ! and the program stopped.
 
 ![protect_all](https://user-images.githubusercontent.com/72066777/114630792-fe10c600-9cc3-11eb-859e-354b97b3b0d1.PNG)


in the last pic, we can see another 2 tries - *first try* with the ``` -fno-stack-protector ```, as expected, no error 
has been detected and the program proceed.
in the *second try* we used ``` -fstack-protector-strong ```, we were happy to see the " *** stack smashing detected *** " 
printed on the screen...

![stack_strong](https://user-images.githubusercontent.com/72066777/114631098-a757bc00-9cc4-11eb-86fb-79daf4b0241e.PNG)

  
  
