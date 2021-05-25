import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2439 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++)
				sb.append(" ");
			for (int k=n-i-1; k<n; k++)
				sb.append("*");
			sb.append("\n");
		}
		br.close();
		System.out.println(sb.toString());

	}

}
