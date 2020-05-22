import java.io.*;
import java.util.*;

class ansleak
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int arr[][]=new int[n][k];
        int re[]=new int[n];
        for(int j=0;j<n;j++)
        {
          for(int l=0;l<k;l++)
          {
            arr[j][l]=sc.nextInt();
          }
          int temp=k-arr[j][0];
          if(temp==0)
            temp=arr[j][0]-1;
          if(j==0)
            re[j]=arr[j][0];
            else
                re[j]=temp;
          System.out.println(temp);
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(re[j]+" ");
        }
        System.out.println();
    }
}
}
