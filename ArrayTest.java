import java.util.Arrays;

public class ArrayTest {
  
    String[] arr = {"abc", "def", "xyz"};

    public static void changeArray(String[] aLocalRef, ArrayTest aObject) {
        System.out.println("\taLocalRef Before: " + Arrays.toString(aLocalRef) + " | " + System.identityHashCode(aLocalRef));
        aLocalRef[2] = "ghi";
        System.out.println("\taLocalRef After: " + Arrays.toString(aLocalRef) + " | " + System.identityHashCode(aLocalRef));

        System.out.println("\taObject Arr Before: " + Arrays.toString(aObject.arr) + " | " + aObject);
        aObject.arr[2] = "ghi";
        System.out.println("\taObject Arr After: " + Arrays.toString(aObject.arr) + " | " + aObject);
    }

    public static void main(String[] args) {
        String[] arr = {"abc", "def", "xyz"};
        ArrayTest aObject = new ArrayTest();
        
        System.out.println("Main Arr Before: " + Arrays.toString(arr) + " | " + System.identityHashCode(arr));
        System.out.println("Main aObject Arr Before: " + Arrays.toString(aObject.arr) + " | " + aObject);
        
        changeArray(arr, aObject);

        System.out.println("Main arr After: " + Arrays.toString(arr) + " | " + System.identityHashCode(arr));
        System.out.println("Main aObject Arr After: " + Arrays.toString(aObject.arr) + " | " + aObject);
    }
}
