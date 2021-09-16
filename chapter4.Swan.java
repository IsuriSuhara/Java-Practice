public class Swan {
    private int numberEggs; // private
    public int getNumberEggs() { // accessor method or a getter
        return numberEggs;
        }
    public void setNumberEggs(int numberEggs) { // a mutator method or a setter
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
        }
        //For encapsulation, remember that data (an instance variable) is private and getters/setters
    //are public.
//Rules for JavaBeans naming conventions//
    //Properties are private. private int numEggs;

    //Getter methods begin with is if the property is a boolean.
    //public boolean isHappy() {
    //return happy;
    //}

    //Getter methods begin with get if the property is not a boolean.
    //public int getNumEggs() {
    //return numEggs;
    //}

    //Setter methods begin with set. public void setHappy(boolean happy) {
    //this.happy = happy;
    //}

    //The method name must have a prefix
    //of set/get/is, followed by the first
    //letter of the property in uppercase, followed
    //by the rest of the property name.
    //public void setNumEggs(int num) {
    //numEggs = num;
    //}
}
