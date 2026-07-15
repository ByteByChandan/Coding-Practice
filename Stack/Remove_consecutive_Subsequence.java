import java.util.Stack;

public class Remove_consecutive_Subsequence {

    static class Solution {

        public static int[] solution(int[] arr) {

            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < arr.length; i++) {

                if (st.isEmpty()) {
                    st.push(arr[i]);
                } else if (st.peek() != arr[i]) {
                    st.push(arr[i]);
                } else {
                    if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                        st.pop();
                    }
                }
            }

            int[] res = new int[st.size()];

            for (int i = res.length - 1; i >= 0; i--) {
                res[i] = st.pop();
            }

            return res;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 10, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};

        int[] ans = Solution.solution(arr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}