public class Animal {
   
        public int count = 0;
        public void increment() {
            this.count+=1;
        }
        
   
        public static void printName() {
            String name = "Rocky";
            System.out.println(name);
        }  
    
         public static void main(String[] args) {
         Animal animal = new Animal();
         animal.increment();
         System.out.println(animal.count);

        Animal.printName(); 
         }
     }  
