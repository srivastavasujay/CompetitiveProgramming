import java.io.*;
import java.util.*;

class cheficrm
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for (int i=0;i<t;i++ )
      {
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a[]=new int[n];
        for(int j=0;j<n;j++)
        {
          a[j]=Integer.parseInt(st.nextToken());
        }
        boolean ice=icecream(a,n);
        if(ice)
          System.out.println("YES");
        else
          System.out.println("NO");
      }
  }
  static boolean icecream(int a[],int n)
  {
    Stack<Integer> s5=new Stack<Integer>();
    Stack<Integer> s10=new Stack<Integer>();
    for(int i=0;i<n;i++)
    {
      if(a[i]==5)
        s5.push(a[i]);
      else if(a[i]==10)
      {
        int temp=a[i];
        while(!s5.isEmpty() && temp!=5)
        {
          temp=temp-s5.pop();
        }
        if(temp==5)
          s10.push(a[i]);
        else
          return false;
      }
      else
      {
        int temp=a[i];
        while(!s10.isEmpty() && temp!=5)
          temp=temp-s10.pop();

        if(temp!=5)
        {
          while(!s5.isEmpty() && temp!=5)
            temp=temp-s5.pop();

          if(temp!=5)
            return false;
        }
      }
    }
    return true;
  }
}
