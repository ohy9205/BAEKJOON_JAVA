import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1065 {
	
	public static int hansu(int num) {

		int count = 99;
		int a,b,c;
		
		if(num<100)
			return num;
		else {
			for(int i=100; i<=num; i++) {
				a = i/100;	
				b = (i/10)%10;	
				c = i%10;	
				
				if(c-b == b-a)
					count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(hansu(Integer.valueOf(br.readLine())));
	}
}
