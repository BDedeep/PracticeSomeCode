package Arrays;

public class InsertArray {
    public static void main(String[] args) {
        int[] Arr = {10,20,30,40,50};
        int index = 2;
        int element = 25;
        int n = Arr.length;

        int[] newArr = new int[n + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = Arr[i];
        }
        newArr[index] = element;

        for (int i = index; i < n; i++) {
            newArr[i + 1] = Arr[i];
        }
        for (int nums : newArr){
            System.out.println(nums + " ");
        }
    }
}
