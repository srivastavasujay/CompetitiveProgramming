#include<stdio.h>

int main()
{
printf("Enter the number of rows\n");
int n;
scanf("%d",&n);
int k=1,m=1,n1=n;
for(int i=1;i<=n1;i++)
{
for(int sp=n;sp>=1;sp--)
{
printf(" ");
}
n=n-1;
for(int j=1;j<=k;j++)
{
printf("%d",(m++));
}
k=k+2;m=1;
printf("\n");
}

n=1;
for(int i=1;i<=(n1-1);i++)
{
for(int sp=1;sp<=n;sp++)
{
printf(" ");
}
n=n+1;
for(int j=1;j<=k;j++)
{
printf("%d",(m++));
}
k=k+2;m=1;
printf("\n");
}
}


