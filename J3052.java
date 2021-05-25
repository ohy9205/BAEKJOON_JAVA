import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3052 {

	public static void main(String[] args) throws IOException {
		// 수 열개 입력 배열에 저장
		// 42로 나눈값 새 배열에 저장
		// 2중포문으로 비교
		// 카운트로 셈
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[10]; // 수 입력하는 배열
		for(int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(br.readLine())%42; // 수 입력
		}
		
		boolean bl;
		int count=1;
		
		for(int i=0; i<array.length; i++) {
			bl = false;
			
			for(int j=0; j<i; j++) {
				if(array[i]==array[j])
					bl = true;
			}
			if(bl==false)
				count++;
		}
		System.out.println(count);
		br.close();
		
	}
}
