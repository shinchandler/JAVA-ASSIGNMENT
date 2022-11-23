package ASSIGNMENT;


public class Q5A {
    public static void main(String[] args) {

        int hours = 23;
        int min = 59;
        int sec = 59;

        for (int i = 1; i <= hours; i++) {
            for (int j = 1; j <= min; j++) {
                for (int k = 1; k <= sec; k++) {
                    if (i == j && j == k) {
                        System.out.println(i + " : " + j + " : " + k);
                    }
                }
            }
        }

    }
}
