package Practice3;

public class Practice3_2 {

	public static String toString(String[] s)
	{
		StringBuilder temp=new StringBuilder("{");
		for(int i=0;i<s.length;i++)
		{
			if(i!=0)
				temp.append(", ");
			temp.append('"');
			temp.append(s[i]);
			temp.append('"');
		}
		temp.append("}");
		return temp.toString();
		
	}
		
	public static void main(String args[])
	{
		String[] a= {"one","two","three","four"};
		String s=toString(a);
		System.out.println(s);
	}
}
