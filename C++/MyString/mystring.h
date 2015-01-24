#ifndef __MYSTRING_H
#define __MYSTRING_H

#include <string>

class MyString {
	private:
		const char *str;
		
	public:
		//constructors
		MyString();
		MyString(char *ch);
		MyString(std::string otherStr);
		
		int length();
		char charAt(int index);
		bool equals(MyString *otherString);
		bool equals(std::string otherString);
		int indexOf(char ch);
		MyString append(MyString otherString);
		MyString subSequence(int from, int to);
		MyString replace(char oldChar, char newChar);
		const char* toCharArray();
		
		MyString operator+(MyString otherString);
		
		void display();
};

#endif // __MYSTRING_H
