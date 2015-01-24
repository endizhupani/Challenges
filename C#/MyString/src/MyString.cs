/**
 * This class should represent a string, i.e. a sequence of characters.
 * You should provide your implementation for ALL the methods below,
 * but feel free to add more if you want.
 *
 * Reminder: You are NOT allowed to use System.String class as a private
 * field.
 */

namespace ThingsLab.Exercise
{
    public class MyString
    {

        /*
         * Empty constructor
         */
        public MyString()
        {
            //TODO: implement this constructor
        }

        /*
         * Create a MyString object out of a String object
         * @param str: The String object passed as parameter
         */
        public MyString(string str)
        {
            //TODO: implement this constructor
        }

        //Add other constructors if you want

        /*
         * This method should return the length of the string
         * @return Lenght of string
         */
        public int Length()
        {
            return -1;
            //TODO: implement this method
        }

        /*
         * This method should return the character at a given index
         * @param index The index of the char you require
         * @return The char at index given
         */
        public char CharAt(int index)
        {
            //TODO: implement this method
            return '\0';
        }

        /*
         * Check if the string is equal to another string passed as parameter
         * @param myString Another string passed as parameter to check equality
         * @return True if the strings are equal, otherwise false
         */
        public bool Equals(MyString myString)
        {
            //TODO: implement this method
            return false;
        }

        /*
         * Should act the same as the above method, but accepts a
         * System.String as parameter
         * @param str A string passed to check equality
         * @return True if the strings are equal, otherwise false
         */
        public bool Equals(string str)
        {
            //TODO: implement this method
            return false;
        }

        /*
         * Should return the index of a given character
         * @param ch A character passed to check equality
         * @return The index (0 based) of the character, or -1 if the char is not found
         */
        public int IndexOf(char ch)
        {
            //TODO: implement this method
            return -1;
        }


        /*
         * Should append the given string to the one who calls the method
         * @param str A given string to be appended
         * @return A new string which is the "sum" of two others
         */
        public MyString Append(MyString str)
        {
            //TODO: implement this method
            return null;
        }

        /*
         * This method should return a string that is a subsequence of characters of the
         * existing string
         * @param from The begin index of subsequence
         * @param to The end index of subsequence
         * @return The specified subsequence
         */
        public MyString SubSequence(int from, int to)
        {
            //TODO: implement this method
            return null;
        }

        /*
         * This method should return a version of the existing string, where some characters
         * are replaced by new ones
         * @param oldChar The character to be replaced
         * @param newChar The replacement character
         * @return The resulting string
         */
        public MyString Replace(char oldChar, char newChar)
        {
            //TODO: implement this method
            return null;
        }

        /*
         * This method should create a character array out of the existing string
         * @return The resulting character array
         */
        public char[] toCharArray()
        {
            //TODO: implement this method
            return null;
        }

        /*
         * Return the equivalent System.String object
         * @return The equivalent System.String object
         */
        public override string ToString()
        {
            //TODO: implement this method
            return null;
        }

    }
}