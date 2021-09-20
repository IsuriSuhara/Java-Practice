public class Animal1 {
    private int numOfLegs;
    public int getNumOfLegs() {
        return numOfLegs;
    }
    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs=numOfLegs;
    }

    public static void main(String[] args) {
        Animal1 myAni=new Animal1();
        myAni.setNumOfLegs(4);
        int result=myAni.getNumOfLegs();
        System.out.println(result);
    }
}
