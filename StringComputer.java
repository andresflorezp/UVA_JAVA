import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class StringComputer {
	static char[] s, t;
	static int[][] memo;
	
	static int dp(int i, int j)
	{
		if(i == s.length)
			return t.length - j;
		if(j == t.length)
			return s.length - i;
		if(memo[i][j] != -1)
			return memo[i][j];
		int ret;
		if(s[i] == t[j])
			ret = dp(i + 1, j + 1);
		else
			ret = 1 + Math.min(dp(i + 1, j + 1), Math.min(dp(i, j + 1), dp(i + 1, j)));
		return memo[i][j] = ret;
	}
	
	static StringBuilder sb;
	
	static void print(int i, int j)
	{
		if(j == t.length)
		{
			while(i < s.length)
				sb.append(String.format("D%c%02d", s[i++], j + 1));
			return;
		}
		if(i >= s.length)
		{
			sb.append(String.format("I%c%02d", t[j], j + 1));
			print(i + 1, j + 1);
			return;
		}
		if(s[i] == t[j])
			print(i + 1, j + 1);
		else
		{
			int opt = dp(i, j);
			if(dp(i + 1, j + 1) + 1 == opt)
			{	
				sb.append(String.format("C%c%02d", t[j], j + 1));
				print(i + 1, j + 1);
			}
			else if(dp(i, j + 1) + 1 == opt)
			{
				sb.append(String.format("I%c%02d", t[j], j + 1));
				print(i, j + 1);
			}
			else
			{
				sb.append(String.format("D%c%02d", s[i], j + 1));
				print(i + 1, j);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		sb = new StringBuilder();
		while(true)
		{
			s = sc.next().toCharArray();
			if(s[0] == '#')
				break;
			t = sc.next().toCharArray();
			memo = new int[s.length][t.length];
			for(int i = 0; i < s.length; ++i)
				Arrays.fill(memo[i], -1);
			print(0, 0);
			sb.append("E\n");
		}
		out.print(sb);
		out.flush();
		out.close();
	}

}
