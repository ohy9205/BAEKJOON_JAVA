import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[9];
		
		for(int i=0; i<9; i++)
			array[i] = Integer.parseInt(br.readLine());
		
		int max=array[0];
		int index=0;
		
		for(int i=1; i<9; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		System.out.print(max+"\n"+(index+1));
		br.close();
	}

}
