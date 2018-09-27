package Practice1;

public class Practice1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a=new String[] {"One","Two","Three","Four","Five"
				,"hello world"};
		
		for(String s:a) {
			int count=getVoewlCount(s);
			System.out.printf("%s %d\n", s,count);
		}
	}
	static int getVoewlCount(String s) {
		
		String Voewl="aeiou";
		int Count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Voewl.contains((""+s.charAt(i)).toLowerCase())) // 대문자를 소문자로 바꾼 뒤 비교
			{
				Count++;
			}		
		}
		return Count;
	}

}
