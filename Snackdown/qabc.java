import java.util.*;
import java.io.*;
import java.util.Arrays;

class qabc
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];
    int sum=0;

    if(t>=1 && t<=1000)
    {
      int n=sc.nextInt();
      sum+=n;
      if(n>=1 && n<=100000)
      {
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3[]=s1.split(" ");
        String s4[]=s2.split(" ");
        int a[]=new int[n];
        int b[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
          a[i]=Integer.parseInt(s3[i]);
          b[i]=Integer.parseInt(s4[i]);
          if(a[i]>=0 && a[i]<=100000000 && b[i]>=0 && b[i]<=100000000)
            c++;
        }
        if(c==n)
        {

        }
      }
    }
  }
}
