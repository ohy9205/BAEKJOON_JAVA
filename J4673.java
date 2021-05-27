import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class J4673 {

	
	public static int selfNumber(int n) {
		int self=n;
		while(n>0) {
			self += n%10;
			n=n/10;
		}
		return self;
	}
		
	public static void main(String[] args) throws IOException {

		int[] numArray = new int[10001];
		
		for(int i=1; i<=10000; i++) {
			int num = selfNumber(i);
			if(num<10001)
				numArray[num]++;
		}
		
		StringBuilder st = new StringBuilder();
		
		for(int i=1; i<=10000; i++) {
			if(numArray[i]==0)
				st.append(i).append("\n");
		}
		System.out.println(st);
	}
	
}
