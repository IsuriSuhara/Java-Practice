public class CreatingStringBuilder {
    StringBuilder sb1 = new StringBuilder();
    //The fi rst says to create a StringBuilder containing an empty sequence of characters and
    //assign sb1 to point to it.
    StringBuilder sb2 = new StringBuilder("animal");
    //The second says to create a StringBuilder containing a specific
    //value and assign sb2 to point to it.
    StringBuilder sb3 = new StringBuilder(10);
    //The final example tells Java that we have some idea of how big the eventual value
    //will be and would like the StringBuilder to reserve a certain number of slots for characters.

    /*Size is the number of characters currently in the sequence, and capacity is the number
    of characters the sequence can currently hold. Since a String is immutable, the size and
    capacity are the same. The number of characters appearing in the String is both the size
    and capacity.
    StringBuilder is constructed, it may start at the default capacity (which happens to be
    or one of the programmer’s choosing. In the example, we request a capacity of 5. At
    this point, the size is 0 since no characters have been added yet, but we have space for 5.*/

}
