import java.util.*;
import java.io.*;

class zubreach
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int sum=0;
    String re[]=new String[t];
    if(t>=1 && t<=10)
    {
      for(int k=0;k<t;k++)
      {
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m>=0 && m<=10000 && n>=0 && n<=10000)
        {
          int rx=sc.nextInt();
          int ry=sc.nextInt();
          if(rx>=0 && rx<=m && ry>=0 && ry<=n)
          {
            int mov=sc.nextInt();
            sc.nextLine();
            String move=sc.nextLine();
            sum+=move.length();
            int fx=0,fy=0;
            for(int i=0;i<move.length();i++)
            {
              char c=move.charAt(i);
              if(c=='U')
                fy++;
              if(c=='D')
                fy--;
              if(c=='R')
                fx++;
              if(c=='L')
                fx--;
            }
            if(fx==rx && fy==ry)
              re[k]="REACHED";
            else if(fx<0 || fx>m || fy<0 || fy>n)
              re[k]="DANGER";
            else
              re[k]="SOMEWHERE";
          }
        }
      }
    }
    if(sum>=0 && sum<=10000)
    {
      for(int i=0;i<t;i++)
      {
        if(re[i]==null)
        System.out.println(re[i]);
        else
        System.out.println("Case "+(i+1)+": "+re[i]);
      }
    }
  }
}
