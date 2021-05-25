import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J10951 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ab;
		int sum;
		while((ab = br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(ab," ");
			sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			System.out.println(sum);
		}
	}

}
