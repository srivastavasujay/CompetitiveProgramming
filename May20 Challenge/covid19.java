import java.io.*;
import java.util.*;
import java.lang.*;

class covid19
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int k=0;k<t;k++)
    {
      int n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      int b[]=new int[n];
      b[0]=1;
      int count=1,min=1,max=1,flag=0;
      StringTokenizer st=new StringTokenizer(br.readLine());
      a[0]=Integer.parseInt(st.nextToken());
      for(int i=1;i<n;i++)
      {
        a[i]=Integer.parseInt(st.nextToken());
        int diff=a[i]-a[i-1];

        if(diff<=2)
          count++;
        else
        {
          if(count>max)
            max=count;
          if(flag==0)
          {
            min=count;
            flag=1;
          }
          else
          {
            if(count<min)
              min=count;
          }
          count=1;
        }
        //System.out.println(count);
      }
      if(count==n)
      {
        min=n;
        max=n;
      }
      if(count>max)
        max=count;
        if(count<min)
            min=count;
      System.out.println(min+" "+max);
    }
  }
}
