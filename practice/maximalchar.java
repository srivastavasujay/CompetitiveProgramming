import java.io.*;
import java.util.*;

class maximalchar
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      String str=sc.nextLine();
      str=str.toLowerCase();
      int q=sc.nextInt();
      for(int i=0;i<q;i++)
      {
        int beg=sc.nextInt();
        int end=sc.nextInt();
        //System.out.println(n+" "+str+" "+q+" "+beg+" "+end);
        int max=0;
        int count[]=new int[26];
        for(int j=beg;j<=end;j++)
        {
          char ch=str.charAt(j);
          int c=(int)ch;
          count[c-97]++;
          if(max<c)
            max=c;
        }
        System.out.println(count[max-97]);
      }
  }
}
