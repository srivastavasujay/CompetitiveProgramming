import java.io.*;
import java.util.*;

public class sqrdsub
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[][]=new int[n][n];
        int count=0;
        for(int j=0;j<n;j++)
        {
          a[j]=sc.nextInt();
            b[0][j]=a[j];
            int ce=a[j]%4;
            if(ce!=2 && ce!=-2)
                count++;

        }
        //System.out.println(b[0][0]+" "+b[0][1]+" "+b[0][2]);
        int te=n-1;
        for(int i=1;i<n;i++)
        {
          int j=0,temp=i;
          while(j<te)
          {
          b[i][j]=b[i-1][j]*b[0][temp];
          int tem=b[i][j]%4;
          if(tem!=2 && tem!=-2)
            count++;
          temp++;
          j++;
          }
          te--;
        }
        System.out.println(count);
      }
    }
}
