#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	fstream dataFile;
	dataFile.open("Notes.txt",ios::out);
	if(!dataFile)
	{
		cout<<"File open error!"<<endl; return 0;
	}
	for(int i=0;i<100;i++)
	{
		dataFile<<i<<"\n";
	}
	dataFile.close();
}

