import java.io.*;
import java.util.*;
import java.util.Arrays;

class training
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        if(t>=1 && t<=100)
        {
            for(int k=0;k<t;k++)
            {
            int n=sc.nextInt();
            int p=sc.nextInt();

            if(p>=2 && p<=1000)
            {
                int s[]=new int[n];
                int c=0;

                for(int i=0;i<n;i++)
                {
                    s[i]=sc.nextInt();
                    if(s[i]>=1 && s[i]<=10000)
                        c++;
                }
                if(c==n)
                {
                    int min=0;
                    Arrays.sort(s);
                    if(p==n)
                    {
                        for(int i=0;i<n;i++)
                        {
                            min+=s[n-1]-s[i];
                        }
                    }
                    else if(p<n)
                    {
                        for(int i=0;i<p;i++)
                        {
                            min+=s[p-1]-s[i];
                        }
                    }
                    System.out.println("Case #"+(k+1)+": "+min);
                }
            }
        }
        }
    }
}
