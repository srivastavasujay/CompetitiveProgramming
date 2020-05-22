import java.io.*;
import java.util.*;
import java.util.Arrays;

class chefing
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int re[]=new int[t];
    int sum=0;
    if(t>=1 && t<=1000)
    {
      for(int i=0;i<t;i++)
      {
        int n=sc.nextInt();
        sc.nextLine();
        if(n>=1 && n<=1000)
        {
          String s[]=new String[n];
          int c=0,flag=0;
          for(int j=0;j<n;j++)
          {
              s[j]=sc.nextLine();
            sum+=s[j].length();
            if(s[j].length()>=1 && s[j].length()<=200)
            {
              c++;
              for(int k=0;k<s[j].length();k++)
              {
                if(Character.isUpperCase(s[j].charAt(k)))
                  flag=1;
              }
            }

          if(c==n && flag==0)
          {
            int ar[]=new int[26];
            int br[]=new int[26];
            Arrays.fill(ar,0);
            Arrays.fill(br,0);

            for(int q=0;q<n;q++)
            {
              for(int k=0;k<s[q].length();k++)
              {
                int temp=(int)s[q].charAt(k);
                  if(ar[temp-97]==0)
                    ar[temp-97]++;
              }
              for(int p=0;p<26;p++)
              {
                br[p]+=ar[p];
              }
              Arrays.fill(ar,0);
            }

          for(int r=0;r<26;r++)
          {

            if(br[r]>=n)
            {
              re[i]++;
            }
          }
        }
        }
        }
      }
    }
    if(sum<=3500000)
      for(int i=0;i<t;i++)
      {
        System.out.println(re[i]);
      }
  }
}
