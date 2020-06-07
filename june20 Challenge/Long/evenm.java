import java.io.*;
import java.util.*;

class evenm
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
      int t=Integer.parseInt(br.readLine());
      for(int k=0;k<t;k++)
      {
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
            int x=Math.min(Math.min(i,j),Math.min(n-1-i,n-1-j));

            if(i<=j)
              log.append((n-2*x)*(n-2*x)-(i-x)-(j-x)+" ");
            else
              log.append((n-2*x-2)*(n-2*x-2)+(i-x)+(j-x)+" ");
          }
          log.append("\n");
        }
      }
      log.close();
  }
}
