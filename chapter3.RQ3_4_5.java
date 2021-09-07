public class RQ3_4_5 {
    //RQ3:B. An immutable object cannot be modified.
    //    C. An immutable object can be garbage collected.
    //    E. String is immutable.
    public static void main(String[] args) {
        //RQ4
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);//B. abbaccca

        //RQ5
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2)//F. The code does not compile.
            // Java does not allow you to compare String and StringBuilder using ==.
            System.out.print("1");
        if (s1.equals(s2))
            System.out.print("2");
    }
}
