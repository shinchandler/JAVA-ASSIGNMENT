package ASSIGNMENT;

import java.text.DecimalFormat;
import java.util.*;

public class Q5B {
    public void getTime(int h, int m, int s) {

        Scanner sc = new Scanner(System.in);

        int minh = h - 1;
        int maxh = h + 1;

        DecimalFormat formatter = new DecimalFormat("00");

        int hours = minh;

        while (hours == minh) {
            for (int minutes = m; minutes <= 59; minutes++) {
                if (minutes == m) {
                    for (int seconds = s; seconds <= 59; seconds++) {
                        if (hours % 2 == 0 && minutes % 2 == 0 && seconds % 2 == 0) {
                            System.out.println(formatter.format(hours) + ":" +
                                    formatter.format(minutes) + ":" +
                                    formatter.format(seconds));
                        }
                    }
                } else {
                    for (int seconds = 0; seconds <= 59; seconds++) {
                        if (hours % 2 == 0 && minutes % 2 == 0 && seconds % 2 == 0) {
                            System.out.println(formatter.format(hours) + ":" +
                                    formatter.format(minutes) + ":" +
                                    formatter.format(seconds));
                        }
                    }
                }
            }
            hours++;
        }

        while (hours == minh + 1) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                for (int seconds = 0; seconds <= 59; seconds++) {
                    if (hours % 2 == 0 && minutes % 2 == 0 && seconds % 2 == 0) {
                        System.out.println(formatter.format(hours) + ":" +
                                formatter.format(minutes) + ":" +
                                formatter.format(seconds));
                    }
                }
            }
            hours++;
        }

        while (hours == maxh) {
            for (int minutes = 0; minutes <= m; minutes++) {

                if (minutes == m) {
                    for (int seconds = 0; seconds <= s; seconds++) {
                        if (hours % 2 == 0 && minutes % 2 == 0 && seconds % 2 == 0) {
                            System.out.println(formatter.format(hours) + ":" +
                                    formatter.format(minutes) + ":" +
                                    formatter.format(seconds));
                        }
                    }
                } else {
                    for (int seconds = 0; seconds <= 59; seconds++) {
                        if (hours % 2 == 0 && minutes % 2 == 0 && seconds % 2 == 0) {
                            System.out.println(formatter.format(hours) + ":" +
                                    formatter.format(minutes) + ":" +
                                    formatter.format(seconds));
                        }
                    }
                }
            }
            hours++;
        }

    }

    public static void main(String[] args) {

        Q5B pb = new Q5B();

        pb.getTime(11, 23, 44);
    }
}

