import java.util.Arrays;

public class twoSum {
  public static int[] twoSum(int[] nums, int target) {
    int index1 = 0;
    int index2 = 0;
    int check1 = 0;
    int check2 = 0;
    int twoSum = 0;
    int[] twoSumArr = new int[2];
    int length = nums.length;
    for(int i = 0; i < length; i++)
    {
      index1 = i;
      check1 = nums[i];
      for(int j = i+1; j < length; j++)
      {
        check2 = nums[j];
        twoSum = check1 + check2;
        if(twoSum == target)
        {
          index2 = j;
          twoSumArr[0] = index1;
          twoSumArr[1] = index2;
          return twoSumArr;
        }
      }
    }
    return twoSumArr;

  }

  public static void main(String[] args) {
    int[] two = twoSum(new int[]{2, 7, 11, 15}, 9);
    for(int a : two)
    {
      System.out.println(a);
    }

  }
}
