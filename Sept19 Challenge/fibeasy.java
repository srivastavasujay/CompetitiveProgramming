import java.io.*;
import java.util.*;
import java.lang.*;

class fibeasy
{

  public static void main(String[] args)
  {
      fibeasy ob=new fibeasy();
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int a[]=new int[60];
      a[0]=0;a[1]=1;
      //System.out.println(a[0]+"\n"+a[1]);
      for(int i=2;i<60;i++)
      {
        a[i]=(a[i-1]+a[i-2])%10;
        //System.out.println(a[i]);
      }
      for(int i=0;i<t;i++)
      {
        int n=sc.nextInt();
        int l=(int)(Math.log(n)/Math.log(2));
        int el=(int)Math.pow(2,l);
        if(el>=60)
        {
          int no=el%60;
          System.out.println(a[no-1]);
        }
        else
          System.out.println(a[el-1]);
      }
  }
}
