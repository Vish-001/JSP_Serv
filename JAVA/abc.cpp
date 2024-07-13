#include <iostream>
#include <math.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
        int a,b,n;
        cin>>a>>b>>n;
        int B=(b*b);
        int A=(a*a);
        if(a>b)
        {
            if(n%2!=0 && B>A)
            {
                cout<<2<<endl;
            }
            else 
            {
                cout<<1<<endl;
            }
        }
        else if(b>a)
        {
            if(n%2!=0 && A>B)
            {
                cout<<1<<endl;
            }
            else 
            {
                cout<<2<<endl;
            }
        }
        else
        {
            cout<<0<<endl;
        }
        
	}
	
	return 0;
}
