import java.io.*;
import java.util.*;

class wghtnum
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      int res[]=new int[t];
      if(t>=1 && t<=1000)
      {
        for(int k=0;k<t;k++)
        {
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int a[]=new int[2];
        a[0]=Integer.parseInt(s1[0]);
        a[1]=Integer.parseInt(s1[1]);

        if(a[0]>=2 && a[0]<=1000)
        {
          if(a[1]>=-300 && a[1]<=300)
          {
            if(a[0]==2)
            {
              if(a[1]>0)
              res[k]=(9-a[1]);

              if(a[1]<0)
              res[k]=(9+a[1]+1);
            }

            if(a[0]>2)
            {
              int t1=a[0]-2;
              int t2;
              if(a[1]>0)
               t2=(9-a[1]);
              else
                t2=(9+a[1]+1);

              int sum=1;
              for(int i=0;i<t1;i++)
              {
                sum=((sum%1000000007)*(10%1000000007))%1000000007;
              }
              sum=((sum%1000000007)*(t2%1000000007))%1000000007;
              res[k]=sum;
            }
          }
        }
        }
      }
      for(int i=0;i<t;i++)
      {
      System.out.println(res[i]);
      }
  }
}
