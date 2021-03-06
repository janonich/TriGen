public class TriGen {

	public static void main(String[] args) {

		if (genTri(100) == 1) {
			System.out.println("Cannot handle input. Error: too large");
		}
	}

	private static int genTri(int size) {

		if (size > 1000) {
			return 1;
		}

		for (int a = 1; a <= size; a++) {
			for (int dummy = 1; dummy <= a; dummy++) {

				System.out.print(dummy + " ");
			}

			System.out.print("\n");
		}

		for (int b = size - 1; b >= 0; b--) {
			for (int dummy = 1; dummy <= b; dummy++) {

				System.out.print(dummy + " ");
			}

			System.out.print("\n");
		}

		return 0;
	}

}
