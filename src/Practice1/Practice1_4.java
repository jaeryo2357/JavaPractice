package Practice1;

public class Practice1_4 {

	static String removeO(String s) {
		
		return s.replaceAll("[oO]", ""); 
	}
	
	public static void main(String[] args)
	{
		String[] a=new String[] {"One","Two","Three","Four"
				,"Five","hello world","yahoo"};
		for(String s:a)
		{
			String temp=removeO(s);
			System.out.println(temp);
		}
	}
}
