package sidharth;

public class Gittest1 {

	public static void main(String args[]) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5 - i; j >= 1; j--)
				System.out.print("  ");
			for (int k = 1; k <= i; k++)
				System.out.print("* ");
			System.out.println();
		}
	}

}
