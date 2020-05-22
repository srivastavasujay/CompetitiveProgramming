import java.util.*;
import java.io.*;

class dwnld
{
  public static void main(String args[])
  {
    try{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int re[]=new int[t];
    sc.nextLine();
    if(t>=1 && t<=1000)
    {
      for(int k=0;k<t;k++)
      {
      String s1=sc.nextLine();
      String s[]=s1.split(" ");
      int nk[]=new int[s.length];
      for(int i=0;i<s.length;i++)
      {
        nk[i]=Integer.parseInt(s[i]);
      }
      if(nk[0]>=1 && nk[1]<=10)
      {
        int sum=0,c=0;
        int a[][]=new int[nk[0]][2];
        for(int j=0;j<nk[0];j++)
        {
          String str1=sc.nextLine();
          String str[]=str1.split(" ");
          a[j][0]=Integer.parseInt(str[0]);
          a[j][1]=Integer.parseInt(str[1]);

          if(a[j][0]>=1 && a[j][0]<=10 && a[j][1]>=1 && a[j][1]<=10)
            c++;

          sum=sum+a[j][1];
        }
        if(nk[1]>=0 && nk[1]<=sum && c==nk[0])
        {
            int cost=0,st=0,check=0;

            for(int i=0;i<nk[0];i++)
            {
              a[i][0]=a[i][0]-nk[1];

              if(a[i][0]<=0)
              {
                st=i;
                check=1;
                break;
              }
            }

            int temp=0;

            if(check==1)
            {
              temp=st+1;
              a[(st+1)][0]=a[(st+1)][0]+a[st][0];
            }
            else
              temp=st;

            for(int i=temp;i<nk[0];i++)
            {
              cost=cost+(a[i][0]*a[i][1]);
            }
            re[k]=cost;
        }
      }
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
  }catch(Exception e){
    return;
  }
  }
}
