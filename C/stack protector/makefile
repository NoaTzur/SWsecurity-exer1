CC = gcc
FLAGS=-Wall


all: main1 main2 main3

main1:
	$(CC) protector_all.c -o protector_all -fstack-protector-all 
	
main2:
	$(CC) protector.c -o protector -fstack-protector
	
main3:
	$(CC) strong_protector.c -o strong_protector -fstack-protector-strong
	
	

.PHONY: clean all


clean:
	rm -f protector_all protector strong_protector
