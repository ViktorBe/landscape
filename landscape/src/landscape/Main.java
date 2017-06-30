package landscape;

public class Main {

	public static void main(String[] args) {
		System.out.println("Let the landscape grow!");
		Mountain f = new Mountain("Fudji", 3005);
		int[] a = {6,1,2,3,9,};
		int[] b = {1,2,4,4,7,6};
		f.alg1(8, a);
		f.alg1(8, b);
		
		//System.out.println(f.toString());
	}

}
