package project0a;

public class Week3Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//
//		System.out.println((ages[ages.length - 1]) - ages[0]);
//		
//		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 17};
//		
//		System.out.println((ages2[ages2.length - 1]) - ages2[0]);
//		
		
		
//		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		int sum = 0;
//		for (int i = 0; i < names.length; i++) {
//			sum += names[i].length();
//			}
//		System.out.print("The average number of letters per name is: ");
//		System.out.print(sum / names.length);
//		
//		String allNames = "";
//		for (int i = 0; i < names.length; i++) {
//			allNames = allNames.concat(names[i] + " ");
//		}
//		System.out.println(allNames);
//		
		//The last element of an array is accessed by (array.length - 1)
		//The first element of an array is always array[0]
		
//		int nameLengths[] = new int[names.length];
//		for (int i = 0; i < names.length; i++) {
//			nameLengths[i] = names[i].length();
//		}
//		int lenTotal = 0;
//		for (int i = 0; i < nameLengths.length; i++) {
//			lenTotal += nameLengths[i];
//		}
//		System.out.println(lenTotal);
		
//		System.out.println(fullName("Joe", "Smith"));
		
//		System.out.println(wordRepeat("Egg", 4));
		
/*		int[] array = new int[5];
		array[0] = 20;
		array[1] = 5;
		array[2] = 5;
		array[3] = 10;
		array[4] = 40;
		System.out.println(overACentury(array));
		
	*/	
		double[] array = new double[3];
		array[0] = 8.3;
		array[1] = 3.99;
		array[2] = 0.78;
//		System.out.println(average(array));
		
		double[] arr2 = new double[3];
		arr2[0] = 3.26;
		arr2[1] = 2.48;
		arr2[2] = 0.1775;
		
	//	System.out.println(avgCompare(array, arr2));
		
	//	System.out.println(willBuyDrink(true, 11.6));
		
		System.out.println(workoutDay("Monday", true));
	}
	
	public static String fullName(String firstName, String lastName) {
		String full = (firstName + " " + lastName);
		return full;
	}
	public static String wordRepeat(String word, int n) {
		String linkedWord = "";
		for (int i = 0; i < n; i++) {
			linkedWord = linkedWord.concat(word);
			}
		return linkedWord;	
	}
	public static boolean overACentury(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	public static double average(double[] arrayB) {
		double sum = 0;
		for (int i = 0; i < arrayB.length; i++) {
			sum += arrayB[i];
		}
		double avg = sum / arrayB.length;
		return avg;
	}
	
	public static boolean avgCompare(double[] arrA, double[] arrB) {
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < arrA.length; i++) {
			sum1 += arrA[i];
		}
		for (int i = 0; i < arrB.length; i++) {
			sum2 += arrB[i];
		}
		double avg1 = sum1 / arrA.length;
		double avg2 = sum2 / arrB.length;
		if (avg1 > avg2) {
			return true;
		} else {
			return false;
		}            
		}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside = true) && (moneyInPocket > 10.50)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static String workoutDay (String dayOfWeek, boolean yesterday) {
		String workout = "";
		if (dayOfWeek == "Monday" && yesterday == false) {
			workout = "Workout today!";
		} else {
			workout = "Rest up for tomorrow!";
		}
		return workout;
	}
	
	}

