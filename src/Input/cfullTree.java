package Input;

public class cfullTree {
	
	public static void main(String[] args) {
		
		
		    int a=0;
		    int b=0;
		    System.out.print("Fibonacci Series of 6 : ");
		     for(int i=0; i< 3; i++){
		       System.out.print("" + (a+=b)+ " ");
		       if(b==0) ++b;
		       System.out.print("" + (b+=a)+ " ");
		     }
		
	}

}
