public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";
    public MouseHouse(int length, int width, int height) {
        volume = length * width * height;
    }
    public void print(){
        System.out.println(volume+" cubic centimeter");
    }
    //The constructor is part of the initialization process, so it is allowed to assign final
    //instance variables in it. By the time the constructor completes, all final instance variables
    //must have been set.

    public static void main(String[] args) {
        MouseHouse littleHome = new MouseHouse(2,3,8);
        littleHome.print();

    }
}

