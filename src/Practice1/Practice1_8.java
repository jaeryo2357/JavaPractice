package Practice1;

public class Practice1_8 {

	public static boolean isNullEmptyBlank(String s)
	{
		if(s==null)
			return true;
		
		if(s.trim().length()==0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {null,""," ","  "," \t"," \t\n"," . "};
		
		for(String s:a)
			System.out.println(isNullEmptyBlank(s));

	}

}
