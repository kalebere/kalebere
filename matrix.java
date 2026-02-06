import java.util.Scanner;

class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("1. Addition\n2. Multiplication\n3. Transpose of A");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][j] + b[i][j];
                break;

            case 2:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] =
                                a[i][0] * b[0][j] +
                                a[i][1] * b[1][j];
                break;

            case 3:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[j][i] = a[i][j];
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}