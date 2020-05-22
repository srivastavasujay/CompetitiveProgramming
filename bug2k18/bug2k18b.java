import java.io.*;
import java.util.*;

class bug2k18b
{
  public static void main(String args[])
  {
    try
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();

    String re[]=new String[t];
    if(t>=1 && t<=10000)
    {
      for(int k=0;k<t;k++)
      {
        sc.nextLine();
        String s1=sc.nextLine();
        String s[]=s1.split(":");
        int cur[]=new int[s.length];
        for(int i=0;i<s.length;i++)
        {
          cur[i]=Integer.parseInt(s[i]);
        }
        if(cur[0]>=0 && cur[0]<=23 && cur[1]>=0 && cur[1]<=59)
        {
          int time=sc.nextInt();
          sc.nextLine();
          if(time>=0 && time<=200)
          {
            int ti[]=new int[2];
            ti[0]=time/60;
            ti[1]=time%60;

            String s2=sc.nextLine();
            String se[]=s2.split(":");
            int exp[]=new int[se.length];
            for(int i=0;i<se.length;i++)
            {
              exp[i]=Integer.parseInt(se[i]);
            }
            if(exp[0]>=0 && exp[0]<=23 && exp[1]>=0 && exp[1]<=59)
            {
              int d=sc.nextInt();
              if(d>=-100 && d<=100)
              {
                int del[]=new int[2];
                del[0]=d/60;
                del[1]=d%60;
                //System.out.println(del[0]);
                //System.out.println(del[1]);


                int cal[]=new int[2];
                cal[0]=cur[0]+ti[0];
                cal[1]=cur[1]+ti[1];
                if(cal[1]>=60)
                {
                  cal[0]=cal[0]+1;
                  cal[1]=cal[1]-60;
                }

                int delc[]=new int[2];
                delc[0]=exp[0]+del[0];
                delc[1]=exp[1]+del[1];
                if(delc[1]>=60)
                {
                  delc[0]=delc[0]+1;
                  delc[1]=delc[1]-60;
                }
                if(delc[1]<0)
                {
                  delc[0]=delc[0]-1;
                  delc[1]=delc[1]+60;
                }
                //System.out.println(cal[0]);
                //System.out.println(cal[1]);
                //System.out.println(delc[0]);
                //System.out.println(delc[1]);
                if(cal[0]<delc[0])
                  re[k]="Yes";
                else if(cal[0]==delc[0] && cal[1]<=delc[1])
                  re[k]="Yes";
                else
                  re[k]="No";
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
    catch(Exception e)
    {
      return;
    }
  }
}
