    public class ImmutableSwan {
        private int numberEggs;
        public ImmutableSwan(int numberEggs){
            this.numberEggs=numberEggs;
        }
        public int getNumberEggs(){
            return numberEggs;
        }
        //In this example, we don't have a setter. We do have a constructor that allows a value to
        //be set. Remember, immutable is only measured after the object is constructed. Immutable
        //classes are allowed to have values. They just can't change after instantiation.
    
        //Immutable classes are helpful because you know they will always be the same. You can
        //pass them around your application with a guarantee that the caller didn’t change anything.
        //This helps make programs easier to maintain. It also helps with performance by limiting
        //the number of copies, as you saw with String.
    }
