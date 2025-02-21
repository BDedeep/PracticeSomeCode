package TwoPointerTechnique;

public class findPair {
    public static int[] findPair(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int currentSum = (arr[left] + arr[right]);

            if (currentSum == k) {
                return new int[] {arr[left],arr[right]};
            }else if (currentSum < k) {
                left++;
            }else{
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int k = 6;
        int [] result = findPair(arr, k);
        if(result.length > 0){
            System.out.println("Pair with target Sum: " + result[0] + " ," +  result[1]);
        }else{
            System.out.println("PAIR NOT FOUND");
        }
    }
}
