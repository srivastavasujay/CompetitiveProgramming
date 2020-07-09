import java.io.*;
import java.util.*;

class guessg
{
  public static void main(String[] args)throws IOException
  {
    //  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);
      int l1=1,l2=1;
      int n=0;
      if(sc.hasNextInt())
       n=sc.nextInt();
      int h1=n,h2=n;
      int i=0;
      while(i<300)
      {
        if(i%2==0)
        {
          int m=(l1+h1)/2;
            System.out.println(m);
          char ch=sc.next().charAt(0);
          if(ch=='E')
            break;
          else if(ch=='L')
              h1=m-1;
          else
            l1=m+1;
        }
        else
        {
          int m=(l2+h2)/2;
          System.out.println(m);
          char ch=sc.next().charAt(0);
          if(ch=='E')
            break;
          else if(ch=='L')
              h2=m-1;
          else
            l2=m+1;

        }
        i++;
      }
  }
}
