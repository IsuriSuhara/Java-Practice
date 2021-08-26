public class CompileOrNot {
    public static void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
            //onlyOneBranch = 0;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        findAnswer(true);//java: variable onlyOneBranch might not have been initialized
    }
}
