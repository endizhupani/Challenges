package cc.thingslab.exercise.java;
/**
 * This class should represent a string, i.e. a sequence of characters.
 * You should provide your implementation for ALL the methods below,
 * but feel free to add more if you want.
 *
 * Reminder: You are NOT allowed to use java.lang.String class as a private
 * field.
 */
public class MyString {

    /**
     * Empty constructor
     */
    public MyString() {
       string = new char[size];
    }

    /**
     * Create a MyString object out of a String object
     * @param str The String object passed as parameter
     */
    public MyString(String str) {
        size = str.length();
        string = new char[size];
        for (int i = 0; i <size; i++)
        {
        	string [i] = str.charAt(i);
        }
    }

    //Add other constructors if you want

    /**
     * This method should return the length of the string
     * @return Length of string
     */
    public int length() {
        return size;
    }

    /**
     * This method should return the character at a given index
     * @param index The index of the char you require
     * @return The char at index given
     */
    public char charAt(int index) {
        if (index <size)
        	return string[index];
        else return '\0';
    }


    /**
     * Check if the string is equal to another string passed as parameter
     * @param myString Another string passed as parameter to check equality
     * @return True if the strings are equal, otherwise false
     */
    public boolean equals(MyString myString) {
        if (size == myString.length())
        {
        	for (int i=0; i < size; i++)
        		if (string[i] != myString.charAt(i))
        			return false;
        	return true;
        }
        else
        return false;
    }

    /**
     * Should act the same as the above method, but accepts a
     * java.lang.String as parameter
     * @param str A string passed to check equality
     * @return True if the strings are equal, otherwise false
     */
    public boolean equals(String str) {
    	if (size == str.length())
        {
        	for (int i=0; i < size; i++)
        		if (string[i] != str.charAt(i))
        			return false;
        	return true;
        }
        else
        return false;
    }


    /**
     * Should return the index of a given character
     * @param ch A character passed to check equality
     * @return The index (0 based) of the character, or -1 if the char is not found
     */
    public int indexOf(char ch) {
    	int index = -1;
    	for (int i = 0; i<size; i++)
    	{
    		if (string[i] == ch){
    		index = i;
    		return index;
    		}
    	}
        return index;
    }


    /**
     * Should append the given string to the one who calls the method
     * @param str A given string to be appended
     * @return A new string which is the "sum" of two others
     */
    public MyString append(MyString str) {
    	return new MyString(toString()+str.toString());
    }


    /**
     * This method should return a string that is a subsequence of characters of the
     * existing string
     * @param from The begin index of subsequence
     * @param to The end index of subsequence
     * @return The specified subsequence
     */
    public MyString subSequence(int from, int to) {
        if (from < 0 || to > size)
        return null;
        else{ 
        	String sub = "";
        	for(int i = from;i < to; i++){
        	sub += string[i];
        	}
        	return new MyString(sub); 
        } 	
    }


    /**
     * This method should return a version of the existing string, where some characters
     * are replaced by new ones
     * @param oldChar The character to be replaced
     * @param newChar The replacement character
     * @return The resulting string
     */
    public MyString replace(char oldChar, char newChar) {
    	for (int i = 0; i <size; i++){
    	if (string [i] == oldChar)
    		string[i] = newChar;
    	}
        return new MyString(toString());
    }


    /**
     * This method should create a character array out of the existing string
     * @return The resulting character array
     */
    public char[] toCharArray() {
        return string;
    }


    /**
     * Return the equivalent java.lang.String object
     * @return The equivalent java.lang.String object
     */
    @Override
    public String toString() {
        String str = "";
        for(char c:string)
        	str+=c;
        return str;
    }
    private char [] string;
    private int size =0;
}
