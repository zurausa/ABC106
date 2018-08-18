import java.io.PrintWriter;

public class Main1 {

	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int A = sc.nextInt();
		int B = sc.nextInt();
		out.println(A*B-(A+B-1));
		out.flush();
	}
}