package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++ variable ki value 1 se Increment kr dega
		// -- variable ki value 1 se Decrement kr dega
		// x=5 --> x++ ---> x=6 post Increment
		// x=5 --> x-- --> x=4 post Decrement
		// x=5 --> ++x ---> x=6 pre Increment
		// x=5 --> --x --> x=4 pre Decrement
		int x = 8;
//		System.out.println(x++);// post Increment 8
//		System.out.println(x); 9
//		int c = x++ - x++ + x-- + 7;
//		System.out.println(c);// 16
//		System.out.println(--x);// pre Decrement
//		System.out.println(x);
		int c = x++ - ++x + --x - --x + --x;
		System.out.println(c);
	}

}
