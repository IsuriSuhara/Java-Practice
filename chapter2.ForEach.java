
public class ForEach {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for(int x : list) {
            System.out.println(x + ", ");
            break;
            //The break statement on line 8 causes the loop to execute once
            //and finish.
            }//Output: 10,
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");//Output: Lisa, Kevin, Roger,
        }
        System.out.println();
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");//Output: Lisa, Kevin, Roger,
        }
        System.out.println();
        /*
        String namess = "Lisa";
        for(String name : namess) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }
        //In this example, the String names is not an array, nor does it implement java.lang.
        //Iterable, so the compiler will throw an exception since it does not know how to iterate
        //over the String.
         */
        String[] namess = new String[3];
        for(String name : namess) { // left-hand side of the for-each statement have to
            //define an instance of String
            System.out.print(name + " ");//Output: null null null
        }
        System.out.println();
        for(int i=0; i < namess.length; i++) {
            String name = namess[i];
            System.out.print(name + ", ");//Output:null, null, null,
        }
        System.out.println();
        java.util.ArrayList<Integer> valuess = new java.util.ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        for (int i = 0; i < nums.length; i ++)
        {
            valuess.add(nums[i]);
        }
        for(java.util.Iterator<Integer> i = valuess.iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");//Output:1, 44, 7, 9, -16, 3,
        }
        System.out.println();
        for(int value : valuess) {
            System.out.print(value + ", ");//Output:1, 44, 7, 9, -16, 3,
        }
        System.out.println();

        java.util.List<String> namesss = new java.util.ArrayList<String>();
        namesss.add("Lisa");
        namesss.add("Kevin");
        namesss.add("Roger");
        for(int i=0; i<namesss.size(); i++) {
            String name = namesss.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }//Output: Lisa, Kevin, Roger
        System.out.println();

        int[] valuesss = new int[3];
        valuesss[0] = 10;
        valuesss[1] = 5;
        valuesss[2] = 15;
        for(int i=1; i<valuesss.length; i++) {
            System.out.print(valuesss[i]-valuesss[i-1]+",");
        }//Output: -5,10,
    }


}
