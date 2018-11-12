package practice5;

import java.nio.file.Paths;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
public class practice5_1 {

	public static void main(String[] args) throws IOException{
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String filePath="C:\\Users\\jaery\\eclipse-workspace\\JavaPractice\\src\\practice5\\practice5_1.java";
		Scanner scanner=new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		while(scanner.hasNext("[a-zA-Z]+")) {
			String s=scanner.next();
			
			Integer count=map.get(s);
			if(count==null)count=0;
			else
				count++;
			map.put(s, count);
		}
		
		for(String key:map.keySet()) {
			System.out.printf("%s의 갯수: %d",key,map.get(key));
			System.out.println();
		}
		
		scanner.close();
		
	}
}
