public class StringMethods {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.length()); // 7
        /*The difference is
        that zero counting happens only when you’re using indexes or positions within a list. When
        determining the total size or length, Java uses normal counting again.*/

        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
        //System.out.println(string.charAt(7)); // java.lang.StringIndexOutOfBoundsException:
        // String index out of range: 7

        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1
        /*Unlike charAt(), the indexOf() method doesn’t throw an exception if it can’t find a match.
         indexOf() returns –1 when no match is found.*/

        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // throws exception
        //System.out.println(string.substring(3, 8)); // throws exception
        /*The method returns the
        string starting from the requested index. If an end index is requested, it stops right before
        that index. Otherwise, it goes to the end of the string.*/

        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("ABc123".toLowerCase()); // abc123
        /*Also, remember that strings are immutable, so the original string stays the same.*/

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false
        /*Again, we have a case-sensitive search in the String. The contains() method is a convenience
        method, so you don’t have to write str.indexOf(otherString) != -1.*/

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
        System.out.println("abcabc".replace("ab", "AA"));//AAcAAc
        /*The first example uses the first method signature, passing in char parameters. The
        second example uses the second method signature, passing in String parameters.*/

        System.out.println("abc".trim()); // abc
        System.out.println("a b c".trim()); // a b c
        System.out.println("\t a b c\n"); // a b c
        System.out.println("\t a\t b c\n".trim()); // a b c
        /*The trim() method removes whitespace from the beginning and end
        of a String. In terms of the exam, whitespace consists of spaces along with the \t (tab) and
        \n (newline) characters. Other characters, such as \r (carriage return), are also included in
        what gets trimmed.The fi rst example prints the original string because there are no whitespace characters
        at the beginning or end. The second example gets rid of the leading tab, subsequent spaces,
        and the trailing newline. It leaves the spaces that are in the middle of the string.*/
    }
}
