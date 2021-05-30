import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2675 {
	// 입력받을 문자열 개수 입력
	// 반복할 횟수+문자열 -> 1번만큼 반복
	// 반복할 횟수 -> 인트변수에 담음
	// 반복할 문자열 -> 문자열 변수에 담음
	// 인트변수만큼 문자열.charAt[i]반복
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.valueOf(br.readLine());
		
		for(int i=0; i<num; i++) {
			String[] count_word = br.readLine().split(" ");
			
			int count = Integer.valueOf(count_word[0]);
			String word = count_word[1];
	
			for(int y=0; y<word.length(); y++) {
				for(int x=0; x<count; x++) {
				System.out.print(word.charAt(y));
			}
		}
			System.out.println();
		}
	}

}
