#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n=0;
        cin>>n;
        int a[n];
        boolean check=false;
        vector<int> a1,a2;
        unordered_map<int,int> h;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            h[a[i]]++;
            if(h[a[i]]==1)
            a1.push_back(a[i]);
            else if(h[a[i]]==2)
                a2.push_back(a[i]);
            else if(h[a[i]]>2)
                check=true;
        }
        sort(a1.begin(), a1.end());
        sort(a2.begin(), a2.end(), greater<int>());
        int size=a1.size();
        if(check==true)
          cout<<"NO"<<endl;
        else if(a2.size()>0 && a1[m-1]==a2[0])
           cout<<"NO"<<endl;
        else
        {
            cout<<"YES"<<endl;
        for (auto itr:a1)
            cout<<itr<< " ";
        for (auto itr:a2)
            cout<<itr<< " ";
            cout<<endl;
        }
    }
	return 0;
}
