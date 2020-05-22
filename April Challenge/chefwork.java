import java.io.*;
import java.util.*;

class chefwork{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    int res=0;
    int a[]=new int[t];
    int b[]=new int[t];
    int count=0;

    if(t>=1 && t<=1000)
    {
      String a1=sc.nextLine();
      String b1=sc.nextLine();
      String c[]=a1.split(" ");
      String d[]=b1.split(" ");
      int trans=0,auth=0,transauth=0;
      int ct=0,ca=0,cta=0;
      for(int i=0;i<t;i++)
      {
        a[i]=Integer.parseInt(c[i]);
        b[i]=Integer.parseInt(d[i]);
        if(a[i]>=1 && a[i]<=100000 && b[i]>=1 && b[i]<=3)
        count++;
        if(b[i]==1)
        trans++;
        if(b[i]==2)
        auth++;
        if(b[i]==3)
        transauth++;
      }
      if(trans==0)
      ct++;
      if(auth==0)
      ca++;
      if(transauth==0)
      cta++;
      if(count==t)
      {
        int mint=0,mina=0,minta=0;
        if(trans>1)
        {
          int tr[]=new int[trans];
          trans=0;
          for(int i=0;i<t;i++)
          {
          if(b[i]==1)
          tr[trans++]=a[i];
          }
          mint=tr[0];
          for(int i=0;i<trans;i++)
          {
          if(mint>tr[i])
          mint=tr[i];
          }
        }
        else
        {
          for(int i=0;i<t;i++)
          {
          if(b[i]==1)
          mint=a[i];
          }
        }

        if(auth>1)
        {
          int au[]=new int[auth];
          auth=0;
          for(int i=0;i<t;i++)
          {
          if(b[i]==2)
          au[auth++]=a[i];
          }
          mina=au[0];
          for(int i=0;i<auth;i++)
          {
          if(mina>au[i])
          mina=au[i];
          }
        }
        else
        {
          for(int i=0;i<t;i++)
          {
          if(b[i]==2)
          mina=a[i];
          }
        }

        if(transauth>1)
        {
          int ta[]=new int[transauth];
          transauth=0;
          for(int i=0;i<t;i++)
          {
          if(b[i]==3)
          ta[transauth++]=a[i];
          }
          minta=ta[0];
          for(int i=0;i<transauth;i++)
          {
          if(minta>ta[i])
          minta=ta[i];
          }
        }
        else
        {
          for(int i=0;i<t;i++)
          {
          if(b[i]==3)
          minta=a[i];
          }
        }

        if(ct>0 || ca>0)
          res=minta;

        else if(cta>0)
        res=mint+mina;

        else
        {

          if((mint+mina)<minta)
            res=mint+mina;
          else
            res=minta;
        }
      }
    }
    System.out.println(res);
  }
}
