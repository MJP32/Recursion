package module2.lesson1;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = new int[]{8,6,5,9,1,2};
        System.out.println("Print Forward Iterative");
        System.out.println(sumArrayHelper(arr));
    }

    private static int sumArrayHelper(int[] arr) {
        return sumArray(arr,0);
    }
    private static int sumArray(int[] arr, int i) {

        if(i==arr.length){
            return 0;
        }

        return arr[i] + sumArray(arr, i+1);

    }
}
