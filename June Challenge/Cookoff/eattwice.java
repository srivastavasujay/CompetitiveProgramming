import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class eattwice
{
  public static void main(String[] args) throws IOException
  {
      //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      if(t>=1 && t<=1000)
      {
          for(int k=0;k<t;k++)
          {
            int n=sc.nextInt();
            int m=sc.nextInt();

            //if(n>=2 && n<=100000 && m>=2 && m<=100000)
            //{
              int d1=-1,d2=-1,max1=-1,max2=-1;
              //int d2=sc.nextInt();
              //int v2=sc.nextInt();
              int d,v;
              for(int i=0;i<n;i++)
              {
                d=sc.nextInt();
                v=sc.nextInt();
                if(v>=max1)
                {
                  if(d==d1)
                    max1=v;
                  else
                  {
                    max2=max1; d2=d1;
                    max1=v; d1=d;
                  }
                }
                else if(v>max2)
                {
                  max2=v;
                  d2=d;
                }
              }

            System.out.println(max1+max2);
          }
              /*Arrays.sort(dv,new Comparator<int[]>() {
                public int compare(int[] o1,int[] o2)
                {
                  int q1=o1[1];
                  int q2=o2[1];
                  return q1-q2;
                }
              });*/

              /*for(int i=0;i<n;i++)
              {
                for(int j=0;j<2;j++)
                {
                  System.out.print(dv[i][j]+" ");
                }
                System.out.println();
              }*/
            //}
          }
      }
  }
