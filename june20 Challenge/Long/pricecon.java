import java.io.*;
import java.util.*;

class pricecon
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++)
      {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int a[]=new int[n];
        StringTokenizer st1=new StringTokenizer(br.readLine());
        long sum=0;
        for(int j=0;j<n;j++)
        {
          a[j]=Integer.parseInt(st1.nextToken());
          if(a[j]>k)
            sum+=(a[j]-k);
        }
        System.out.println(sum);
      }
  }
}
