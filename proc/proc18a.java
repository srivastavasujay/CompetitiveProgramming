import java.io.*;
import java.util.*;

class proc18a
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      int re[]=new int[t];

      for(int k=0;k<t;k++)
      {
        if(t>=1 && t<=10)
        {
          String str=sc.nextLine();
          String s[]=str.split(" ");
          int kn[]=new int[2];
          for(int i=0;i<2;i++)
          {
            kn[i]=Integer.parseInt(s[i]);
          }
          if(kn[1]>=1 && kn[1]<=kn[0] && kn[0]<=100)
          {
          String str1=sc.nextLine();
          String s1[]=str1.split(" ");
          int a[]=new int[kn[0]];
          int count=0;
          for(int i=0;i<kn[0];i++)
          {
            a[i]=Integer.parseInt(s1[i]);
            if(a[i]>=1 && a[i]<=100)
            count++;
          }
          if(count==kn[0])
          {
            int te[]=new int[a.length-kn[1]+1];
            for(int i=0;i<(a.length-kn[1]+1);i++)
            {
              int sum=0,temp=i;
              for(int j=0;j<kn[1];j++)
              {
                sum=sum+a[temp];
                temp++;
              }
              te[i]=sum;
            }
            int max=te[0];
            for(int i=0;i<te.length;i++)
            {
              if(te[i]>max)
              max=te[i];
            }
            re[k]=max;
          }
          }
        }
      }
      for(int i=0;i<t;i++)
      {
        System.out.println(re[i]);
      }
  }
}
