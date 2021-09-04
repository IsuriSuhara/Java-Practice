public class SwitchStatement {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
                case a:
                case 'B': System.out.print("great");
                case 'C': System.out.print("good"); break;
                case d:
                case 'F': System.out.print("not good");
                }//Output: greatgood
        System.out.println();

        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }//Output: Weekday

        int dayOfWeekk = 5;
        switch(dayOfWeekk) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }//Output:  Weekday
        //          Saturday
        
        int dayOfWeekkk = 0;
        switch(dayOfWeekkk) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }//Output:  Sunday
        //          Weekday
        //          Saturday
    }

}
