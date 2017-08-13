import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Candy {
	static ArrayList<Integer> M,index;
	static int total;
	static int C[][];
	static int veri=Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int row = Integer.parseInt(st.nextToken());
			int column = Integer.parseInt(st.nextToken());
			if(row==0 && column==0)break;
			C= new int[row][column];
			for(int i=0;i<row;i++){
				StringTokenizer valores = new StringTokenizer(in.readLine());
				for(int j=0;j<column;j++){
					C[i][j]=Integer.parseInt(valores.nextToken());
					
				}
				
				
			}
			for(;;){
				if (veri==0 )break;
				f();
				
			}
			System.out.println(total);
			total=0;
			veri=Integer.MAX_VALUE;
			
		}
		
		
	}
	
	
	
	static void f(){
		M= new ArrayList();
		index= new ArrayList();
		for(int[] b:C){
			int maximo=Integer.MIN_VALUE;
			int indice=0;
			for(int i=0;i<b.length;i++){
				
				if(b[i]>maximo){
					maximo=b[i];
					indice=i;
					
				}
	
			}
			
			M.add(maximo);
			index.add(indice);
			

		}
	
		g();
	}
	
	
	static void g(){
		int maximo=Integer.MIN_VALUE;
		int indice=0;
		for(int j=0;j<M.size();j++){
			if(maximo<M.get(j)){
				maximo=M.get(j);
				indice=j;
				
			}
		
			
			
		}
		veri=maximo;
		int busqueda;
		busqueda=busquedaB(M,maximo);
		
		int indi=index.get(busqueda);
		
		total+=C[indice][indi];
	
		cambio(indice,indi);
		
	}
	
	
	
	static void cambio(int i,int j){
		
		if (i-1>=0){
			int d[] = C[i];
			
			for (int k=0;k<d.length;k++){
				C[i-1][k]=0;
			
			}
		}
		if (i+1<C.length){
			int d[] = C[i];
			
			for (int k=0;k<d.length;k++){
				C[i+1][k]=0;
			
			}
		}
		if(j-1>=0){
			C[i][j-1]=0;
			
		}
		int d[]=C[i];
		if(j+1<d.length){
			C[i][j+1]=0;
			
		}
		C[i][j]=0;
		
		
		
	}
	
	static int busquedaB(ArrayList<Integer> B,int b){
		for(int i=0;i<B.size();i++){
			if(B.get(i)==b)return i;
			
			
		}
		return -1;
		
		
		
	}
	
	
}
