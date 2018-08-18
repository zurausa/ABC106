import java.io.PrintWriter;

public class Main2 {

	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int res = 0;
		int N = sc.nextInt();
		for(int i =1;i<=N;i+=2){
			int sum = 0;
			for(int j =1;j <= i / 3;j++){
				if(i % j==0)sum++;
			}
			if(sum == 7)res++;
		}
		out.println(res);
		out.flush();
	}
}