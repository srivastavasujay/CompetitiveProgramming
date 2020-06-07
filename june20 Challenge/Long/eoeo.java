import java.io.*;
import java.util.*;

class eoeo
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++)
      {
        long ts=Long.parseLong(br.readLine());
        long res=js(ts);
        System.out.println(res);
      }
  }
  static long js(long ts)
  {
    if((ts&(ts-1))==0)
      return 0;
    else if((ts&1)==1)
      return (ts/2);
    else
    {
      while((ts&1)==0)
        ts=ts>>1;

      return (ts/2);
    }
  }
}
