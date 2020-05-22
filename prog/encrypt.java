import java.io.*;
import java.util.*;

class encrypt
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);			
			String str=sc.nextLine();
			for(int i=1;i<=26;i++)
			{
				String s="";
				for(int j=0;j<str.length();j++)
				{
					char c=str.charAt(j);
					int ch=(int)c;
					if(ch==32)
					{
						c=(char)ch;
						s=s+c;
					}
					else
					{
					ch=ch+i;
					if(ch>90)
						ch=ch-26;
					c=(char)ch;
					s=s+c;
					}
				}
				System.out.println(s);
			}
	}
}
