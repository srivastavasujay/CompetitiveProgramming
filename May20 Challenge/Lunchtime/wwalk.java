import java.io.*;
import java.util.*;
import java.lang.*;

class wwalk
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
        int sa=0;
        int sb=0;
        int count=0;
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int b[]=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++)
        {
          a[j]=Integer.parseInt(st.nextToken());
        }
    //   System.out.println(Arrays.toString(a));
        StringTokenizer st1=new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++)
        {
          b[j]=Integer.parseInt(st1.nextToken());
        }
//System.out.println(Arrays.toString(b));
        for(int j=0;j<n;j++)
        {
      //    System.out.println(sa+"  "+sb);
          if(sa==sb && a[j]==b[j])
          {
            count+=a[j];
          }
          sa+=a[j];
          sb+=b[j];
        }
        System.out.println(count);
    }
  }
}
