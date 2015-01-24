#include <iostream>
#include "mystring.h"

using namespace std;

int main(void) {
	
	MyString *string1 = new MyString();
	MyString *tl = new MyString("Things Lab");

	cout<<"You should NOT see 0, -1 or blank as any result"<<endl<<endl;
	
	cout<<"The length of string1: "<<string1->length()<<endl; //should be 0
	cout<<"The length of tl: "<<tl->length()<<endl; //should be 10
	
	
    cout<<"The 3rd (0 based) character of \"Things Lab\" is: " << tl->charAt(3)<<endl; //should be 'n'
	
    cout<<"\"Things Lab\" = \"Things Lab\" ? " << tl->equals(new MyString("Things Lab"))<<endl; //should be 1 (true)
    
	cout<<"\"Things Lab\" = \"Things Lab\" ? " << tl->equals("Things Lab")<<endl; //should be true
	
    cout<<"\"Things Lab\" has a letter 'g' at "<< tl->indexOf('g')<<endl; //should be 4
	
	MyString toAppend(": LEARN | MAKE | SHARE");
    MyString appended = *tl + toAppend;
    cout<<"Appended: "<<endl;
	appended.display();
	
	cout<<endl<<"Subsequence: ";
    tl->subSequence(7,10).display(); //should print 'Lab'

    cout<<endl<<"Char replacement:";
	tl->replace('L','l').display(); //should print 'Things lab'
	
	return 0;
}
