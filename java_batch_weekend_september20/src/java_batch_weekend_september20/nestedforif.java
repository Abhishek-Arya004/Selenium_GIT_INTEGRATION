package java_batch_weekend_september20;

public class nestedforif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                if (col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

	


