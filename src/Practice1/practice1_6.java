package Practice1;

public class practice1_6 {

	
	static String[] split1(String s) {
		//replace split
	
		return s.replace(" ", "").split(",");
	}
	
	static String[] split2(String s) {
		//split  trim
		String[] temp=s.split(",");
		
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=temp[i].trim();//trim은 this문자열의 앞 과 뒤의 공백만 제거해줌
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		String s="One , Two ,Three , Four,Five";
		String[] a1=split1(s);
		for(String t:a1)
		{
			System.out.printf("[%s]\n", t);
		}
		String[] a2=split2(s);
				
		for(String t:a2) {
			System.out.printf("[%s]\n", t);
		}
	}
}
