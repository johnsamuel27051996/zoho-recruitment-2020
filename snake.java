public class Test {

	private static int val = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 4;

		for (int j = 0; j < input; j++) {
			for (int i = 1; i < input * 2; i++) {
				System.out.print(val++ + "\t");
			}
			System.out.print("\n");
		}
	}

}
