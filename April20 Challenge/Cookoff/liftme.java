import java.io.*;
import java.util.*;
import java.lang.Math;

public class liftme
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a[][]=new int[q][2];
        int cur=0,count=0;
        for(int j=0;j<q;j++)
        {
          a[j][0]=sc.nextInt();
          count+=Math.abs(a[j][0]-cur);
          cur=a[j][0];
          a[j][1]=sc.nextInt();
          count+=Math.abs(a[j][1]-cur);
          cur=a[j][1];
        }
        System.out.println(count);
      }
    }
  }
