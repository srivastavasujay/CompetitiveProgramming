#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	fstream fs;
	fstream ft;
	char i;
	fs.open("Notes.txt", ios::in);
	if(!fs)
	{
		cout<<"File open error!"<<endl; return 0;
	}
	
	ft.open("Copy.txt", ios::out);
	if(!ft)
	{
		cout<<"File open error!"<<endl; return 0;
	}
	while(!fs.eof())
	{
		fs>>i;
		ft<<i;
	}
	fs.close();
	ft.close();
}
