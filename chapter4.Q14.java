import java.util.*;
import static java.util.Collections.*;
import static java.util.Collections.sort;
//import static java.util.Collections.sort(ArrayList<String>);//DOES NOT COMPILE
public class Q14 {
    public void method(ArrayList<String> list){
        sort(list);
    }
    //A. import static java.util.Collections;
    //B. import static java.util.Collections.*;
    //C. import static java.util.Collections.sort(ArrayList<String>);
    //D. static import java.util.Collections;
    //E. static import java.util.Collections.*;
    //F. static import java.util.Collections.sort(ArrayList<String>);
//B. The two valid ways to do this are import static java.util.Collections.*; and
//import static java.util.Collections.sort;. Option A is incorrect because you
//can only do a static import on static members. Classes such as Collections require
//a regular import. Option C is nonsense as method parameters have no business in
//an import. Options D, E, and F try to trick you into reversing the syntax of import
//static.
}
