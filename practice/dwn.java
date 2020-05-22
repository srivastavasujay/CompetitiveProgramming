import java.util.*;

public class dwn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int N=sc.nextInt();
			int K=sc.nextInt();
			int count=0;
			for(int n=0;n<N;n++)
			{
				int Ni=sc.nextInt();
				int Di=sc.nextInt();
				if(Ni<K)
				{
					K-=Ni;
					continue;
				}
				else
				{
					Ni-=K;
					K=0;
					count+=Ni*Di;
				}
			}
			System.out.println(count);
		}
	}
}
