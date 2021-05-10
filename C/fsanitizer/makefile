CC = gcc
FLAGS=-Wall


all: main1 main2 main3 main1_with main2_with main3_with

with: main1 main2 main3

without: main1_with main2_with main3_with

main1_with:
	$(CC) leak.c -o leak_with_fs -fsanitize=leak
	
main2_with:
	$(CC) divide_by_zero.c -o divide_by_zero_with_fs -fsanitize=integer-divide-by-zero
	
main3_with:
	$(CC) stack_overflow.c -o stack_overflow_with_fs -fsanitize=address
	
	
	
	
main1:
	$(CC) leak.c -o leak
	
main2:
	$(CC) divide_by_zero.c -o divide_by_zero
	
main3:
	$(CC) stack_overflow.c -o stack_overflow
	


.PHONY: clean all


clean:
	rm -f leak divide_by_zero stack_overflow leak_with_fs divide_by_zero_with_fs stack_overflow_with_fs
