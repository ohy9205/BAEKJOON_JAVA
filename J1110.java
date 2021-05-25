import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int a, b, sum=0, count=0;
		int Nnum=num;
		do {
			a = Nnum/10;
			b = Nnum%10;
			sum = a+b;
			Nnum = (b*10)+(sum%10);
			count++;
		} while(num!=Nnum);
		
		System.out.println(count);
		br.close();
	}
}
