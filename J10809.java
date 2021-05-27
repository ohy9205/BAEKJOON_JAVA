import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫 줄에 단어 S (길이 ~100)
//a-z까지 각 알파벳이 나온 위치 출력
//안나온 알파벳은 -1
//시간제한 1초
// baekjoon -> 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
public class J10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		
		String word = br.readLine();
		int count=0;
		
		for(int i='a'; i<='z'; i++) {
			for(int j=0; j<word.length(); j++) {
				if(i==word.charAt(j)) {
					count = j;
					break;
				}
				else
					count = -1;
			}
			st.append(count).append(" ");
		}
		System.out.println(st);
		

	}

}
