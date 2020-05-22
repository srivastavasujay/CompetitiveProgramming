import java.io.*;
import java.util.*;

class chserve
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];

    for(int k=0;k<t;k++)
    {
      int p1=sc.nextInt();
      int p2=sc.nextInt();
      int k1=sc.nextInt();
      if(p1>=0 && p1<=1000000000 && p2>=0 && p2<=1000000000 && k1>=1 && k1<=1000000000)
      {
        int s=(p1+p2)/k1;
        if(s%2==0)
          re[k]="CHEF";
        else
          re[k]="COOK";
      }
    }

    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
  }
}
