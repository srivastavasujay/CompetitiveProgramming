import java.io.*;
import java.util.*;

class bitobyt
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int re[][]=new int[t][3];

    if(t>=1 && t<=10000)
    {
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        if(n>=1 && n<=140)
        {
          double bit=1;
          int nib=0,byt=0;
          int time=n/26;
          int rem=n%26;
          if(n!=26)
          {
            if(time>0)
            {
              if(rem!=0)
              bit=Math.pow(2,time);
              else
              bit=Math.pow(2,(time-1));
            }
          }
          //System.out.println(rem);
          int bi=(int)bit;
          if(rem!=1)
          {
            if(rem>=3 && rem<11)
            {
              nib=bi;bi=0;
            }
            else if((rem>=11 && rem<=25) || rem==0)
            {
              byt=bi;bi=0;
            }
          }

          re[k][0]=bi;
          re[k][1]=nib;
          re[k][2]=byt;
        }
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i][0]+" "+re[i][1]+" "+re[i][2]);
    }
  }
}
