package SortigSearching;

public class Searching {
    public static int linearSearching(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int index = linearSearching(arr, target);
        System.out.println(index);
    }
}
