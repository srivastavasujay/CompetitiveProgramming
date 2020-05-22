import java.util.*;

class coderlif
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];
    sc.nextLine();
    if(t>=1 && t<=1000)
    {
      for(int k=0;k<t;k++)
      {
        String str=sc.nextLine();
        //String s[]=str.split(" ");
        //int code[]=new code[s.length];
        int c=0;
        for(int i=0;i<str.length();i=i+2)
        {
          if(str.charAt(i)=='1')
          {
            c++;
            if(c>5)
            break;
          }
          else if(str.charAt(i)=='0')
            c=0;
        }
        if(c>5)
        re[k]="#coderlifematters";
        else
        re[k]="#allcodersarefun";
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
  }
}
