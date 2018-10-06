package Practice3;

public class Practice3_1 {

	static String reverse(String s)
	{
		StringBuilder temp=new StringBuilder(s);
		
		return temp.reverse().toString();
	}
	
	public static void main(String args[]) {
		String s="hello world";
		s=reverse(s);
		System.out.println(s);
	}
}
