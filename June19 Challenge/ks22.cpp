include<bits/stdc++.h>
using namespace std;

int main()
{
  unsigned long long int t,n;
  cin>>t;
  if(t>=1 && t<=pow(10,5))
  {
    cin>>n;
    if(n>=1 && n<pow(10,18))
    {
      cal(n);
    }
  }
}
void cal(unsigned long long int n)
{
  unsigned long long int sum,r,x,cal;
  sum=0;
  x=n;

  while(x>0)
  {
    sum+=x%10;
    x/=10;
  }

  r=10-sum%10;
  cal=(10*n)+r;
  cout<<cal<<endl;
}
