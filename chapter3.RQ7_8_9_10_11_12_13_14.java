public class RQ7_8_9_10_11_12_13_14 {
    public static void main(String[] args) {
        //RQ7
        String letters = "abcdef";
        System.out.println(letters.length());//B. 6
        System.out.println(letters.charAt(3));//D. d
        //System.out.println(letters.charAt(6));//E. java.lang.StringIndexOutOfBoundsException: String index out of range: 6

        //RQ8
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));//12
        System.out.println(numbers.substring(7, 7));//empty line
        System.out.println(numbers.substring(7));//78
        //substring() has two forms. The first takes the index to start with and the
        //index to stop immediately before. The second takes just the index to start with and
        //goes to the end of the String. Remember that indexes are zero based. The first call
        //starts at index 1 and ends with index 2 since it needs to stop before index 3. The second
        //call starts at index 7 and ends in the same place, resulting in an empty String.
        //This prints out a blank line. The final call starts at index 7 and goes to the end of the
        //String.

        //RQ9
        String s = "purr";
        s.toUpperCase();//returns "PURR" but the result is ignored and not stored in s.
        s.trim();//returns "purr" since there is no whitespace present but the result is again ignored.
        s.substring(1, 3);//returns "ur" because it starts with index 1 and ends before index 3 using
        // zero-based indexes. The result is ignored again.
        s += " two";//concatenate four new characters to s and now have a String of length 8.
        System.out.println(s.length());//8
        //This question is trying to see if you know that String objects are immutable.

        //RQ10
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");//returns false because the two
        //String objects are not the same in memory. One comes directly from the string pool
        //and the other comes from building using String operations.
        if ( a.equals("2cfalse")) System.out.println("equals");//F. equals
        //returns true because the values
        // of the two String objects are the same using object equality.

        //RQ11
        int total = 0;
        StringBuilder letters1 = new StringBuilder("abcdefg");
        total += letters1.substring(1, 2).length();
        total += letters1.substring(6, 6).length();
        //total += letters1.substring(6, 5).length();
        //System.out.println(total);//E. An exception is thrown.
        //Java does not allow the indexes to be specified in reverse order
        // and the code throws a StringIndexOutOfBoundsException.

        //RQ12
        StringBuilder numbers1 = new StringBuilder("0123456789");
        numbers1.delete(2, 8);
        numbers1.append("-").insert(2, "+");
        System.out.println(numbers1);

        //RQ13
        //StringBuilder b = "rumble";//F. The code does not compile.
        //b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        //System.out.println(b);
        //This is a trick question. The first line does not compile because you cannot
        //assign a String to a StringBuilder. If that line were StringBuilder b = new
        //StringBuilder("rumble"), the code would compile and print rum4. Watch out for this
        //sort of trick on the exam. You could easily spend a minute working out the character
        //positions for no reason at all.

        //RQ14
        StringBuilder puzzle = new StringBuilder("Java");
        // INSERT CODE HERE
        //puzzle.reverse();//A. avaJ
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);//C. avaJ
        //puzzle.append("vaJ$").substring(0, 4);//JavavaJ$//However, substring() returns a String, which is not stored anywhere.
        //puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());//java.lang.StringIndexOutOfBoundsException
        //throws an exception because you cannot delete the character after the last index.
        System.out.println(puzzle);



    }
}
