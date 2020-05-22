import java.io.*;
import java.util.*;

class tstrobot
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      tstrobot ob=new tstrobot();
      int t=sc.nextInt();
      int re[]=new int[t];
      if(t>=1 && t<=100)
      {
        for(int k=0;k<t;k++)
        {
        int n=sc.nextInt();
        if(n>=1 && n<=100)
        {
          int x=sc.nextInt();
          if(x<=1000000 || x>=(-1000000))
          {
            String s=sc.nextLine();
            sc.nextLine();
            if(s.length()==n)
            {
              String str[]=new String[n];
              int c=0;
              for(int i=0;i<n;i++)
              {
                if(s.charAt(i)=='L' || s.charAt(i)=='R')
                {
                  str[i]+=s.charAt(i);
                  c++;
                }
              }
              if(c==n)
              {
                int b[]=new int[100];
                b[0]=x;
                int index=1;
                String a;
                a=Integer.toString(x)+" ";
                for(int i=0;i<n;i++)
                {
                  if(str[i]=="L")
                  {
                    x--;
                    if(ob.search(b,x)==1)
                    {
                      b[index++]=x;
                      a+=Integer.toString(x)+" ";
                    }
                  }
                  else
                  {
                    x++;
                    if(ob.search(b,x)==1)
                    {
                      b[index++]=x;
                      a+=Integer.toString(x)+" ";
                    }
                  }
                }
                String res[]=a.split(" ");
                re[k]=res.length;
              }
              }
            }
          }
        }
      }
      for(int i=0;i<t;i++)
      {
        System.out.println(re[i]);
      }
    }
    int search(int a[],int b)
    {
      int c=0;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]==b)
          c=1;
      }
      if(c==1)
        return 0;
      else
        return 1;
    }
  }
