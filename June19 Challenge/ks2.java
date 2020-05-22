import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

class ks2
{
  public static void main(String[] args)
  {
      ks2 ob=new ks2();
      Scanner sc=new Scanner(System.in);
      long t=sc.nextLong();
      //if(t>=1 && t<=Math.pow(10,5))
      //{
        for(int i=0;i<t;i++)
        {
        long n=sc.nextLong();
        BigInteger A=BigInteger.valueOf(n);
        //{
          //if(n>=1 && n<=Math.pow(10,18))
          //{
            long no=ob.cal(n);
            if(no>0)
              System.out.println(no);
            else
            {
              while(n<0)
              {
                no=ob.cal(++n);
              }
              System.out.println(no);
            }
          }
        //}
        //}
      //}
  }
  long cal(long n)
  {
    long sum=sumofdigits(n);
    //System.out.println(sum);
    long r=10-sum%10;
    BigInteger A=BigInteger.valueOf((10*n)+r);

  }
  long sumofdigits(long n)
  {
    long sum=0;
    while(n>0)
    {
      sum+=n%10;
      n/=10;
    }
    return sum;
  }
}
