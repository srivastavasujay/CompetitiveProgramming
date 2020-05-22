import java.util.*;
import java.io.*;
class villagetribe
{
 
     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
         int n=1;
         if(sc.hasNextInt())
         n=sc.nextInt();
         int ar[]=new int[n];
         int br[]=new int[n];
         if(n>=1 && n<=20)
         {
             for(int i=0;i<n;i++)
             {
                 String s="";
                 if(sc.hasNext())
                 s=sc.next();
             if(s.length()>=1 && s.length()<=100000)
             {
                 int a=0,b=0;
                 for(int j=0;j<s.length();j++)
                 {
                     char c=s.charAt(j);
                     if((int)c==65)
                     {
                         a++;int count=0;
                         for(int k=j+1;k<s.length();k++)
                         {
                             char d=s.charAt(k);
                             if((int)d==66)
                             break;
                             if((int)d==65)
                             {
                             a=a+count;
                             break;
                             }
                             count++;
                             
                         }
                     }
                     
                     if((int)c==66)
                     {
                         b++;int count=0;
                         for(int k=j+1;k<s.length();k++)
                         {
                             char d=s.charAt(k);
                             if((int)d==65)
                             break;
                             if((int)d==66)
                             {
                             b=b+count;
                             break;
                             }
                             count++;
                         }
                     }
                 }
                 ar[i]=a;br[i]=b;
             }
             }
             for(int i=0;i<n;i++)
             {
              System.out.println(ar[i]+" "+br[i]);
              }
         }
         
     }
} 