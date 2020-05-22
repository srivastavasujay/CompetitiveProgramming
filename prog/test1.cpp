#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	fstream dataFile;
	dataFile.open("Notes.txt",ios::in);
	int i,count=0;
	if(!dataFile)
	{
		cout<<"File open error!"<<endl; return 0;
	}
	dataFile>>i;
	while(!dataFile.eof())
	{
		cout<<i<<endl;
		dataFile>>i;
		count++;
	}
	cout<<count;
	dataFile.close();
}
	
