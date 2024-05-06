package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9063 {
//	대지
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int xMin = Integer.MAX_VALUE;
		int xMax = Integer.MIN_VALUE;
		int yMin = Integer.MAX_VALUE;
		int yMax = Integer.MIN_VALUE;
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			xMin = xMin > x? x : xMin;
			xMax = xMax < x? x : xMax;
			yMin = yMin > y? y : yMin;
			yMax = yMax < y? y : yMax;
			
		}
		
		System.out.println((xMax-xMin)*(yMax-yMin));
		
	}

}
