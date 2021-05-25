import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J15596 {

	public static void main(String[] args) {
		
		class Test {
			long sum(int[] a) {
				long sum=0;
				for(int i=0; i<a.length; i++) {
					sum  += a[i];
				}
				return sum;
			}
		}
	}

}
