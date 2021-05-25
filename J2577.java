import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int mul = a*b*c;
		int length = (int)(Math.log10(a*b*c)+1);
		int[] count = new int[10];
		
		for(int i=0; i<length; i++) {
			count[mul%10]++;
			mul = mul/10;
		}
		
		for(int i=0; i<count.length; i++)
			System.out.println(count[i]);
		
		br.close();
	}

}
