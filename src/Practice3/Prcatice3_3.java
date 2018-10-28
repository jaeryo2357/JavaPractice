package Practice3;



public class Prcatice3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="the";
		
		String temp;
		temp=a.replaceAll("[tT]he","");
		System.out.println(temp);
		temp= a.replaceAll("[tT][hH]e","");
		System.out.println(temp);
	}

}
