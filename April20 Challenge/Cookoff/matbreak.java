import java.io.*;
import java.util.*;
import java.lang.Math;

class matbreak
{
  static long N = 1000000007L;
  static long exponentiation(long base, long exp)
  {
      if (exp == 0)
          return 1;

      if (exp == 1)
          return base % N;

      long t = exponentiation(base, exp / 2);
      t = (t * t) % N;

      // if exponent is even value
      if (exp % 2 == 0)
          return t;

      // if exponent is odd value
      else
          return ((base % N) * t) % N;
  }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
        int n=sc.nextInt();
        int a=sc.nextInt();
        int p=1000000007,c=1,d=1;
        long sum=0;
        for(int j=1;j<=n;j++)
        {
          long re=exponentiation(a,(c*d));
          sum=(sum+re)%p;
          //System.out.println(re+" c="+c+" d="+d);
          if(j==1)
            c=2;
          else
            c+=(c*d);
          d=d+2;
        }
        System.out.println(sum);
      }
    }
  }
