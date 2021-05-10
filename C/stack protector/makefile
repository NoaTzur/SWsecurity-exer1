CC = gcc
FLAGS=-Wall
 
all : main1 main2 main3 main1_no_flag main2_no_flag main3_no_flag

with: main1 main2 main3

without: main1_no_flag main2_no_flag main3_no_flag

main1:
	$(CC) protector_all.c -o protector_all -fstack-protector-all 
	
main2:
	$(CC) protector.c -o protector -fstack-protector
	
main3:
	$(CC) strong_protector.c -o strong_protector -fstack-protector-strong
	

main1_no_flag:
	$(CC) protector_all.c -o protector_all_no_flag -fno-stack-protector
	
main2_no_flag:
	$(CC) protector.c -o protector_no_flag -fno-stack-protector
	
main3_no_flag:
	$(CC) strong_protector.c -o strong_protector_no_flag -fno-stack-protector


.PHONY: clean all


clean:
	rm *.o -f protector_all protector strong_protector strong_protector_no_flag protector_no_flag protector_all_no_flag
