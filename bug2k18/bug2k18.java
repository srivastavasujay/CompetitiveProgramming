import java.io.*;
import java.util.*;

class bug2k18a
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    int re[][]=new int[t][3];

    if(t>=1 && t<=1000)
    {
      for(int k=0;k<t;k++)
      {
        String s=sc.nextLine();
        String nr[]=s.split(" ");
        int a[]=new int[nr.length];
        for(int i=0;i<nr.length;i++)
        {
          a[i]=Integer.parseInt(nr[i]);
        }

        if(a[0]>=1 && a[0]<=1000000 && a[1]>=1 && a[1]<=1000000000)
        {
          String s1=sc.nextLine();
          String nr1[]=s1.split(" ");
          int b[]=new int[nr1.length];
          for(int i=0;i<nr1.length;i++)
          {
            b[i]=Integer.parseInt(nr1[i]);
          }
          re[k][0]=a[0];

          int count=0;
          for(int i=0;i<b.length;i++)
          {
            if(b[i]<=a[1])
            count++;
          }
          re[k][1]=count;
          re[k][2]=count;
        }
      }
    }
    for(int i=0;i<t;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.print(re[i][j]+" ");
      }
      System.out.println();
    }
  }
}
