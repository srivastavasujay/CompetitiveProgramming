import java.io.*;
import java.util.*;

class chfm
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      chfm ob=new chfm();
      int t=sc.nextInt();
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          sum+=a[i];
        }
        //Arrays.sort(a);
        int mean=sum/n;
        if(sum%n==0)
        {
          //int ans=ob.binary(a,0,n-1,mean);
          int ans=ob.linear(a,mean,n);
            if(ans==-1)
          System.out.println("Impossible");
          else
          System.out.println(++ans);
        }
        else
          System.out.println("Impossible");
      }
  }
  int linear(int a[],int x,int n)
  {
    for(int i=0;i<n;i++)
    {
      if(a[i]==x)
        return i;
    }
    return -1;
  }
  int binary(int a[],int l,int r,int x)
  {
    if(r>=l)
    {
      int mid=l+(r-l)/2;

      if(a[mid]==x)
        return mid;

      if(a[mid]>x)
        return binary(a,l,mid-1,x);

      return binary(a,mid+1,r,x);
    }
    return -1;
  }
}
