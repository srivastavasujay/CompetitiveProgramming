import java.io.*;
import java.util.*;
import java.lang.*;

class chefinsq
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int j=0;j<n;j++)
      {
        a[j]=sc.nextInt();
      }
      Arrays.sort(a);
      int ans=seq(a,n,k);
      System.out.println(ans);
    }
  }

  static int fact(int n)
  {
    return (n==1 || n==0) ? 1 : n*fact(n-1);
  }

  static int seq(int arr[],int n,int k)
  {
    int temp=arr[k-1];
    if(temp!=arr[k])
      return 1;
    else
      {
        int focc=first(arr,0,n-1,temp,n);
        int locc=last(arr,0,n-1,temp,n);
        int an=comb((locc-focc+1),(k-focc));
        //System.out.println(focc+" "+locc);
        return an;
      }
  }

  static int comb(int n,int r)
  {
    if(n>0 && r>0)
      return fact(n)/(fact(n-r)*fact(r));
    else
      return 1;
  }

  static int first(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
            int mid = low + (high - low)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
             else if(x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid -1), x, n);
        }
    return -1;
    }

    static int last(int arr[], int low, int high, int x, int n)
    {
        if (high >= low)
        {
            int mid = low + (high - low)/2;
            if (( mid == n-1 || x < arr[mid+1]) && arr[mid] == x)
                 return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid -1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
    return -1;
    }
}
