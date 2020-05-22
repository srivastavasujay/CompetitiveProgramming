import java.io.*;
import java.util.*;
import java.lang.*;

class corus
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=0;
    t=Integer.parseInt(br.readLine());
    int a[]=new int[26];
    for(int j=0;j<t;j++)
    {
      Arrays.fill(a,0);
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int q=Integer.parseInt(st.nextToken());
      String s=br.readLine();
        for(int p=0;p<s.length();p++)
        {
          char ch=s.charAt(p);
          int c=(int)ch;
          a[c-97]++;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
      for(int i=0;i<q;i++)
      {
        int k=Integer.parseInt(br.readLine());
        int sum=0;
        int l = 0;
        int r = 25;
        int leftGreater = 26;
        while (l <= r)
        {
          int m = l + (r - l) / 2;
          if (a[m] > k)
          {
            leftGreater = m;
            r = m - 1;
          }
          else
            l = m + 1;
          }
           int temp= leftGreater;
           //System.out.println(temp);
           //if(temp>0)
           //{
             for(int p=25;p>=temp;p--)
             {
               sum=sum+(a[p]-k);
               //System.out.println(a[p]-k);
             }
             System.out.println(sum);
           //}
      }
    }
  }
}
