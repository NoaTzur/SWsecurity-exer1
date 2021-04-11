#include <stdio.h>
#include <stdlib.h>


unsigned int geometric_series(int num){
	
	unsigned int sum = 0;

	for(int i=num; i>=0; i--){
	
		sum = sum+(1/i);
		printf("%d\n", i);
	}
	return sum;

}




int main()
{
      unsigned int sum = geometric_series(10);
      printf("%d", sum);
}
