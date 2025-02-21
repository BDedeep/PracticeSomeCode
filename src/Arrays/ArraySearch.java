package Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int target = 9;
        boolean found = false;
        for(int j=0;j<n;j++){
            if(arr[j]==target){
                System.out.println("Element found in :"  + j + " index");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
