import java.io.*;
import java.util.*;
import java.lang.*;

class convstr
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++)
    {
      int n=Integer.parseInt(br.readLine());
      int check=0;
      String a=br.readLine();
      String b=br.readLine();
      int count[]=new int[26];
      int countb[]=new int[26];
      int temp=0;
      for(int j=0;j<n;j++)
      {
        count[(int)a.charAt(j)-97]=1;
        if(countb[(int)b.charAt(j)-97]==0)
          temp++;
        countb[(int)b.charAt(j)-97]=1;
      }

      for(int j=0;j<26;j++)
      {
        if(count[j]==0 && countb[j]==1)
        {
          check=1;
          break;
        }
      }
      if(check==1)
        System.out.println(-1);
      else
      {
        System.out.println(temp);
        for(int j=0;j<26;j++)
        {
         if(countb[j]==1)
        {

          char ch=(char)(j+97);
          ArrayList<Integer> m=new ArrayList<Integer>();
          for(int k=0;k<n;k++)
          {
            if(a.charAt(k)==ch || b.charAt(k)==ch)
            {
              m.add(k);
            }
          }
          System.out.print(m.size()+" ");
          for(int x:m)
            System.out.print(x+" ");
          System.out.println();
        }
      }
    }
    }
    }
  }
