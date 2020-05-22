import java.io.*;
import java.util.*;

class proxyc
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int che=0;
    int res[][]=new int[t][2];
    if(t>=1 && t<=200)
    {
      for(int k=0;k<t;k++)
      {
        che=0;
        int d=sc.nextInt();
        //Vector<Integer> pr=new Vector<Integer>;
        if(d>=1 && d<=1000)
        {
          sc.nextLine();
          String s=sc.nextLine();
          int c=0,p=0;
          for(int i=0;i<s.length();i++)
          {
            char ch=s.charAt(i);
            if(ch=='P')
            {
              //pr.add(i);
              c++;
              p++;
            }
            else if(ch=='A')
              c++;
          }
          if(c==d)
          {
            che=1;
            int per=(p*100)/d;
            //System.out.println(per);
            if(per>=75)
            {
              res[k][0]=0;
              res[k][1]=che;
            }
            else
            {
            int count=0;
            for(int i=2;i<d-2;i++)
            {
              if(s.charAt(i)=='A' && ((s.charAt(i-1)=='P' || s.charAt(i-2)=='P') && (s.charAt(i+1)=='P'|| s.charAt(i+2)=='P')))
                {
                   per=((++p)*100)/d;
                  count++;
                  //System.out.println(per+"  "+p+" "+count+" "+i);
                  if(per>=75)
                  {
                    res[k][0]=count;
                    res[k][1]=che;
                    break;
                  }
                }
            }
          }
             per=(p*100)/d;
            if(per<75)
            {
              res[k][0]=-1;
              res[k][1]=che;
            }
          }
        }
      }
    }
    for(int i=0;i<t;i++)
    {
      if(res[i][1]==1)
        System.out.println(res[i][0]);
      else
        System.out.println((String)null);
    }
  }
}
