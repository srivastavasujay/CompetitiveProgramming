import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

class exam1
{
  public static void main(String[] args) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      if(t>=1 && t<=100)
      {
        for(int k=0;k<t;k++)
        {
          int n=Integer.parseInt(br.readLine());
          if(n>=1 && n<=100)
          {
            String s=br.readLine();
            String u=br.readLine();
            int c=0;

            for(int i=0;i<s.length();i++)
            {
              char ch=u.charAt(i);
              if(ch==s.charAt(i))
                c++;
              else if(ch!='N')
                i++;
            }
            System.out.println(c);
          }
        }
      }

  }
}
