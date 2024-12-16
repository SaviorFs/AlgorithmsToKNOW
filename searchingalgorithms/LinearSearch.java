package searchingalgorithms;

public class LinearSearch {
    public int search(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
        }
    }
        return -1;
    }


public static void main(String[] args) {
    LinearSearch ls = new LinearSearch();
    int[] nums = {1,2,3,4,5};
    int value = 3;
    int result = ls.search(nums,value);

    if (result != -1) {
        System.out.println("Value found at index: " + result);
    } else {
        System.out.println("Value not found");
    }
}
}