import java.io.*;
import java.util.*;
import java.lang.*;

class trplsrt1
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

  public static void main(String[] args) throws IOException
  {
    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Reader s=new Reader();
    int t=s.nextInt();
      for(int l=0;l<t;l++)
   {

     int n=s.nextInt();
     int k=s.nextInt();
     int a[]=new int[n];
     int b[]=new int[n];
     int count=0;

     for(int i=0;i<n;i++)
     {
       a[i]=s.nextInt();
       if(a[i]!=(i+1))
       {
        b[i]=1;
        count++;
      }
     }
     int cycles=0;
     int temp=0,i=0;String str="";int bre=0;
    // System.out.println(Arrays.toString(a));
    outerloop:
    while(i<n)
    {
      while(a[i]!=(i+1))
      {
        if(cycles>k-1)
       {
         bre=1;
           break outerloop;
         }

        cycles++;
        int x=a[i];//x=2
        int y=a[x-1];//y=1
        if(y!=(i+1))
        {
          a[i]=a[y-1];
          //if(a[i]==(i+1)
          a[x-1]=x;
          a[y-1]=y;
          temp=temp+2;
          b[x-1]=0;
          b[y-1]=0;
          //res[0]=i+1;res[1]=x;res[2]=y;
          str+=Integer.toString(i+1)+" "+Integer.toString(x)+" "+Integer.toString(y);
          //str+=(Arrays.toString(res))+"\n";
        }
        else
        {
          for(int j=i+1;j<b.length;j++)
          {
            if(b[j]==1 && j!=(x-1))
            {
              int y1=a[j];
              a[i]=y;
              a[x-1]=y1;
              a[j]=x;
              b[i]=0;
              temp++;
              //res[0]=i+1;res[1]=x;res[2]=j+1;
              str+=Integer.toString(i+1)+" "+Integer.toString(x)+" "+Integer.toString(j+1);
              break;
            }
          }
        }
        str+="\n";
      }
      i++;
    }
    )
   }
  }
}
