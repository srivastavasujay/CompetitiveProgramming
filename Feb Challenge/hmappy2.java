import java.io.*;
import java.util.*;
import java.lang.*;

class hmappy2
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      hmappy2 ob=new hmappy2();
      String re[]=new String[t];
      if(t>=1 && t<=15)
      {
        for(int p=0;p<t;p++)
        {
          int n=sc.nextInt();
          int a=sc.nextInt();
          int b=sc.nextInt();
          int k=sc.nextInt();
          int count=0;
          if(k>=1 && k<=1000000 && n>=1 && n<=1000000 && a>=1 && a<=1000 && b>=1 && b<=1000)
          {
            int x=ob.gcd(a,b);
            //System.out.println(x);
            int lcm=(a*b)/x;
            //System.out.println(lcm);
            count=(n/a)+(n/b)-2*(n/lcm);
            //System.out.println(count);

            if(count>=k)
              re[p]="Win";
            else
              re[p]="Lose";
          }
        }
      }
      for(int i=0;i<t;i++)
      {
        System.out.println(re[i]);
      }
  }
  int gcd(int a,int b)
  {
    if(a==0)
      return b;

    return gcd(b%a,a);
  }
}
