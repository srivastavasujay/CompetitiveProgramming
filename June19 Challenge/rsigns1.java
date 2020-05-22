import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class rsigns1
{
  public static void main(String[] args) throws IOException
  {
      rsigns1 ob=new rsigns1();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int p=0;p<t;p++)
      {
        int k=Integer.parseInt(br.readLine());
        //System.out.println(a);
        long a=ob.power(2,k,1000000007);
        //System.out.println(a);
        long an=5*a;
        long ans=an%1000000007;
        System.out.println(ans);

      }
  }
  long power(long x,int y,long p)
  {
    long res = 1;

          while (y > 0)
          {
              if((y & 1)==1)
                  res = (res * x) % p;
                  //System.out.println(res);
              y = y >> 1;
              x = (x*x) % p;
          }
          return res;
  }
}
