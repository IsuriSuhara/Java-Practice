public class NotImmutableToString {
    private StringBuilder builder;
    public NotImmutableToString(StringBuilder b) {
        builder = b;
    }
    //public StringBuilder getBuilder() {
    //    return builder;
    //}
    public String getBuilder() {
        return builder.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutableToString problem = new NotImmutableToString(sb);
        System.out.println(problem.getBuilder());//initial

        sb.append(" added");
        System.out.println(problem.getBuilder());//initial added

        //StringBuilder gotBuilder = problem.getBuilder();//DOES NOT COMPILE
        //gotBuilder.append(" more");
        System.out.println(problem.getBuilder());//initial added
    }
}
