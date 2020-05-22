import java.io.*;
import java.util.*;

class bug2k18c
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];
    sc.nextLine();

    if(t>=1 && t<=100)
    {
      for(int k=0;k<t;k++)
      {
        String s1=sc.nextLine();
        String s[]=s1.split(" ");

        if(s[0].length()>=1 && s[0].length()<=1000000 && s[1].length()>=1 && s[1].length()<=1000000)
        {
          int count=0,check=0;
          for(int i=0;i<s[0].length();i++)
          {
            char c=s[0].charAt(i);
            check=0;
            //System.out.println(c+"----F");
            for(int j=0;j<s[1].length();j++)
            {
              char d=s[1].charAt(j);
              //System.out.println(d);
              if(c==d)
              {
                count++;
                check=1;
                //System.out.println(".");
              }
            }
          }
          if(check==0)
          re[k]="No";
          //System.out.println(count);
          else
          {
          if(count>=s[0].length())
          re[k]="Yes";
          else
          re[k]="No";
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
