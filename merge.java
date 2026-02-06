import java.util.Scanner;

class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 5, n2 = 5;
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n1 + n2];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < n1)
            c[k++] = a[i++];

        while (j < n2)
            c[k++] = b[j++];

        System.out.println("Merged Array:");
        for (int x : c)
            System.out.print(x + " ");
    }
}