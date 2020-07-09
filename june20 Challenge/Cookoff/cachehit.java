import java.io.*;
import java.util.*;

class cachehit
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++)
      {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int a[]=new int[m];
        StringTokenizer st1=new StringTokenizer(br.readLine());
        a[0]=Integer.parseInt(st1.nextToken());
        int curr=a[0]/b;int count=1;
        for(int j=1;j<m;j++)
        {
            a[j]=Integer.parseInt(st1.nextToken());
            if((a[j]/b)!=curr)
            {
              count++;
              curr=(a[j]/b);
            }
        }
        System.out.println(count);
      }
  }
}
