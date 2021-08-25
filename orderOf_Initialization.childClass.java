
    class parentClass{
        parentClass(){
            System.out.println("parent class constructor invoked");
        }
    }

    public class childClass extends parentClass{
        childClass(){
            super();
            System.out.println("child class constructor invoked");
        }

        childClass(int a){
            super();
            System.out.println("child class constructor invoked "+a);
        }

        {System.out.println("instance initializer block is invoked");}//if static was put in the beginning this will only print one time.

        public static void main(String... args){
            childClass child1 =new childClass();
            childClass child2 =new childClass(10);
        }
    }

