import java.util.*;
import java.io.*;

class encmsg
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];
    if(t>=1 && t<=1000)
    {
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        if(n>=1 && n<=100)
        {
          sc.nextLine();
          String s=sc.nextLine();
          String s1="";
          if(s.length()==n)
          {
            int len=0;
            if(s.length()%2==0)
              len=s.length()-2;
            else
              len=s.length()-3;
            for(int i=0;i<=len;i=i+2)
            {
              char t1=s.charAt(i);
              char t2=s.charAt(i+1);

              s1+=t2;
              s1+=t1;
            }
            if(len==s.length()-3)
              s1+=s.charAt(s.length()-1);

            //System.out.println(s1);
            String s2="";
            for(int i=0;i<s1.length();i++)
            {
              int temp;char f;
              int c=(int)(s1.charAt(i));

                temp=(122-c);
                f=(char)(97+temp);
                s2+=f;
            }
            re[k]=s2;
          }
        }
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
  }
}
