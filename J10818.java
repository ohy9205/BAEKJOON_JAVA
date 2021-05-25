import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 사용
		/*
		 * int count = Integer.parseInt(br.readLine()); String num = br.readLine();
		 * 
		 * StringTokenizer st = new StringTokenizer(num," ");
		 * 
		 * int[] array = new int[count];
		 * 
		 * for(int i=0; i<count; i++) array[i] = Integer.parseInt(st.nextToken());
		 * 
		 * int minimum = array[0]; int maximum = array[0];
		 * 
		 * for(int i=0; i<count; i++) { if(minimum > array[i]) minimum = array[i]; else
		 * if(maximum < array[i]) maximum = array[i]; }
		 * System.out.print(minimum+" "+maximum);
		 * 
		 * br.close();
		 */
		
		
		// 배열없이 바로 비교
		Integer.parseInt(br.readLine()); // 이 코드에서는 필요없는 입력
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(min > val)
				min = val;
			if(max < val)
				max = val;
		}
		System.out.println(min+" "+max);
		br.close();
	}
}
