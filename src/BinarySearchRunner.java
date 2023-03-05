import java.util.Arrays;

public class BinarySearchRunner
{
    public static void main(String[] args)
    {

        /*
        // --- PART A: RUN AND STUDY ME! ---
        // Look at the code for binarySearch to see how it works!

        //    index #: 0   1  2  3   4   5   6   7   8   9  10  11  12  13   14
        int[] arr = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};

        // test when the target is in the middle (found on the first try!)
        int idx = BinarySearch.binarySearch(arr, 23);
        System.out.println("the number 23 was found! it is located at index: " + idx);

        // test when the target is found after TWO iterations
        idx = BinarySearch.binarySearch(arr, 55);
        System.out.println("the number 55 was found! it is located at index: " + idx);

        // test when the target is found after THREE iterations
        idx = BinarySearch.binarySearch(arr, 14);
        System.out.println("the number 14 was found! it is located at index: " + idx);

        // test when the target is found after FOUR iterations (max for array size)
        idx = BinarySearch.binarySearch(arr, 81);
        System.out.println("the number 81 was found! it is located at index: " + idx);

        // test when the target is found after FOUR iterations (max for array size)
        idx = BinarySearch.binarySearch(arr, 17);
        System.out.println("the number 17 was found! it is located at index: " + idx);

        // test when the target is the first item in the array (takes 4 iterations)
        idx = BinarySearch.binarySearch(arr, -10);
        System.out.println("the number -10 was found! it is located at index: " + idx);

        // test when the target is the last item in the array (takes 4 iterations)
        idx = BinarySearch.binarySearch(arr, 108);
        System.out.println("the number 108 was found! it is located at index: " + idx);

        // test when the target is NOT in the array
        idx = BinarySearch.binarySearch(arr, 13);
        System.out.println("the number 13 was NOT found! " + idx);
*/
        // --- PART B: DETAILS! ---
        // When you are ready, uncomment each of these tests and run to see printed commentary
        // alongside every search; this prints out what is being checked and what is happening

        //int[] arr1 = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};
/*
    // test when the target is in the middle (found on the first try!)
    int index = BinarySearch.binarySearchPrintedCommentary(arr1, 23);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is found after TWO iterations
    index = BinarySearch.binarySearchPrintedCommentary(arr1, 55);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is found after THREE iterations
    index = BinarySearch.binarySearchPrintedCommentary(arr1, 14);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is found after FOUR iterations (max for array size)
    index = BinarySearch.binarySearchPrintedCommentary(arr1, 81);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is found after FOUR iterations (max for array size)
    index = BinarySearch.binarySearchPrintedCommentary(arr1, 17);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is the first item in the array (takes 4 iterations)
    index = BinarySearch.binarySearchPrintedCommentary(arr1, -10);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is the last item in the array (takes 4 iterations)
    index = BinarySearch.binarySearchPrintedCommentary(arr1, 108);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/
/*
    // test when the target is NOT in the array
    index = BinarySearch.binarySearchPrintedCommentary(arr1, 13);
    System.out.println(index);
    System.out.println("----------------------------------------------------");
*/

//        int[] arr1 = {-47, -35, -27, -20, -14, -4, 6, 10, 14, 22};
//        System.out.println(Arrays.binarySearch(arr1, -27));
//        int[] arr2 = {-46, -45, -19, -9, 24, 26, 38, 38, 43};
//        System.out.println(Arrays.binarySearch(arr2, -19));
//        int[] arr3 = {-168, -120, -84, -79, -26, -6, -5, -1, 5, 22, 58, 62, 75, 94, 153, 186, 187};
//        System.out.println(Arrays.binarySearch(arr3, -84));
//        int[] arr4 = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};
//        System.out.println(Arrays.binarySearch(arr4, 0));


        //uses overloaded BinarySearch with Object parameters
        String[] strArr1 = {"quote", "crossing", "forbid", "sticky", "barrel", "cheat", "basic", "belly"};
        Arrays.sort(strArr1);
        String[] strArr2 = {"digital", "philosophy", "crystal", "graduate", "precede", "retiree", "entitlement", "explode"};
        Arrays.sort(strArr2);
        System.out.println(Arrays.binarySearch(strArr1, "cheat"));
        System.out.println(Arrays.binarySearch(strArr1, "quote"));
        System.out.println(Arrays.binarySearch(strArr2, "philosophy"));
        System.out.println(Arrays.binarySearch(strArr2, "happy"));

    }
}
