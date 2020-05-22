import java.io.*;
import java.util.*;

public class Solution {
    
    int prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
            int prime=0;
        
        String s=sc.nextLine();
        String str[]=s.split(" ");
        int a[]=new int[2];
        a[0]=Integer.parseInt(str[0]);
        a[1]=Integer.parseInt(str[1]);
        
        if(a[0]>=1 && a[0]<=a[1] && a[1]<=100000)
        {
        
        for(int i=a[0];i<=a[1];i++)
        {
            int count=0,m=i;
            int x=obj.prime(i);
            
            while(m>0)
            {
                count++;
                m=m/10;
            }
            
            
            if(x==1)
            {
                int sum=0;
                while(i>0)
                {
                    int r=i%10;
                    int y=obj.prime(r);
                    sum=sum+y;
                }
                
                if(sum==count)
                    prime++;
            }
            
            
        }
        }
        System.out.println(prime);
        
    }
}