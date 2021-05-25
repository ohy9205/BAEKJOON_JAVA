import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int i=0;
		int count=0;
		int sum=0;
		
		String[] test = new String[num];
		
		while(i<num) {
			test[i] = br.readLine();
			
			count=0;
			
			for(int j=0; j<test[i].length(); j++) {
				if(test[i].charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else
					count=0;
			}
			System.out.println(sum);
			sum=0;
			i++;
		}
		br.close();
	}

}
