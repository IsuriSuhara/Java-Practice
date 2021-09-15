public class CreatingConstructors {
    private String kitty;
    private String color;
    private int height;
    private int length=5;
    public CreatingConstructors(String kitty, int theHeight,int length){
        this.kitty=kitty;//parameter values assigned to the instance variable
        length = this.length;// backwards – no good!
        //instance variable value assigned to the method parameter
        height = theHeight;// fine because a different name
        this.color = "white ";// fine, but redundant
        //allowed to use this even when there is no duplication
        //of variable names
        System.out.println();
    }//The name of the constructor matches the name of the class

    public static void main(String[] args) {
        CreatingConstructors cc = new CreatingConstructors("meow",1,2);
        System.out.println(cc.color+cc.kitty+" "+cc.length+" "+cc.height);
    }
}
