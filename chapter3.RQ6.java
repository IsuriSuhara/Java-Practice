public class RQ6 {
        public void roar (String roar1, StringBuilder roar2){
            roar1.concat("!!!");
            roar2.append("!!!");
        }
        public static void main (String[]args){
            String roar1 = "roar";
            StringBuilder roar2 = new StringBuilder("roar");
            new RQ6().roar(roar1, roar2);
            System.out.println(roar1 + " " + roar2);//roar roar!!!
            //A String is immutable. Calling concat() returns a new String but does not change
            //the original. A StringBuilder is mutable. Calling append() adds characters to the
            //existing character sequence along with returning a reference to the same object.
        }
    }

