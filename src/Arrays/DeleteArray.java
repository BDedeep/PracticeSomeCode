package Arrays;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        int index = 3;

        int[] newArr = new int[n - 1];

        for (int i = 0,j = 0; i < n ; i++) {
            if(i != index){
                newArr[j++] = arr[i];
            }
        }
        for (int nums : newArr){
            System.out.println(nums + " ");
        }
    }
}
