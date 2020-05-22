import java.util.*;
import java.io.*;
//import java.util.Arrays;

class eid
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int re[]=new int[t];
    int sum=0;

    if(t>=1 && t<=100)
    {
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        sc.nextLine();
        sum=sum+n;
        String s1=sc.nextLine();
        String s[]=s1.split(" ");
        int v[]=new int[s.length];
        int count=0;

        for(int i=0;i<s.length;i++)
        {
          v[i]=Integer.parseInt(s[i]);
          if(v[i]>=1 && v[i]<=1000000)
            count++;
        }

        if(count==s.length)
        {
          for(int i=0;i<(v.length-1);i++)
          {
            for(int j=i+1;j<v.length;j++)
            {
              if(v[i]>v[j])
              {
                int temp=v[i];
                v[i]=v[j];
                v[j]=temp;
              }
            }
          }
          //Arrays.sort(v[i]);
          int ve[]=new int[v.length-1];

          for(int i=0;i<v.length-1;i++)
          {
            ve[i]=v[i+1]-v[i];
          }

          for(int i=0;i<(ve.length-1);i++)
          {
            for(int j=i+1;j<ve.length;j++)
            {
              if(ve[i]>ve[j])
              {
                int temp=ve[i];
                ve[i]=ve[j];
                ve[j]=temp;
              }
            }
          }

          //Arrays.sort(ve[i]);

          re[k]=ve[0];
        }
      }
    }
    if(sum<=2000)
    {
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
    }
  }
}
