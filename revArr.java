public class revArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr);

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed Array:");
        printArray(arr);
    }

    public static void reverse(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, s + 1, e - 1);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
