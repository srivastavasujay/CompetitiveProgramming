import java.util.*;
import java.io.*;

class icpc16b
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    icpc16b ob=new icpc16b();
    String re[]=new String[t];
    int sum=0;
    if(t>=1 && t<=1000000)
    {
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        sum+=n;
        int a[]=new int[n];
        if(n>=1 && n<=100000)
        {
          int c=0;
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
              if(a[i]>=-1000000000 && a[i]<=1000000000)
                c++;
          }
          if(c==n)
          {
            int check=0;
            outerloop:
            for(int i=0;i<(a.length-1);i++)
            {
              for(int j=i+1;j<a.length;j++)
              {
                int temp=a[i]*a[j];
                int ans=ob.find(temp,a);

                if(ans==1)
                {
                  check=1;
                  break outerloop;
                }
              }
            }

            if(check==1)
              re[k]="yes";
            else
              re[k]="no";
          }
        }
      }
    }

    if(sum<=1000000)
    {
      for(int i=0;i<t;i++)
      {
        System.out.println(re[i]);
      }
    }
  }
    int find(int a,int num[])
    {
       int ch=0;
      for(int i=0;i<num.length;i++)
      {
        if(num[i]==a)
        {
          ch=1;
          return 1;
        }
        //System.out.println("N");
        //if(ch==1)
          //break;
      }
      //System.out.println("Y");
      if(ch==0)
        return 0;
      else
        return 1;
    }
}
