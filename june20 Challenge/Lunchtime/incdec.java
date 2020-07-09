import java.io.*;
import java.util.*;

class incdec
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++)
      {
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        boolean flag=false;
        for(int j=0;j<n;j++)
        {
          a[j]=Integer.parseInt(st.nextToken());
          h.put(a[j],(h.get(a[j]))==null?1:h.get(a[j])+1);

        if(h.get(a[j])==1)
          a1.add(a[j]);
        else if(h.get(a[j])==2)
          a2.add(a[j]);
        else
            flag=true;
        }

        if(flag==true)
          System.out.println("NO");
        else
        {
          if(a2.isEmpty())
          {
            System.out.println("YES");
            Collections.sort(a1);
            for(int j=0;j<a1.size();j++)
              System.out.print(a1.get(j)+" ");
            System.out.println();
          }
        //  else if(n%2==0)
        //    System.out.println("NO");
          else
            {
              Collections.sort(a1);
              Collections.sort(a2,Collections.reverseOrder());
              if(a1.get(a1.size()-1)>a2.get(0))
              {
                System.out.println("YES");
                for(int j=0;j<a1.size();j++)
                System.out.print(a1.get(j)+" ");
              for(int j=0;j<a2.size();j++)
                  System.out.print(a2.get(j)+" ");
              System.out.println();
              }
              else
              System.out.println("NO");
            }
        }
      }
  }
  }
