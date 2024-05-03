package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2501 {
	//약수 구하기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				K--;
			}
			
			if(K==0) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
	}

}
