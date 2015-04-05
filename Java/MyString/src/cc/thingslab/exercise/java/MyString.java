package cc.thingslab.exercise.java;
import java.util.ArrayList;
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
       string = new ArrayList<Character>();
    }

    /**
     * Create a MyString object out of a String object
     * @param str The String object passed as parameter
     */
    public MyString(String str) {
        string = new ArrayList <Character>();
        for (char c: str.toCharArray())
        {
        	string.add(c);
        }
    }

    //Add other constructors if you want

    /**
     * This method should return the length of the string
     * @return Length of string
     */
    public int length() {
        return string.size();
    }

    /**
     * This method should return the character at a given index
     * @param index The index of the char you require
     * @return The char at index given
     */
    public char charAt(int index) {
        if (index <string.size())
        	return string.get(index);
        else return '\0';
    }


    /**
     * Check if the string is equal to another string passed as parameter
     * @param myString Another string passed as parameter to check equality
     * @return True if the strings are equal, otherwise false
     */
    public boolean equals(MyString myString) {
        if (string.size() == myString.length())
        {
        	for (int i=0; i < string.size(); i++)
        		if (string.get(i) != myString.charAt(i))
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
    	if (string.size() == str.length())
        {
        	for (int i=0; i < string.size(); i++)
        		if (string.get(i) != str.charAt(i))
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
        return string.indexOf(ch);
    }


    /**
     * Should append the given string to the one who calls the method
     * @param str A given string to be appended
     * @return A new string which is the "sum" of two others
     */
    public MyString append(MyString str) {
        for (int i = 0; i<str.length(); i++)
        {
        	string.add(str.charAt(i));
        }
        return new MyString(toString());
    }


    /**
     * This method should return a string that is a subsequence of characters of the
     * existing string
     * @param from The begin index of subsequence
     * @param to The end index of subsequence
     * @return The specified subsequence
     */
    public MyString subSequence(int from, int to) {
    	String sub = "";
        if (from < 0 || to > string.size())
        return null;
        else 
        	for(int i = from;i < to; i++){
        	sub += string.get(i);
        	}
        return new MyString(sub);  	
    }


    /**
     * This method should return a version of the existing string, where some characters
     * are replaced by new ones
     * @param oldChar The character to be replaced
     * @param newChar The replacement character
     * @return The resulting string
     */
    public MyString replace(char oldChar, char newChar) {
    	for (int i = 0; i <string.size(); i++) 
    	if ( string.get(i)==oldChar){
    		string.remove(i);
    		string.add(i,newChar);
    	}
        return new MyString(toString());
    }


    /**
     * This method should create a character array out of the existing string
     * @return The resulting character array
     */
    public char[] toCharArray() {
    	char [] charArray = new char [string.size()];
        for (int i =0;i<= string.size();i++)
        	charArray[i]=string.get(i);
        return charArray;
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
    private ArrayList <Character> string;

}
