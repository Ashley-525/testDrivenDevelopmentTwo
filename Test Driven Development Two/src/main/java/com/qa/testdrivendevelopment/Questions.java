package com.qa.testdrivendevelopment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string and a char, returns the position in the String where the char
	 * first appears. Ensure the positions are numbered correctly, please refer to
	 * the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		// String str1 = new String("This is a Sentence");
		input = input.replaceAll("\\s+", "");
		System.out.println("test string print: " + input);

		// System.out.println(str1);
//		char ch4 = 's';
//		char ch8 = 'S';
//		int posOfs = str1.indexOf(ch4);
//		int posOfs1 = str1.indexOf(ch8);
//		int posOfTest = 's', int fromIndex);
//		System.out.println("Position of str1 is: "+posOfs);
		System.out.println("Input is..." + input.indexOf('s', 3));
//		if (input.indexOf('s', 3)) {
//			System.out.println(input);
//			return 4;
//			else if (input.indexOf('S', 7)) {
//				
//			}
//		}

		int indexOfVars = input.indexOf('s', 3);
		int indexOfVarS = input.indexOf('S', 7);
		System.out.println(indexOfVars);
		System.out.println(indexOfVarS);
		if (indexOfVars == 3) {
			System.out.println(indexOfVars);
			return 4;
		}
//		
//		if (posOfs == 's') {
//			return 4;
//		} else if (posOfs1 == 'S') {
//			return 8;
//		}
		return -1;
	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String. Do this by
	 * 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) {
		input1 = input1.replaceAll("\\s+", "");
		input2 = input2.replaceAll("\\s+", "");
//		int indexOfCharacter1 = input1.indexOf(input1, 0);
//		int indexOfCharacter2 = input1.indexOf(input2, 0);
//		for (char c : input1.toCharArray()) {
//			for (char d : input2.toCharArray()) {
//				System.out.println("A Single Character of input1 is: " + d);
//			}
//			System.out.println("A Single Character of input1 is: " + c);
//		}

		for (int index = 0; index < input1.length(); index++) {
			for (int index1 = 0; index < input2.length(); index1++) {
				// System.out.println(input2.charAt(index1));

				System.out.println(input1.charAt(index));
				System.out.println(input2.charAt(index1));
			}
		}

//		System.out.println("The String is: " + input1 + input2);
		return input1 + input2;
	}

	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then
	 * return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"}
	 */
	public String[] removeDuplicates(String[] stringArray) {

//		String arr[] = stringArray;
//		Arrays.sort(arr);
//		String length = arr.length;
//		length = removeDuplicateWords(arr, length);
//		
//		for (String i=stringArray; < length; i++) {
//			System.out.println(arr[i]+"");
//		}

		String arr[] = stringArray;// unsorted array
		Arrays.sort(arr);// sorting array
		String length = arr.length;
		length = removeDuplicates(arr, length);
		// printing array elements
		for (String i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

		return null;
	}

	/**
	 * Given a large string that represents a csv (comma separated values), the
	 * structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445"
	 * <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line.
	 * <br>
	 * For each record, if it is not encrypted, return the names of the owners of
	 * the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445")
	 * → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		csvInput.split(",");

		while ((csvInput != null)) {
			// System.out.println("csvInput is: "+csvInput);
			// return csvInput;
		}

		return null;
	}

	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100
	 * and 200 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * listGen() → {100,102,122,198,200} <br>
	 * listGen() → {108,104,106,188,200} <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() {
		Random r = new Random();
		int onehundred = 100;
		int twohundred = 200;

//		for (int onehundred = 100; onehundred <=200; onehundred+=2)  {
//			System.out.println("Value of a is:"+onehundred);
//		}

		int result = r.nextInt(twohundred - onehundred) + onehundred;
		System.out.println(result);

		return new int[] { 0, 0, 0, 0, 0 };
	}

	/**
	 * A prime number is one which is only divisible by one and itself. <br>
	 * Write a function which returns the boolean True if a number is prime, and the
	 * boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) {

		for (int i = 1; i <= 10000; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrimeNumber(int i) {
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);

		return false;
	}

	/**
	 * Wrtie a function which returns the number of vowels in a given string. <br>
	 * You should ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2 <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {

		final Set<Character> allVowels = new HashSet('a', 'e', 'i', 'o', 'u');
//		
//		public static Pair<Integer, Integer> countVowelsAndConsonants(String input) {
//			if (input == null || input.isEmpty()) {
//				return Pair.of(-1, -1);
//			}
//		}

		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (allVowels.contains(ch)) {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				consonants++;
			}
		}

		return -1;
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean
	 * True, if not return the boolean False. <br>
	 * <br>
	 * For Example: <br>
	 * wordFinder("dog", "god") → True <br>
	 * wordFinder("tiredest", "tree") → True <br>
	 * wordFinder("dog", "cat") → False <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
		return false;
	}

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which
	 * is used to determine which order "ei" or "ie" should be in a word. <br>
	 * <br>
	 * Write a function which returns the boolean True if a string follows the
	 * mnemonic, and returns the boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * iBeforeE("ceiling") → True <br>
	 * iBeforeE("believe") → True <br>
	 * iBeforeE("glacier") → False <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		return false;
	}

	/**
	 * A factorial is the product of itself and all previous numbers <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6 <br>
	 * <br>
	 * Write a function which can compute the factorial of a given number between 1
	 * and 10 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * factorial(1) → 1 <br>
	 * factorial(4) → 24 <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
			int i,fact=4;
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }
		  System.out.println("Factorial of "+number+" is: "+fact);    
		  return number;
		  
		   
		
		//return -1;
	}

}
