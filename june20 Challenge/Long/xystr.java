import java.io.*;
import java.util.*;

class xystr
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for (int i=0;i<t;i++ )
      {
          String str=br.readLine();
          Stack<Character> s=new Stack<Character>();
          long count=0;
          for(int j=0;j<str.length();j++)
          {
            if(s.isEmpty())
              s.push(str.charAt(j));
            else
            {
              if(pair(str.charAt(j),s.peek()))
                {
                  count++;
                  s.pop();
                }
            }
          }
          System.out.println(count);
      }
  }
  static boolean pair(char c1,char c2)
  {
    if((c1=='x' && c2=='y') || (c1=='y' && c2=='x'))
      return true;
    else
      return false;
  }
}
