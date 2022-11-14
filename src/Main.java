import java.util.ArrayList;
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
		arrayListSample();
		
		

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
		
		int[] iAr2 = {1,3,5,6,7};
		String[] sAr2 = {"abc","def"};
		
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
	}

}
