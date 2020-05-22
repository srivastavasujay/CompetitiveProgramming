class perm
{
	public static void main(String[] args) {
		char s[]={'c','h','e','f'};
		int n=s.length;
		char perm[]=new char[4];
		int m=0,c=0,j=1;
		String q;
		String b[]=new String[24];

		for(int i=0;i<24;i++)
		{
			for(int p=0;p<4;p++)
			{
				perm[p]=s[p];
			}
			int k=0;
			while(k<6)
			{
				while(j<(n-1))
				{
					q=new String(perm);
					b[c++]=q;
					{
						char temp=perm[j];
						perm[j]=perm[j+1];
						perm[j+1]=temp;
					}
					j++;
					k++;
				}
				j=1;
			}
			m++;

			if(m==n)
				break;

			char t=s[0];
			s[0]=s[m];
			s[m]=t;
		}
	}
}
