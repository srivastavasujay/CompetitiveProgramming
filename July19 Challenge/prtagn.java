import java.io.*;
import java.util.*;
import java.lang.*;

class prtagn
{
  public static void main(String[] args) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int p=0;p<t;p++)
      {
        int q=Integer.parseInt(br.readLine());
        int e=0,o=0;
        Vector<Integer> v = new Vector<>();
        for(int k=0;k<q;k++)
        {
          int x=Integer.parseInt(br.readLine());
          int count;
          if(k==0)
          {
            v.add(x);
             count=countSetBits(x);
            if(count%2==0)
              e++;
            else
              //System.out.println(x+"!");
              o++;
          }
          else
          {
            int size=v.size();
            for(int i=0;i<size;i++)
            {
              int xo=v.get(i)^x;
              if(v.indexOf(xo)==-1)
              {
                v.add(xo);
                //Collections.sort(v);
                count=countSetBits(xo);
                if(count%2==0)
                  e++;
                else
                  //System.out.println(xo+"!");
                  o++;
              }
            }
           if(v.indexOf(x)==-1)
            {
              v.add(x);
              //Collections.sort(v);
              count=countSetBits(x);
              if(count%2==0)
                e++;
              else
                //System.out.println(x+"!");
                o++;
            }
          }
          System.out.println(e+" "+o);
        }
      }
  }
  static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            n &= (n - 1) ;
            count++;
        }
        return count;
    }
}
