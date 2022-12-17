import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// helloMethod();
		//intSample();
		//longSample();
		//doubleSample();
		//booleanSample();
		//arraySample();
		//arrayListSample();
		//hashmapSample();
		//stringSample();
		accumulateSample();
		maxMinSample();
		

	}

	private static void maxMinSample() {
		// TODO Auto-generated method stub
		int[]  ar = {3, 5, 7, 9, 12,  6, 4, 22, 78, 55, 43, 99, 23};
		int max = Integer.MIN_VALUE;
		
		for (int n:ar) {
			if (max < n) {
				max = n;
			}
		}
		System.out.println(max);
		
		int min = Integer.MAX_VALUE;
		for (int n:ar) {
			if (min > n) {
				min = n;
			}
		}
		System.out.println(min);
		
	}

	private static void accumulateSample() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	private static void stringSample() {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "efgh";
		String s3 = s1 + s2;
		System.out.println(s3);
		
		s1 = "abc def geh";
		String[] sa = s1.split(" ");
		for (String s:sa) {
			System.out.print(s+",");
		}
		System.out.println();
		
		s1 = "abcABCdefABCgeh";
		sa = s1.split("A");
		for (String s:sa) {
			System.out.print(s+",");
		}
		System.out.println();
		
		s1 = "I am a student.";
		s2 = s1.substring(2, 8);
		System.out.println(s2);
		s2 = s1.substring(4);
		System.out.println(s2);

		s1 = "adfsafsdafdsafdsafdsajf;sdafjs;adfjsda;fdsajf;sdafjdsa;lfj;dsaf";
		int index = s1.indexOf("fs");
		System.out.println(index);
		index = s1.lastIndexOf("fds");
		System.out.println(index);
		index = s1.indexOf("abc");
		System.out.println(index);
		
		index = s1.indexOf("fds");
		while (index>=0) {
			System.out.print(index+",");
			index = s1.indexOf("fds", index+3);
		}
		System.out.println();
		
		s1 = "abc";
		s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("abc"));
		System.out.println(s1.equals("bcd"));
		
	}
	

	private static void hashmapSample() {
		// TODO Auto-generated method stub
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("Baby", "Child under 3 years old.");
		dictionary.put("Father", "Male parent");
		dictionary.put("Mother", "Female parent");
		dictionary.put("Brother", "Male of the same parents");
		dictionary.put("Sister", "Female of the same parents");
		
		System.out.println(dictionary);
		
		String key="Father";
		System.out.println("The meaning of "+key +" is '" + dictionary.get(key)+"'");
		key = "Sister";
		System.out.println("The meaning of "+key +" is '" + dictionary.get(key)+"'");
	}

	private static void arrayListSample() {
		// TODO Auto-generated method stub
		// int -- Integer, double -- Double, long -- Long, boolean -- Boolean
		ArrayList<Integer> iAl = new ArrayList<>();
		System.out.println(iAl);
		System.out.println(iAl.size());
		iAl.add(1);
		iAl.add(2);
		System.out.println(iAl);
		System.out.println(iAl.size());
		iAl.add(3);
		iAl.add(4);
		System.out.println(iAl);
		System.out.println(iAl.size());
		
		System.out.println(iAl.get(1));
		iAl.set(1, 200);
		System.out.println(iAl);
		
		iAl.remove(1);
		System.out.println(iAl);
		
		iAl.add(1, 2);
		System.out.println(iAl);
		
		System.out.println(iAl.contains(3));
		System.out.println(iAl.contains(100));
		
		System.out.println(iAl.indexOf(3));
		
		Collections.sort(iAl);
	}

	private static void arraySample() {
		// TODO Auto-generated method stub
		// integer array
		int[] iAr = new int[10];
		iAr[0] = 10;
		iAr[1] = 11;
		iAr[2] = 12;
		iAr[3] = 13;
		System.out.println(iAr[0]+","+iAr[1]+","+iAr[2]);
		
		String[] sAr = new String[3];
		sAr[0] = "abc";
		sAr[1] = "bcd";
		sAr[2] = "efg";
		System.out.println(sAr[0]+","+sAr[1]+","+sAr[2]);
		
		int[] iAr2 = {7,5,3,6,1};
		String[] sAr2 = {"abc","def"};
		Arrays.sort(iAr2);
		for (Integer i:iAr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println(iAr.length +"," + sAr.length +","+iAr2.length +","+sAr2.length);
		
		/*
		 * for loop statement
		 * format:
		 * for (initiation; boolean condition; updating per loop) {
		 * 		do anything (other statement)
		 * }
		 * 
		 * 1. repeat the "other statement" several times.
		 * 2. before enter the loop do "initialiation".
		 * 3. When the "boolean condition" is true, continue the loop until becomes false
		 * 4. at the end of each loop , do "updating per loop";
		 */
		
		for (int i=0; i<iAr.length; i++) {
			iAr[i]= 10*i;
		}
		
		for (int i=0; i<iAr.length;i++) {
			System.out.print(iAr[i]+",");
		}
		System.out.println();
		
	}

	private static void booleanSample() {
		// TODO Auto-generated method stub
		/*
		 *  boolean algebra:
		 *  	values: true, false
		 *  	operation: and, or, not
		 *  		and:	true and true -> true
		 *  				true and false -> false
		 *  				false and true -> false
		 *  				false and false -> false
		 *  		or:		true or true -> true
		 *  				true or false -> true
		 *  				false or true -> true
		 *  				false or false -> false
		 *  		not: 	not true -> false
		 *  				not false -> true
		 */
		
		boolean a, b;
		System.out.print("Please input boolean a and b: ");
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		
		System.out.println("a && b=" + (a && b));
		System.out.println("a || b=" + (a || b));
		System.out.println("!a =" + (!a));
		
		int x, y;
		System.out.print("Please input integers x and y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		a = x > y;
		b = x == y;
		System.out.println("a="+a+",b="+b);
		a = x >= y;
		b = x <= y;
		System.out.println("a="+a+",b="+b);
		
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		double a,b;
		
		System.out.print("Please input a and b: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("a,b="+a+","+b);
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
	}

	private static void longSample() {
		// TODO Auto-generated method stub
		long a,b;
		
		System.out.print("Please input a and b: ");
		a=sc.nextLong();
		b=sc.nextLong();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
	}

	private static void intSample() {
		// TODO Auto-generated method stub
		int a,b;
		
		System.out.print("Please input a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
	}

	private static void helloMethod() {
		// TODO Auto-generated method stub
		
		System.out.print("Please input your name:");
		String name=sc.nextLine();
		
		System.out.println("Hello World, "+name+"!");
		
		// 1 +... +100;
		int i=1;
		int sum =0;
		while(i<=100) {
			sum += i;
			i++;
		}
		
		i=1;
		sum =0;
		do {
			sum += i;
			i++;
		} while(i<=100);
		
		sum =0;
		for (i=0;i<=100;i++) {
			sum += i;
		}
		
		i=1;
		sum = 0;
		for (;i<=100;) {
			sum += i;
			i++;
		}
	}

}
