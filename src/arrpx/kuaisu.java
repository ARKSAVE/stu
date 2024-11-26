package arrpx;

class kuaisu {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 2, 3, 1, 7, 9};
        ab(arr);
    }

    static void ab(int[] arr) {
        ab(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] ab(int arr[], int low, int high) {
        if (low < high) {
            int jizhun = px(arr, low, high);
            ab(arr, low, jizhun - 1);
            ab(arr, jizhun + 1, high);

        }
        return arr;
    }


    static int px(int[] arr, int low, int high) {


        int cun = arr[low];
        int i = low;
        while (i != high) {
            while (arr[high] > cun) {
                high--;
            }
            while (arr[i] < cun) {
                i++;

            }
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
        }
        return low;

    }
}