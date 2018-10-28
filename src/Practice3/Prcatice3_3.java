package Practice3;

import java.util.Arrays;

public class Prcatice3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="the";
		String b="The";
		String c="tHe";
		String temp;
		temp=a.replaceAll("[tT]he","");
		System.out.println(temp);
		temp= a.replaceAll("[tT][hH]e","");
		System.out.println(temp);
	}

}
