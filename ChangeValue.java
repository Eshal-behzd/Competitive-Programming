import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        // Java passes a copy of the reference, so modifying the array affects the original array.
        int[] arr = {1 ,2 ,3 ,4 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
