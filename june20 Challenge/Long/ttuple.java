import java.io.*;
import java.util.*;

class ttuple
{
  public static void main(String[] args)throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int k=0;k<t;k++)
      {
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int a[]=new int[3];int b[]=new int[3];
        int m[]=new int[3];int d[]=new int[3];int r[]=new int[3];

        for(int i=0;i<3;i++)
        {
          a[i]=Integer.parseInt(st.nextToken());
          b[i]=Integer.parseInt(st1.nextToken());
          if(a[i]!=0)
          {m[i]=b[i]/a[i];
          d[i]=b[i]-a[i];
          r[i]=b[i]%a[i];}
        }
    /*    System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(r));*/
        if(Arrays.equals(a,b))
          System.out.println(0);
        else
        {
    /*    boolean m1=false;
        boolean d1=false;
        boolean r1=false;
        boolean r2=false;
        m1=count(m);
        d1=count(d);
        r1=count(r);
        r2=countr(r);*/

        boolean d1=countd(d);
        boolean m1=countm(m);
        boolean r1=countr(r);
        boolean m2=countm2(m);
        boolean d2=countd2(d);

        boolean r3=countr3(r);
        boolean r4=same(r);
        boolean m3=countm3(m);
        //case1

        if(d1 || (r1 && m1))
        {
          System.out.println(1);
        }
        //case 2
        else
        {
          if(r1 && m2)
            System.out.println(2);
          else if(d2)
            System.out.println(2);
          else if(m3 && (r3 || r4))
            System.out.println(2);
          else
            System.out.println(3);
        }
        }
      }
  }

  static boolean countd(int m[])
  {
    int c=0;int zero=0;
    //zero=0;
  //  if(m[0]>=0)
  //  {
      if(m[0]==0)
      zero++;
      if (m[0]==m[1] || m[0]==m[2])
      c++;
//    }
  //  else
  //    check=true;

//    if(m[1]>=0)
//    {
      if(m[1]==0)
      zero++;
      if(m[1]==m[0] || m[1]==m[2])
      c++;
//    }
//    else
  //    check=true;

//    if(m[2]>=0)
//    {
    if(m[2]==0)
        zero++;
    if (m[2]==m[1] || m[0]==m[2])
        c++;
  //  }
//    else
  //  check=true;

    if(c==3 || (zero==1 && c==2) || (zero==2))
      return true;
    else
      return false;
  }



  static boolean countm(int m[])
  {
    int c=0;int one=0;

   if(m[0]==1)
      one++;
   if (m[0]==m[1] || m[0]==m[2])
      c++;

    if(m[1]==1)
      one++;
      if(m[1]==m[0] || m[1]==m[2])
      c++;

    if(m[2]==1)
        one++;
    if (m[2]==m[1] || m[0]==m[2])
        c++;

    if(one>=2 || (one==1 && c==2) || c==3)
      return true;
    else
      return false;
  }



  static boolean countr(int r[])
  {
    boolean zero=false;
    if(r[0]==0 && r[1]==0 && r[2]==0)
      zero=true;

    return zero;
  }

  static boolean countm2(int m[])
  {
    int count=0;
    if(m[0]==m[1] || m[0]==m[2])
      count++;
    if(m[1]==m[0] || m[1]==m[2])
      count++;
    if(m[2]==m[0] || m[2]==m[1])
      count++;

    if(count==2)
      return true;
    else
      return false;
  }

  static boolean countd2(int m[])
  {
    int gz=0;int count=0;

    if(m[0]==0)
      gz++;
    if(m[0]==m[1] || m[0]==m[2])
      count++;

    if(m[1]==0)
        gz++;
    if(m[0]==m[1] || m[1]==m[2])
        count++;

    if(m[2]==0)
        gz++;
    if(m[0]==m[2] || m[1]==m[2])
        count++;

    if(count==2 || (gz==1 && count==0))
      return true;
    else
      return false;
  }

  static boolean countr3(int r[])
  {
    int zero=0,c=0;

    if(r[0]==0)
      zero++;
    if(r[0]==r[1] || r[0]==r[2])
      c++;

    if(r[1]==0)
        zero++;
    if(r[0]==r[1] || r[1]==r[2])
        c++;

    if(r[2]==0)
        zero++;
    if(r[2]==r[0] || r[1]==r[2])
        c++;

    if((zero==1 && c==0) || c==2)
      return true;
    else
      return false;
  }

  static boolean same(int r[])
  {
    if(r[0]==r[1] && r[1]==r[2])
      return true;
    else
      return false;
  }

  static boolean countm3(int m[])
  {
    int one=0;int c=0;

    if(m[0]==1)
      one++;
    if(m[0]==m[1] || m[0]==m[2])
      c++;

      if(m[1]==1)
        one++;
      if(m[0]==m[1] || m[1]==m[2])
        c++;

        if(m[2]==1)
          one++;
        if(m[0]==m[2] || m[1]==m[2])
          c++;

      if((one==1 && c==2) || (one==1 && c==0) || one==2)
          return true;
      else
        return false;

  }
}
