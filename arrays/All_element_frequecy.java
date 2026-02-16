import java.util.Scanner;

class Elements {
    public void freq(int[] arr) {
        int n = arr.length;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " occurs " + count + " times");
                count = 1;
            }
        }

        // Last element frequency
        System.out.println(arr[n - 1] + " occurs " + count + " times");
    }
}

 class All_element_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sorted array size: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter your array elements (sorted): ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        Elements obj = new Elements();
        obj.freq(arr);
    }
}
