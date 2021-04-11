CC = gcc
FLAGS=-Wall

all: main1 main2 main3
	
main1: leak.o
	$(CC) $(FLAGS) leak.o -o leak -fsanitize=leak
	
leak.o: leak.c
	$(CC) $(FLAGS) -c leak.c -o leak.o
	
main2: divide_by_zero.o
	$(CC) $(FLAGS) divide_by_zero.o -o divide_by_zero -fsanitize=integer-divide-by-zero
	
divide_by_zero.o: divide_by_zero.c
	$(CC) $(FLAGS) -c divide_by_zero.c -o divide_by_zero.o

main3: stack_overflow.o
	$(CC) $(FLAGS) stack_overflow.o -o stack_overflow -fsanitize=address

	
stack_overflow.o: stack_overflow.c
	$(CC) $(FLAGS) -c stack_overflow.c -o stack_overflow.o 
	
.PHONY: clean all 


clean:
	rm -f main *.o leak divide_by_zero stack_overflow
