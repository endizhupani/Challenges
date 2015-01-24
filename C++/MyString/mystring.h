#ifndef __MYSTRING_H
#define __MYSTRING_H

#include <string>


/**
 * This class should represent a string, i.e. a sequence of characters.
 * You should provide your implementation for ALL the methods below,
 * but feel free to add more if you want.
 *
 * Reminder: You are NOT allowed to use string class as a private
 * field.
 */
class MyString {
	private:
		//put your private fields here
		
	protected:
		//put your protected fields here
		
	public:
		//constructors
		MyString();
		MyString(std::string otherStr);
		
		//add other constructors if you want to
		
		int length();
		char charAt(int index);
		bool equals(MyString *otherString);
		bool equals(std::string otherString);
		int indexOf(char ch);
		MyString append(MyString otherString);
		MyString subSequence(int from, int to);
		MyString replace(char oldChar, char newChar);
		const char* toCharArray();
		
		MyString operator+(MyString mystr2);
		//overload other operators if you want to
		
		void display();
};

#endif // __MYSTRING_H
