public class Lion extends Animal1{
    public void roar(){
        setNumOfLegs(4);
        System.out.println("Lion with "+getNumOfLegs()+ " legs says Roar!");
    }
    public static void main(String[] args) {
        Lion myLion=new Lion();
        Animal1 myAnimal=new Animal1();
        System.out.println(myAnimal.getNumOfLegs());//0
        myLion.setNumOfLegs(5);
        System.out.println(myLion.getNumOfLegs());//0
        myLion.roar();//Lion with 4 legs says Roar!
    }
}
