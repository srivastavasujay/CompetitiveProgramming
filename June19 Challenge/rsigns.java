import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

class rsigns
{
  long k;
  public static void main(String[] args)
  {
    rsigns ob=new rsigns();
      Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int p=0;p<t;p++)
        {
             ob.k=sc.nextLong();
            long a=(long)Math.pow(10,ob.k);
            //System.out.println(a);
            int count=0;
            for(long i=0;i<a/2;i++)
            {
              long t1=i;
              long t2=a-i-1;
              int x=ob.cal(t1,t2);
              //System.out.println(t1+" "+t2+" "+x);
              if(x==1)
                count++;
            }
            System.out.println(2*count);
        }
  }
  int cal(long t1,long t2)
  {
    long temp1=t1,temp2=t2;
    long arr[][]=new long[10][2];
    while(t1>0 || t2>0)
    {
      int r1=(int)(t1%10);
      int r2=(int)(t2%10);
      //System.out.println(r1+" r "+r2);
      arr[r1][0]++;
      arr[r2][1]++;
      //System.out.println(arr[r1][0]+" . "+arr[r2][1]);
      t1=t1/10;
      t2=t2/10;
    }
    int count=0;
    for(int i=0;i<10;i++)
    {
        if(arr[i][0]>0 || arr[i][1]>0)
            count++;
    }
    //System.out.println("co"+count);
    if(count==2)
    {
      System.out.println(temp1+"  "+temp2);
      return 1;
    }
    else
      return 0;
  }
}
