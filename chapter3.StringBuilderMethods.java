public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
        /*Notice that substring() returns a String rather than a StringBuilder. That is why sb
        is not changed. substring() is really just a method that inquires about where the substring
        happens to be.*/

        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1); // 1c-true

        StringBuilder sb2 = new StringBuilder("animals");
        sb2.insert(7, "-"); // sb = animals-
        sb2.insert(0, "-"); // sb = -animals-
        sb2.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb2);
       // sb2.insert(15, "-");// java.lang.StringIndexOutOfBoundsException: offset 15, length 10

        StringBuilder sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3); // sb = adef
       // sb3.deleteCharAt(5); // throws an exception
        System.out.println(sb3);
        sb3.deleteCharAt(0);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("ABC");
        sb4.reverse();
        System.out.println(sb4);

        String s = sb4.toString();
        /*Often StringBuilder is used internally for performance purposes but the end result
        needs to be a String. For example, maybe it needs to be passed to another method that is
        expecting a String.*/
        /*When writing new code that concatenates a lot of String objects together, you should
        use StringBuilder. StringBuilder was added to Java in Java 5. If you come across older
        code, you will see StringBuffer used for this purpose. StringBuffer does the same thing
        but more slowly because it is thread safe.*/
    }
}
