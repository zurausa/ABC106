import java.io.PrintWriter;

public class Main3 {
	private static double day;
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String S = sc.next();
		double K = sc.nextDouble();
		day = Math.pow(10, 15) * 5;
		int res = 0;
		int count = 0;
		while(S.length()>0){
			double top = Double.parseDouble(S.substring(count, count+1));
			double after = Math.pow(top, day);
			if(after>=K){
				res = (int)top;
				break;
			}else {
				K -= after;
				count++;
			}
		}
		out.println(res);
		out.flush();

	}
}