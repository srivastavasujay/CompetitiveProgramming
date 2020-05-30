import java.io.*;
import java.util.*;
import java.lang.*;

class lostwknd
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
      int a[]=new int[5];
      int sum=0;
      StringTokenizer st=new StringTokenizer(br.readLine());
      for(int j=0;j<5;j++)
      {
        a[j]=Integer.parseInt(st.nextToken());
        sum+=a[i];
      }
      int p=Integer.parseInt(st.nextToken());
      if((sum*p)<=120)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
  }
}
