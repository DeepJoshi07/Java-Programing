import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int ch = 65;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((char) ch) + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < num - i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i) + 1; j++) {
                System.out.print(" " + j + " ");
            }

            System.out.println();
        }
        System.out.println("-------------------");

        int update = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + update + " ");
                update++;
            }

            System.out.println();
        }
        System.out.println("-------------------");

        int zeroOrOne = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                zeroOrOne = 0;
            } else {
                zeroOrOne = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + zeroOrOne + " ");
                if (zeroOrOne == 1) {
                    zeroOrOne = 0;
                } else {
                    zeroOrOne = 1;
                }
            }
            zeroOrOne = 0;
            System.out.println();
        }
        System.out.println("-------------------");

        int total = num * 2;
        for (int i = 1; i <= total; i++) {
            if (i <= (total / 2)) {
                for (int j = 1; j <= total; j++) {
                    if (j <= i || (j > (total - i) && j <= total)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            } else {
                for (int j = 1; j <= total; j++) {
                    if (j <= (total - i) + 1 || j >= i) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }

            System.out.println();
        }
        System.out.println("-----------------------------------");

        for (int i = 1; i <= total; i++) {
            for (int k = i; k <= total; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= total / 2; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        for (int i = 1; i <= total; i++) {
            for (int k = i; k <= total; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= total / 2; j++) {
                if (j == 1 || j == total / 2 || i == 1 || i == total) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        for (int i = 1; i <= total; i++) {
            if (i <= total / 2) {
                for (int k = i; k <= total / 2; k++) {
                    System.out.print("   ");
                }
                for (int j = 1; j < (i * 2); j++) {
                    System.out.print(" * ");
                }
            } else {
                for (int k = (total / 2) + 1; k <= i; k++) {
                    // remove +1 to get perfact
                    System.out.print("   ");
                }
                for (int j = 1; j < (total - i + 1) * 2; j++) {
                    // remove +1 to get perfact
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        for (int i = 1; i <= num; i++) {
            for (int k = i; k <= num; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        int count = 1;
        int highest = count;
        int tracker = 2;
        for (int i = 1; i <= num; i++) {
            for (int k = i; k <= num; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j < i * 2; j++) {
                if (count <= 0) {
                    System.out.print(" " + tracker + " ");
                    tracker++;
                } else {
                    System.out.print(" " + count + " ");
                    count--;
                }

            }
            tracker = 2;
            count = ++highest;
            System.out.println();
        }
    }
}
