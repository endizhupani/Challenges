#include <iostream>
#include <string>
#include "mystring.h"

/**
 * Empty constructor
 */
MyString::MyString() {
	//TODO: implement this constructor
}


/**
 * Create a MyString object out of a string object
 * @param otherString The string object passed as parameter
 */
MyString::MyString(string otherStr) {
	//TODO: implement this constructor
}


/**
 * This method should return the length of the string
 * @return Length of string
 */
int MyString::length() {
	//TODO: implement this method
	return -1;
}


/**
 * This method should return the character at a given index
 * @param index The index of the char you require
 * @return The char at index given
 */
char MyString::charAt(int index) {
	//TODO: implement this method
	return '\0';
}


/**
 * Check if the string is equal to another string passed as parameter
 * @param otherString Another string passed as parameter to check equality
 * @return true if the strings are equal, otherwise false
 */
bool MyString::equals(MyString *otherString) {
	//TODO: implement this method
	return false;
}


/**
 * Should act the same as the above method, but accepts a
 * std::string as parameter
 * @param otherString A std::string passed to check equality
 * @return true if the strings are equal, otherwise false
 */
bool MyString::equals(string otherString) {
	//TODO: implement this method
	return false;
}


/**
 * Should return the index of a given character
 * @param ch A character passed to check equality
 * @return The index (0 based) of the character, or -1 if the char is not found
 */
int MyString::indexOf(char ch) {
	//TODO: implement this method
	return -1;
}


/**
 * This method should return a version of the existing string, where some characters
 * are replaced by new ones
 * @param oldChar The character to be replaced
 * @param newChar The replacement character
 * @return The resulting string
 */
MyString MyString::replace(char oldChar, char newChar) {
	//TODO: implement this method
	return NULL;
}


/**
 * This method should return a string that is a subsequence of characters of the
 * existing string
 * @param from The begin index of subsequence
 * @param to The end index of subsequence
 * @return The specified subsequence
 */
MyString MyString::subSequence(int from, int to) {
	//TODO: implement this method
	return NULL;
}


/**
 * This method should create a character array out of the existing string
 * @return The resulting character array
 */
const char* MyString::toCharArray() {
	//TODO: implement this method
	return NULL;
}


/**
 * Overloaded version of the + operator. It should concatenate two strings,
 * i.e. append the second string to the first one
 */
MyString MyString::operator+(MyString mystr2) {
	//TODO: implement this method
	return NULL;
}


/**
 * This method should display the string
 */
void MyString::display() {
	//TODO: implement this method
}
