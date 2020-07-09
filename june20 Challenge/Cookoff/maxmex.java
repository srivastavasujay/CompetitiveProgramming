import java.io.*;
import java.util.*;

class maxmex
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++)
      {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int a[]=new int[n];
        StringTokenizer st1=new StringTokenizer(br.readLine());
        HashSet<Integer> x=new HashSet<Integer>();
        int mi=1;
        for(int j=0;j<n;j++)
        {
          a[j]=Integer.parseInt(st1.nextToken());
        //  System.out.println(a[]);
          x.add(a[j]);
          if (mi < a[j])
        {
            x.add(a[j]);
        }
        else if (mi == a[j])
        {
            mi = mi + 1;
            while (x.contains(mi))
            {
                x.remove(mi);
                mi = mi + 1;
            }
        }
        }
      //  System.out.println(Arrays.toString(a));
          Arrays.sort(a);
        //  System.out.println(Arrays.toString(a));
        if(mi==m)
          System.out.println(n);
        else
        {
          if(a[0]>=m)
            System.out.println(-1);
          else if(!x.contains(m-1))
            System.out.println(-1);
          else
            {
              int key=m-1;
              for(int j=m-2;j>mi;j--)
              {
                if(x.contains(j)==false)
                {
                  key=j+1;
                  break;
                }
                key=j;
              }
              int res=first(a,0,n-1,key,a.length);
          //    System.out.println(Arrays.toString(a));
          //    System.out.println(res+" "+key);
              System.out.println(n-res);
            }
        }
        }
      }
      public static int first(int arr[], int low, int high, int x, int n)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }
  }
