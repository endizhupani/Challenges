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
        //TODO: implement this constructor
    }

    /**
     * Create a MyString object out of a String object
     * @param str The String object passed as parameter
     */
    public MyString(String str) {
        //TODO: implement this constructor
    }

    //Add other constructors if you want

    /**
     * This method should return the length of the string
     * @return Lenght of string
     */
    public int length() {
        //TODO: implement this method
        return -1;
    }

    /**
     * This method should return the character at a given index
     * @param index The index of the char you require
     * @return The char at index given
     */
    public char charAt(int index) {
        //TODO: implement this method
        return '\0';
    }


    /**
     * Check if the string is equal to another string passed as parameter
     * @param myString Another string passed as parameter to check equality
     * @return True if the strings are equal, otherwise false
     */
    public boolean equals(MyString myString) {
        //TODO: implement this method
        return false;
    }

    /**
     * Should act the same as the above method, but accepts a
     * java.lang.String as parameter
     * @param str A string passed to check equality
     * @return True if the strings are equal, otherwise false
     */
    public boolean equals(String str) {
        //TODO: implement this method
        return false;
    }


    /**
     * Should return the index of a given character
     * @param ch A character passed to check equality
     * @return The index (0 based) of the character, or -1 if the char is not found
     */
    public int indexOf(char ch) {
        //TODO: implement this method
        return -1;
    }


    /**
     * Should append the given string to the one who calls the method
     * @param str A given string to be appended
     * @return A new string which is the "sum" of two others
     */
    public MyString append(MyString str) {
        //TODO: implement this method
        return null;
    }


    /**
     * This method should return a string that is a subsequence of characters of the
     * existing string
     * @param from The begin index of subsequence
     * @param to The end index of subsequence
     * @return The specified subsequence
     */
    public MyString subSequence(int from, int to) {
        //TODO: implement this method
        return null;
    }


    /**
     * This method should return a version of the existing string, where some characters
     * are replaced by new ones
     * @param oldChar The character to be replaced
     * @param newChar The replacement character
     * @return The resulting string
     */
    public MyString replace(char oldChar, char newChar) {
        //TODO: implement this method
        return null;
    }


    /**
     * This method should create a character array out of the existing string
     * @return The resulting character array
     */
    public char[] toCharArray() {
        //TODO: implement this method
        return null;
    }


    /**
     * Return the equivalent java.lang.String object
     * @return The equivalent java.lang.String object
     */
    @Override
    public String toString() {
        //TODO: implement this method
        return null;
    }

}
