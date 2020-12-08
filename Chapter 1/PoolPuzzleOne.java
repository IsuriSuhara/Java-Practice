class PoolPuzzleOne{
	public static void main(String [] args){
		int x=0;
		while(x<1){
			
			if(x<1){
				System.out.print("a");
				System.out.print(" ");
				System.out.print("noise");
			}
			x=x+2;
			x=x+1;
			if(x>1){
				System.out.print("annoys");
				x=x-2;
			}
			if(x==1){
				System.out.print("an");
				System.out.print(" oyster");
			}
			if(x>0){
				x=x-1;
			}
			System.out.println("");
		}
	}
}
