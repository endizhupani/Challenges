package cc.thingslab.exercise.java;

public class Main {

    public static void main(String[] args) {
        MyString string1 = new MyString();
        MyString tl = new MyString("Things Lab");

        System.out.println("You should NOT see \"false\", -1, blank or \"null\" as any result");
        System.out.println("The length of string1: "+string1.length()); //should be 0
        System.out.println("The length of tl: " + tl.length()); //should be 10

        System.out.println("The 3rd (0 based) character of \"Things Lab\" is: "+ tl.charAt(3)); //should be 'n'

        System.out.println("\"Things Lab\" = \"Things Lab\" ? " + tl.equals(new MyString("Things Lab"))); //should be true
        System.out.println("\"Things Lab\" = \"Things Lab\" ? " + tl.equals("Things Lab")); //should be true

        System.out.println("\"Things Lab\" has a letter 'g' at "+tl.indexOf('g')); //should be 4

        //should print "Things Lab: LEARN | MAKE | SHARE"
        System.out.println(tl.append(new MyString(": LEARN | MAKE | SHARE")));

        System.out.println(tl.subSequence(7,10)); //should print 'Lab'

        System.out.println(tl.replace('L','l')); //should print 'Things lab'

    }
}
