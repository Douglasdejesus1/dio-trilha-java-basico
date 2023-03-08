public class Programa {
	public static void main(String[] args) {

		//Scanner in = new Scanner(System.in);
		int t = 2;
		for (int y = 0; y < t; y++) {
			int a = 0;
			int b = 2;
			int n = 10;
			int soma = 0;
			for (int i = 0; i<n; i++) {
				soma=0;
				for(int x=0;x<=i;x++) {
					
					soma+=Math.pow(2,x)*b;
				}
				System.out.print(a+soma);
				System.out.print(" ");
			}
			System.out.println();

			
		}

	}
}
