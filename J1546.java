import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J1546 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String score = br.readLine();
		
		StringTokenizer st = new StringTokenizer(score," ");
		
		float[] scoreArray = new float[num];
		
		for(int i=0; i<num; i++) 
			scoreArray[i] = Integer.parseInt(st.nextToken());
		

		Arrays.sort(scoreArray);
		
		float sum=0;
		
		for(int i=0; i<num; i++) {
			scoreArray[i] = scoreArray[i]/scoreArray[num-1]*100;
			sum += scoreArray[i];
		}
		System.out.printf("%.2f",sum/num);
		br.close();
		
	}

}
