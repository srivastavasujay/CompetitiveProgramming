import java.io.*;
import java.util.*;

class meanmedian
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,c,x1,x2,m;
    int sum=0;
    a=1;c=3;
    m=sc.nextInt();
    x1=sc.nextInt();
    int ar[]=new int[50];
    ar[0]=x1;
    int mean,median;

    for(int i=0;i<50;i++)
    {
      if(i>0)
      {
      x2=(a*x1+c)%m;
      sum+=x2;
      if(x2<x1)
      {
        int temp=ar[i-1];
        ar[i-1]=x2;
        ar[i]=temp;
      }
      else
      {
        ar[i]=x2;
      }
      System.out.println(x2);
      x1=x2;
      }
    }
    mean=sum/50;
    median=(ar[25]+ar[26])/2;
    System.out.println("Mean: "+mean);
    System.out.println("Median: "+median);
  }
}
