package module2.lesson1;

public class PrintForward {
    public static void main(String[] args) {
        PrintForward pf = new PrintForward();

        int[] arr = new int[]{8,6,5,9,1,2};
        System.out.println("Print Forward Iterative");
        printForwardIterative(arr);
        System.out.println("\nPrint Forward Recursive");
        printForwardRecursiveHelper(arr);

        System.out.println("\nPrint Backward Iterative");
        printBackwardIterative(arr);
        System.out.println("\nPrint Backward Recursive");
        printBackwardRecursiveHelper(arr);


    }

    private static void printForwardIterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void printBackwardIterative(int[] arr) {
        for (int i = arr.length-1; i >= 0; --i) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void printForwardRecursiveHelper(int[] arr) {
        printForwardRecursive(arr, 0);
    }
    private static void printForwardRecursive(int[] arr, int i) {
        if (i == arr.length)
            return;

        System.out.print(arr[i] + " ");
        printForwardRecursive(arr, i + 1);
    }

    private static void printBackwardRecursiveHelper(int[] arr) {
        printBackwardRecursive(arr, arr.length-1);
    }

    private static void printBackwardRecursive(int[] arr, int i) {
        if (i < 0)
            return;

        System.out.print(arr[i] + " ");
        printBackwardRecursive(arr, i - 1);
    }





}
