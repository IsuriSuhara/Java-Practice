public class Snake {
    //public  String result = "hello";
    public void shed(boolean time) {
        //String result = "hello";
        if (time) {

             }
        String result = "hello";
        System.out.println(result);

         }
    //public  String result = "hello";

    public static void main(String[] args) {
        Snake sn = new Snake();
        sn.shed(true);
    }
}
//If I need to initialize "result" within a method it would become a local variable.
//Local variables need to be intialized before they are used.
//Initializing after "System.out.println(result);" within the method will not compile.
