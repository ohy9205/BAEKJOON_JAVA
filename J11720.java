import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum += ((int)num.charAt(i)-48);
		}
		
		System.out.println(sum);
		
	}

}
