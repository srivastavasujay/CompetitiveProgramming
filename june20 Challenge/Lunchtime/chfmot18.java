import java.io.*;
import java.util.*;

class chfmot18
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++)
      {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int s=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int res=0;
        if(s==1)
          System.out.println(1);
        else
        {
          while(s>0)
          {
            int temp=s/n;
            res=res+temp;
            s=s-(temp*n);
            if(s==1)
            {
              res++;
              break;
            }
            else if(s%2==1)
              n=s-1;
            else
              n=s;
          }
          System.out.println(res);
        }
      }
  }
}
