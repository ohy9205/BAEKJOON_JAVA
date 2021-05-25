import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<t; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            sb.append(Integer.parseInt(str.substring(0,target))+Integer.parseInt(str.substring(target+1))).append("\n");
        }
        System.out.println(sb);
        br.close();

    }
}
