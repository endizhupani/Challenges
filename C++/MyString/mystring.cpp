#include <iostream>
#include <string>
#include <cstring>
#include "mystring.h"

using namespace std;

MyString::MyString() {
	str = new char[0];
}

MyString::MyString(char *ch) {
	str = ch;
}

MyString::MyString(string otherStr) {
	str = otherStr.c_str();
}

int MyString::length() {
	return strlen(str);
}


char MyString::charAt(int index) {
	int len = strlen(str);
	
	if (index < 0 || index > len) {
		return -1;
	}
	
	return str[index];
}

bool MyString::equals(MyString *otherString) {
	const char* otherCharArray = otherString->toCharArray();
	
	if (this->length() != otherString->length()) {
		return false;
	}
	
	for (int i=0; i<this->length(); i++) {
			if (this->charAt(i) != otherString->charAt(i))
				return false;
		}
	
	return true;
}

bool MyString::equals(string otherString) {
	if (this->length() != otherString.length()) {
		return false;
	}
	
	for (int i=0; i<this->length(); i++) {
		if (this->charAt(i) != otherString.at(i))
			return false;
	}
	
	return true;
}

int MyString::indexOf(char ch) {
	for (int i=0;i<this->length();i++) {
		if (this->charAt(i) == ch) 
			return i;
	}
	
	return -1;
}

MyString MyString::operator+(MyString otherString) {
	char* newString;
	strcpy(newString, this->toCharArray());
	strcat(newString, otherString->toCharArray());
	
	MyString myNewString(newString);
	return myNewString;
}

const char* MyString::toCharArray() {
	return str;
}

void MyString::display() {
	for (int i=0;i<this->length();i++)
		cout<<this->charAt(i);
	cout<<endl;
}
