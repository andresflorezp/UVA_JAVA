
public class Max_Sum {
	static int C[]={5,-6,7,12,-3,0,-11,-6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(C.length));
	}
	static int f(int i){
		if (i==0)return 0;
		else{
			return Math.max(f(i-1), C[i-1]+f(i-1));
			
			
		}
		
		
		
	}

}
