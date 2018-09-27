package Practice1;

public class Practice1_5 {

	public static void main(String[] args) {
		String[] a= {"  the","world\t","\nwar "};
		
		for(String s:a) {
			System.out.printf("%s %d\n",s.trim(), s.trim().length());
		}
	}//trim은 \t과 \n 둘다 없애줌
}
