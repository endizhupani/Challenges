namespace ThingsLab.Exercise
{
    class Program
    {
        static void Main(string[] args)
        {
            MyString string1 = new MyString();
            MyString tl = new MyString("Things Lab");

            Console.WriteLine("You should NOT see \"false\", -1, blank or \"null\" as any result");
            Console.WriteLine("The length of string1: {0}", string1.Length()); //should be 0
            Console.WriteLine("The length of tl: {0}", tl.Length()); //should be 10

            Console.WriteLine("The 3rd (0 based) character of \"Things Lab\" is: {0}", tl.CharAt(3)); //should be 'n'

            Console.WriteLine("\"Things Lab\" = \"Things Lab\" ? {0}", tl.Equals(new MyString("Things Lab"))); //should be true
            Console.WriteLine("\"Things Lab\" = \"Things Lab\" ? {0}", tl.Equals("Things Lab")); //should be true

            Console.WriteLine("\"Things Lab\" has a letter 'g' at {0}", tl.IndexOf('g')); //should be 4

            //should print "Things Lab: LEARN | MAKE | SHARE"
            Console.WriteLine(tl.Append(new MyString(": LEARN | MAKE | SHARE")));

            Console.WriteLine(tl.SubSequence(7,10)); //should print 'Lab'

            Console.WriteLine(tl.Replace('L', 'l')); //should print 'Things lab'

        }
    }
}
