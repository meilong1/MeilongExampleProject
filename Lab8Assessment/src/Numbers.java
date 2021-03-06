
public class Numbers {
	public static void main(String[] args){
		System.out.println(isGoofy(12));
		System.out.println(isGoofy(15));
		System.out.println(isGoofy(26));
		System.out.println(isGoofy(8));
		System.out.println(isGoofy(1234));
		System.out.println(getSomeGoofyNumbers(3).toString());
		System.out.println(getSomeGoofyNumbers(15).toString());
	}
	public static boolean isGoofy(int num){
		int digitSum = 0;
		
		int[] divisors = new int[num];
		int divisorsIndex = 0;
		while(num / 10 != 0){
			int check = num % 10;
			for(int i = 1; i <= check; i++){
				boolean isThere = false;
				for(int j = 0; j < divisors.length; j++){
					if(divisors[j] == i || (divisors[j] != 0 && i % divisors[j] == 0)){
						isThere = true;
					}
				}
				if(check % i == 0 && !isThere){
					divisors[divisorsIndex] = i;
					divisorsIndex++;
				}
			}
			num /= 10;
		}
		
		for(int j = 0; j < divisors.length; j++){
			digitSum += divisors[j];
		}
		if(digitSum % 2 != 0){
			return true;
		}
		return false;
		
	}
	public static int[] getSomeGoofyNumbers(int count){
		int[] returnDivisors = new int[count];
		int returnIndex = 0;
		int i = 1;
		while(returnDivisors.toString().contains(" ")){
			
			if(isGoofy(i)){
				returnDivisors[returnIndex] = i;
				returnIndex++;
			}
			i++;
		}
		return returnDivisors;
	}
	
}
