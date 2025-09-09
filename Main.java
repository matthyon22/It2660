//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Matthew Yon: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();

    
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    
    System.out.print("Array in order: ");
    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();

    
    System.out.print("Array in reverse: ");
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    
    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);

   
    System.out.println("Max of (8, 4): " + lab.max(8, 4));
    System.out.println("Min of (8, 4): " + lab.min(8, 4));
    System.out.println("Sum: " + lab.sum(nums));
    System.out.println("Average: " + lab.average(nums));
    System.out.println("Array Max: " + lab.max(nums));
    System.out.println("Array Min: " + lab.min(nums));
  }
}


class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }

  public double average(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return (double) total / nums.length;
  }

  public int max(int[] nums) {
    int maxVal = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxVal) {
        maxVal = nums[i];
      }
    }
    return maxVal;
  }

  public int min(int[] nums) {
    int minVal = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minVal) {
        minVal = nums[i];
      }
    }
    return minVal;
  }
}
