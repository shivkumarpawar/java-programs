 #include<stdio.h>
 void f(int n)
   {
      if(n<=1)
	  {
	    printf("%d",n);
	  }
	  else{
	   f(n/2);
	   printf("%d",n%2);
	  }
   }
  int main()
{
   int n=173;
   f(n);
   return 0;
  
   
}