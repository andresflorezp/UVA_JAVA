import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class LOG {
	static int dp[]=new int[1000001];
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in  = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(new BufferedWriter( new OutputStreamWriter( System.out )));
		
		Arrays.fill(dp, -1);
		dp[0]=1;
		for(;;){
			String x=in.readLine();
			if(x.equals("-1"))break;
			pr.println(f(Integer.parseInt(x)));
			
			
			
			
		}
		pr.close();

	}
	static int f(int i){
		if (dp[i]!=-1) return dp[i];
		dp[(int)i]=dp[(int) ((int)i-Math.sqrt(i)+1e-7)];
		dp[(int)i]+=dp[(int)(Math.log(i)+1e-7)];
		dp[(int)i]%=1000000;
		dp[(int)i]+=(dp[(int) ((int)(i*Math.pow(Math.sin(i),2))+1e-7)]);
		dp[(int)i]%=1000000;
			
	
		return dp[(int) i];
	}
}
