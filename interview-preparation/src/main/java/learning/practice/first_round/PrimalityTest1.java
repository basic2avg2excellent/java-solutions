package learning.practice.first_round;

public class PrimalityTest1 {
	public static void main(String[] args) {
		int input = 2;
		boolean checkPrime = checkPrimeNum(input);
		if(checkPrime) {
			System.out.println("Number "+input+" is a prime number");
		}else {
			System.out.println("Number "+input+" is not a prime number");
		}
	}

	private static boolean checkPrimeNum(int input) {
		boolean primeCheck = false;
		if(input == 0 || input == 1 ) return false;
		if(input == 2 || input ==3) return true;
		for(int i=2; i<=input/2; i++) {
			if(input % i == 0) {
				primeCheck = false;
				break;
			}else {
				primeCheck = true;
			}
		}
		return primeCheck;
	}
}