package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class baek_15726 {
	public static void main(String[] arigs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());        
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		
		System.out.println(((A * B) / C) > ((A / B) * C) ? (int) ((A * B) / C) : (int) ((A / B) * C));
	}
}