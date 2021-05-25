import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class J10952 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num;
		int sum=0;

		while(true) {
			num = br.readLine();
			StringTokenizer st = new StringTokenizer(num," ");
			sum = (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			if(sum==0)
				break;
			
			bw.write(String.valueOf(sum)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
