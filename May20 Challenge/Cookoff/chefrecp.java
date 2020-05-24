import java.io.*;
import java.util.*;
import java.lang.*;

class chefrecp
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
      int n=Integer.parseInt(br.readLine());
      int a[]=new int[n];int count=1;
      StringTokenizer st=new StringTokenizer(br.readLine());
      ArrayList<Integer> m=new ArrayList<Integer>();
      ArrayList<Integer> c=new ArrayList<Integer>();
      a[0]=Integer.parseInt(st.nextToken());
      m.add(0,a[0]);
      for(int j=1;j<n;j++)
      {
         a[j]=Integer.parseInt(st.nextToken());
        int temp=a[j];
        if(temp!=(m.get(m.size()-1)))
        {
          c.add(count++);
          m.add(temp);
          count=1;
        }
        else
          count++;
      }
      if(m.size()!=c.size())
        c.add(count);
      Set<Integer> cSet = new HashSet<Integer>(c);
      Set<Integer> mSet=new HashSet<Integer>(m);

      if((cSet.size()==c.size()) && mSet.size()==m.size())
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}
