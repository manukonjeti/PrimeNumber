package mypackage;

public class PrimeNum {
	static boolean primenumber(int a) {
		for(int i=1; a/2>i;i++){
			
			if(a%i==0) {
				return false;
				//System.out.println(a+" is prime number");
			}
			//System.out.println(a+" isnot prime number");
		}
		return true ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		if(primenumber(num)) {
			System.out.println(num+" is prime number");
		}
		System.out.println(num +" is not prime number");
	}

}
