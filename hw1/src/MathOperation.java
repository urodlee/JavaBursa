public class MathOperation {

	/**
	 * Returns the greatest common divider of given two numbers
	 * 
	 * @param firstNumber
	 *            - positive number
	 * @param secondNumber
	 *            - positive number
	 * @return greatest common divider of two numbers
	 */
	public int getCommonDivisor(int firstNumber, int secondNumber) {
		while (firstNumber != 0 && secondNumber != 0){
			if (firstNumber > secondNumber) {
				firstNumber %= secondNumber;
			} else {
				secondNumber %= firstNumber;
			}
		}
		return firstNumber + secondNumber;
	}

	/**
	 * Returns sum of digits of the given number
	 * 
	 * @param number
	 *            - positive number
	 * @return the sum of digits of the given number
	 */
	public int getSumOfDigits(int number) {
		int getSumOfDigits = 0;
	while(number != 0){
		getSumOfDigits = getSumOfDigits + (number % 10);
		number/=10;
	}
		return getSumOfDigits;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param number
	 * @return 
	 */
	 public boolean isPrime(int number){
			if (number < 2)	return false;
				for (int i = 2; i*i < number-1; i++)
					if (number % i==0)return false;
				return true;
				
			}
	
	/**
	 * Returns sum of row: 1! - 2! + 3! Ц 4! + 5! - Е + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	public static long factorial(int a){
		int result = 1;
		for (int i = 2; i <= a; ++i ){
			result *= i; 
		}
		return result;
	}
	public long getSumOfRow(int n) {
		long result =1;
		for (int i = 2; i <= n; i++){
			if (i % 2 !=0){
				result += factorial(i);
			} else {
				result -= factorial(i);
			}
		}
		return result;
	}

	/**
	 * ѕодсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * 
	 */
	public int getSixDigitNumbersCount() {
		return 0;
	}

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */

	
	public int[] getFibonacciSeries(int length) {
			return null;
	}
	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */
	public int[] getPrimeSeries(int length) {
		// TODO the method body
		return null;
	}

	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 */
	public void printChessboard() {
		// TODO the method body
	}

	/**
	 * 1.9. —оздать целый шестимерный массив с двум€ значени€ми в каждом
	 * измерении. «аполнить массив числами из начала натурального р€да: 1, 2, 3,
	 * Е —казать, сколько потребуетс€ чисел ?
	 * 
	 * @return
	 */
	public int createSixDimensionArray() {
		return 0;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		// TODO the method body
	}
	
	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		
		int gdc = math.getCommonDivisor(10, 15); // 5
		System.out.println("Common Divisor = " + gdc);
		int sumOfDigits = math.getSumOfDigits(123456); // 21
		System.out.println("Sum of digits = " + sumOfDigits);
		boolean isPrime = math.isPrime(7); // true
		System.out.println(isPrime);
		isPrime = math.isPrime(10); //false
		System.out.println(isPrime);
		long sumOfRow = math.getSumOfRow(5);
		System.out.println("Sum of row factorials = " + sumOfRow);
		int count = math.getSixDigitNumbersCount();
		int [] fibbonacci = math.getFibonacciSeries(10); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		//for(int i = 0; i < fibbonacci.length; i++){
		//	System.out.println(fibbonacci[i]);
		//}
		int [] primes = math.getPrimeSeries(5); // 1, 3, 5, 7, 11
		math.printChessboard();
		int numbersCount = math.createSixDimensionArray();
		math.printPascalsTriangle(3);
	}
}
