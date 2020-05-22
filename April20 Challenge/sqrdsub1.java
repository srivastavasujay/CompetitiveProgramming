import java.io.*;
import java.util.*;

public class sqrdsub1
{
  static int subArray( int n,int arr[])
  {
    int count=0;
      for (int i=0; i <n; i++)
      {
          for (int j=i; j<n; j++)
          {
              long pro=1;
              for (int k=i; k<=j; k++)
              {
                pro=pro*arr[k];
              }
              pro=pro%4;
              if(pro!=2 && pro!=-2)
                //System.out.println(pro);
                count++;
          }
      }
      return count;
  }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++)
        {
          a[j]=sc.nextInt();
        }
        int c=subArray(a.length,a);
        System.out.println(c);
      }
    }
}
