import java.io.*;
import java.util.*;

class crossword
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    char matrix[][]=new char[10][10];
    for(int i=0;i<10;i++)
    {
      String str=sc.nextLine();
      for(int j=0;j<10;j++)
      {
        matrix[i][j]=str.charAt(j);
      }
    }
    String words[]=sc.nextLine().split(";");
    int n=10;
    solve(words,matrix,0,n);
  }

  static void solve(String words[],char matrix[][],int index,int n)
  {
    System.out.println(index+"  "+words.length);
    if(index<words.length)
    {
      String currentword=words[index];
      int maxlen=n-currentword.length();

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<=maxlen;j++)
        {
          char temp[][]=checkVertical(i,j,matrix,currentword);
          System.out.println(j+"  "+i);
          printMatrix(temp,10);
          if(temp[0][0]!='@')
            solve(words,temp,index+1,n);
        }
      }

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<=maxlen;j++)
        {
          char temp[][]=checkHorizontal(i,j,matrix,currentword);
          if(temp[0][0]!='@')
            solve(words,temp,index+1,n);
        }
      }
    }
    else
    {
      System.out.println("Here");
      printMatrix(matrix,10);
    }
  }

  static char[][] checkHorizontal(int x,int y,char matrix[][],String currentword)
  {
    int n=currentword.length();
    for(int i=0;i<n;i++)
    {
      if(matrix[x][y+i]=='-' || matrix[x][y+i]==currentword.charAt(i))
      {
        matrix[x][y+i]=currentword.charAt(i);
      }
      else
      {
        matrix[0][0]='@';
        return matrix;
      }
    }
    return matrix;
  }

  static char[][] checkVertical(int x,int y,char matrix[][],String currentword)
  {
    int n=currentword.length();
    System.out.println(currentword);
    for(int i=0;i<n;i++)
    {
      if(matrix[x+i][y]=='-' || matrix[x+i][y]==currentword.charAt(i))
      {
        matrix[x+i][y]=currentword.charAt(i);
      }
      else
      {
        matrix[0][0]='@';
        return matrix;
      }
    }
    return matrix;
  }

  static void printMatrix(char matrix[][],int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}
