package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9506 {
	//약수들의 합
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			
			StringBuilder sb2 = new StringBuilder();
			
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) break;
			
			sb2.append(n + " = ");
			
			int sum = 0;
			
			for(int i=1; i<n; i++) {
				if(n%i == 0) {
					sum+=i;
					sb2.append(i + " + ");
				}
			}
			
			sb2.delete(sb2.length()-2, sb2.length());
			
			if(n == sum) {
				sb.append(sb2 + "\n");
			}else {
				sb.append(n + " is NOT perfect.\n");
			}
			
		}
		
		System.out.println(sb);
	}

}
