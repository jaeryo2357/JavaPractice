package Practice2;

public class StringBuilderTest {

	public static void main(String args[])
	{
		StringBuilder test=new StringBuilder("");
		
		test.append("와타시");
		test.append(" 이끼타이");
		
		test.deleteCharAt(5);
		test.reverse();
		
		System.out.println(test);
	}
}
