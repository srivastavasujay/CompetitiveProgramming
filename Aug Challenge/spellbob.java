import java.io.*;
import java.util.*;

class spellbob
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    String re[]=new String[t];
    if(t>=1 && t<=20000)
    {
      for(int k=0;k<t;k++)
      {
      String top=sc.nextLine();
      String bot=sc.nextLine();
      int c=0;
      for(int i=0;i<top.length();i++)
      {
        char c1=top.charAt(i);
        char c2=bot.charAt(i);
        if(Character.isLowerCase(c1)==true && Character.isLowerCase(c2)==true)
        c++;
      }
      if(c==3)
      {
        char to[]=new char[3];
        char bo[]=new char[3];
        int count=0,b=0,o=0;
        for(int i=0;i<3;i++)
        {
          to[i]=top.charAt(i);
          bo[i]=bot.charAt(i);
        }

        for(int i=0;i<3;i++)
        {
          int check=0;
          if(to[i]=='b'|| bo[i]=='b')
          {
            count++;
            b++;
            check++;
          }
          if(to[i]=='o'|| bo[i]=='o')
          {
            count++;
            o++;
            check++;
          }
          if(check==2)
          count--;
        }
          if(count>=3 && b>=2 && o>=1)
          re[k]="yes";
          else
          re[k]="no";
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
    }
  }
}
