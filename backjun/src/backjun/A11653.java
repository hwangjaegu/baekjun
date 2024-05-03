package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11653 {
//	소인수분해
	
	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		prime = new boolean[N+1];
		
		get_prime();
		
		for(int i=2; i<=N; i++) {
			if(!prime[i]) {
			
			}
		}
	}

	private static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); ) {
			if(prime[i]) continue;
			
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
