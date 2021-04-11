
#include <stdio.h>
#include <stdlib.h>

typedef struct Person {
	
	char* name;
	int age;
	int ID;

}pers;

int main()
{
      pers p1;
      p1.name = (char*) malloc(20*sizeof(char));
      p1.age = 9;
      p1.ID = 208764534; 
      
      printf("%s", p1.name);
}
