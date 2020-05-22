import java.io.*;
import java.util.*;

class nmax
{
  public static void main(String[] args) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for (int p=0;p<t;p++ )
      {
          int n=Integer.parseInt(br.readLine());
          int k=Integer.parseInt(br.readLine());
          int x=k%n;

          if(x==0)
            System.out.println("0");
          else if(x==1 || x==n-1)
            System.out.println("2");
          else
          {
            int c=4;
            if(n%2==0)
            {
              if(x==n/2)
                System.out.println(n-1);
              else
                {
                  for(int i=2;i<n/2;i++)
                  {
                    if(x==i || x==n-i)
                    {
                      System.out.println(c);
                      break;
                    }
                    c=c+2;
                  }
                }
            }
            else
            {
              for(int i=2;i<=n/2;i++)
              {
                if(x==i || x==n-i)
                {
                  System.out.println(c);
                  break;
                }
                c=c+2;
              }
            }
          }
        }
          }
      }
