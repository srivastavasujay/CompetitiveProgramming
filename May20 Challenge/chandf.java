import java.io.*;
import java.util.*;
import java.lang.*;

class chandf
{
  static class Reader
  {
      final private int BUFFER_SIZE = 1 << 16;
      private DataInputStream din;
      private byte[] buffer;
      private int bufferPointer, bytesRead;

      public Reader()
      {
          din = new DataInputStream(System.in);
          buffer = new byte[BUFFER_SIZE];
          bufferPointer = bytesRead = 0;
      }

      public Reader(String file_name) throws IOException
      {
          din = new DataInputStream(new FileInputStream(file_name));
          buffer = new byte[BUFFER_SIZE];
          bufferPointer = bytesRead = 0;
      }

      public String readLine() throws IOException
      {
          byte[] buf = new byte[64]; // line length
          int cnt = 0, c;
          while ((c = read()) != -1)
          {
              if (c == '\n')
                  break;
              buf[cnt++] = (byte) c;
          }
          return new String(buf, 0, cnt);
      }

      public int nextInt() throws IOException
      {
          int ret = 0;
          byte c = read();
          while (c <= ' ')
              c = read();
          boolean neg = (c == '-');
          if (neg)
              c = read();
          do
          {
              ret = ret * 10 + c - '0';
          }  while ((c = read()) >= '0' && c <= '9');

          if (neg)
              return -ret;
          return ret;
      }

      public long nextLong() throws IOException
      {
          long ret = 0;
          byte c = read();
          while (c <= ' ')
              c = read();
          boolean neg = (c == '-');
          if (neg)
              c = read();
          do {
              ret = ret * 10 + c - '0';
          }
          while ((c = read()) >= '0' && c <= '9');
          if (neg)
              return -ret;
          return ret;
      }

      public double nextDouble() throws IOException
      {
          double ret = 0, div = 1;
          byte c = read();
          while (c <= ' ')
              c = read();
          boolean neg = (c == '-');
          if (neg)
              c = read();

          do {
              ret = ret * 10 + c - '0';
          }
          while ((c = read()) >= '0' && c <= '9');

          if (c == '.')
          {
              while ((c = read()) >= '0' && c <= '9')
              {
                  ret += (c - '0') / (div *= 10);
              }
          }

          if (neg)
              return -ret;
          return ret;
      }

      private void fillBuffer() throws IOException
      {
          bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
          if (bytesRead == -1)
              buffer[0] = -1;
      }

      private byte read() throws IOException
      {
          if (bufferPointer == bytesRead)
              fillBuffer();
          return buffer[bufferPointer++];
      }

      public void close() throws IOException
      {
          if (din == null)
              return;
          din.close();
      }
  }


  static int countBits(long n)
    {
        int count = 0;
        while (n != 0)
        {
            count++;
            n >>= 1;
        }

        return count;
    }
  static void setbits(long n,int size,int b[])
  {
    for(int i=0;i<size;i++)
    {
      if((n&(1<<i))!=0)
        b[i]=1;
    }
  }

  static long makenum(int s,int b[])
  {
    long num=0;
    //System.out.println(s);
    for(int i=s-1;i>=0;i--)
    {
      if(b[i]==1)
      {
        num=num | (1<<i);
    //    if(num>r)
    //      num=num&(~(1<<i));
        //System.out.println(num);
      }
    }
    return num;
  }

  public static void main(String[] args) throws IOException
  {
    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Reader s=new Reader();
    int t=s.nextInt();
    for(int k=0;k<t;k++)
    {
    //  StringTokenizer st=new StringTokenizer(br.readLine());
      long x=s.nextLong();
      long y=s.nextLong();
      long l=s.nextLong();
      long r=s.nextLong();
      long max=0,min=0;
    //  int bx=countBits(x);
    //  int by=countBits(y);
      //int bl=countBits(l);
    //  int brr=countBits(r);
      int size=0,sizemin=0;
      if (y>x)

        {max=y;min=x;}
      else
        {max=x;min=y;}

        sizemin=countBits(min);
        size=countBits(max);
        int b[]=new int[size];
        setbits(max,size,b);
        setbits(min,sizemin,b);
        long res=makenum(size,b);
        System.out.println(Arrays.toString(b));
        System.out.println(res);
      /*  setbits(x,bx,b);
      setbits(y,by,b);
      //System.out.println(Arrays.toString(b));
    int res=0;
      if(brr>size)
        res=makenum(size,b,r);
      else
        res=makenum(brr,b,r);
      System.out.println(res);*/
    }
  }
}
