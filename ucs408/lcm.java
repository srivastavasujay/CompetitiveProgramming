import java.io.*;
import java.util.*;

class lcm
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,c,x1,x2,m;
    a=1;c=3;
    m=sc.nextInt();
    x1=sc.nextInt();

    for(int i=0;i<15;i++)
    {
      x2=(a*x1+c)%m;
      System.out.println(x2);
      x1=x2;
    }
  }
}
