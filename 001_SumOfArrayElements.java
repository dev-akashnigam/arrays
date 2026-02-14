package arrays;

class SumOfArrayElements {

    public static int findSum(int[] arr) {
        int n = arr.length;

        int sum = 0;
        // for(int i=0; i<n; i++) {
        //     sum += arr[i];
        // }

        for(int element: arr) {
            sum += element;
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = findSum(arr);
        System.out.printf("Sum = %d%n", sum);
    } 
}
