public class MyFirstApp {
	
	public static void main (String[] args){
		System.out.println("I Rule! The World");
		int x=1;
		String name="Mamba";
		System.out.println("x is "+x);
		double d=Math.random();
		System.out.println("Random number:"+d);
		
		while(x<3){
			System.out.print("Doo");
			System.out.print("Bee");
			x++;
		}//Using while loop I can change the value of x, I originally iniated globally.
		if(x==3){
			System.out.println("Do");
		}
		
		//while(x){
		//	x=x-8;
		//	System.out.println("x is now:"+x);
		//}//int cannot be converted to boolean. A boolean and an integer are not compatible types in Java.
		
		boolean isHot=true;
		while( isHot & x >=1){
			x--;
			System.out.println("I do not like to wear cloths when it is hot");
		}//Since the result of a conditional test must be a boolean, the only variable you can directly test
		//(without using a comparison operator) is a boolean.
		
		for(int y=0;y<10;y++){
			System.out.println("y is  "+y);
		}//within for loop I cannot initiate x again since i declared it in main
		
		if(x==10){
			System.out.println("x must be 10");
		
		}//Assignment operator has one = . Equality operator has two ==. 
		else{
			System.out.println("x is not 10");
		}
		if ((x<3)&&(name.equals("Mamba"))){
			System.out.println("Gentleman");
		}//& symbol evaluate both  conditions.&& only evaluate the second condition if the condition before is true.
		System.out.println("This line runs no mater what");
		
	}
}

