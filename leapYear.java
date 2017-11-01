/*Michael Chong
 * Period 1
 * 11/1/2017
 */

import java.util.Scanner;
public class leapYear {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("What year is it? ");
		int year = in.nextInt();
		if(isLeapYear(year)==true){
			System.out.println("It's a leap year.");
		}else{
			System.out.println("It's not a leap year.");
		}
	}
	public static boolean isLeapYear(int year){
		if(year%400==0){	//conditional for years divisible by 400
			return true;
		}else if(year%100==0){	//conditional for years divisible by 100
			return false;
		}else if(year%4==0){	//conditional for years divisible by 4
			return true;
		}
		return false;
	}
}
