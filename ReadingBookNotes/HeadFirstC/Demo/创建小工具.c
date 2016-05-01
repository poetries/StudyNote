#include<stdio.h>

#include<stdio.h>

int main(void)
{
  float latitude;
  float longitude;
  char info[80];
  int started = 0;//设置初值位0表示假
  
  puts("data=[");
  while(scanf("%f,%f,%79[^\n]",&latitude,&longitude,info) == 3)
  {
	if(started)
		printf(",\n");
	else
		started = 1;
	printf("{latitude: %f,longitude: %f,info: %s}",latitude,longitude,info);
  }
  puts("\n]");

  return 0;
}

