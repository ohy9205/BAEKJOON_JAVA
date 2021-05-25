import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int length;
		
		for(int i=0; i<count; i++) {
			int sum=0, ave=0, counting=0;
			String score = br.readLine();
			StringTokenizer st = new StringTokenizer(score," ");
			int[] scoreArray = new int[Integer.parseInt(st.nextToken())];
			length = scoreArray.length;
			
			for(int j=0; j<length; j++) {
				scoreArray[j] = Integer.parseInt(st.nextToken());
				sum+=scoreArray[j];
			}
			
			ave = sum/length;
			
			for(int k=0; k<length; k++) {
				if(scoreArray[k] > ave)
					counting++;
			}
			
			System.out.printf("%.3f%%\n",(float)counting/(float)scoreArray.length*100);
			br.close();
		}
	}

}
