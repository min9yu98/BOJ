import java.io.*;

public class Main {

	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				dp[i] = ((dp[i - 1] % 10007) * 2 + 1) % 10007;
			} else {
				dp[i] = ((dp[i - 1] % 10007) * 2 - 1) % 10007;
			}
		}
		System.out.println(dp[n] % 10007);
	}
}
