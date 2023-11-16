package activities;
public class Q90a {
	public static void main(String[] args) {
        int n = 5; // Number of lines

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}