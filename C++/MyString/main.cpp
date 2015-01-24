#include <iostream>
#include "mystring.h"

using namespace std;

int main(void) {
	
	MyString *string1 = new MyString();
	MyString *tl = new MyString("Things Lab");

	cout<<"You should NOT see \"false\", -1, blank or \"null\" as any result"<<endl<<endl;
	
	cout<<"The length of string1: "<<string1->length()<<endl; //should be 0
	cout<<"The length of tl: "<<tl->length()<<endl; //should be 10
	
	
    cout<<"The 3rd (0 based) character of \"Things Lab\" is: "<< tl->charAt(3)<<endl; //should be 'n'
	
    cout<<"\"Things Lab\" = \"Things Lab\" ? " << tl->equals(new MyString("Things Lab"))<<endl; //should be 1 (true)
    
	cout<<"\"Things Lab\" = \"Things Lab\" ? " << tl->equals("Things Lab")<<endl; //should be true
	
    cout<<"\"Things Lab\" has a letter 'g' at "<<tl->indexOf('g')<<endl; //should be 4
	
    //should print "Things Lab: LEARN | MAKE | SHARE"
    MyString toAppend(": LEARN | MAKE | SHARE");
    tl = tl + toAppend;
	tl->display();
	//cout<<tl<<endl;

    cout<<tl->subSequence(7,10)<<endl; //should print 'Lab'

    cout<<tl->replace('L','l')<<endl; //should print 'Things lab'
	*/
	return 0;
}
