import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J10871 {

	public static void main(String[] args) throws IOException{
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		int limit = scan.nextInt();
//		for(int i=0; i<count; i++) {
//			int num = scan.nextInt();
//			if(num<limit)
//				System.out.print(num+" ");
//		}
//		scan.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int limit = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num<limit)
				sb.append(num).append(" ");
		}
		System.out.println(sb.toString());
		br.close();
	}

}
