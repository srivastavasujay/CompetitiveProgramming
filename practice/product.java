import java.io.*;
import java.util.*;

class product
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      int p=1000000007;
      int c=n/m;
      //System.out.println(a[4]);
      int count=1;long sum=0;
      if(n>=m)
      {
      for(int i=0;i<n;i++)
      {
          if(count==c)
            sum+=(count*a[i])%p;
          else
            {
              if(i%m==0 && i!=0)
                count++;
              sum+=(count*a[i])%p;
            }
          //System.out.println(sum+"="+count+"*"+a[i]);
      }
    }
      System.out.println(sum%p);
  }
}
