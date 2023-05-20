import java.util.Arrays;
import java.util.Scanner;

/**
 * Basic java program that checks if two strings are anagrams
 * Steps:
 * 1. Take two strings from the user (Scanner)
 * 2. Store them as char arrays using Arrays.toCharArray()
 * 3. Use Arrays.sort() to sort the letters of the strings alphabetically
 * 4. Check if the two arrays are equal, if yes, then both strings are anagrams
 * @author Hassan
 */
public class Anagram {
  /**
   * main method
   * @param args none
   */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("enter the first string");
    String first = scnr.nextLine().trim().replaceAll(" ", "");
    while (first.isBlank() || first.isEmpty()){
      System.out.println("enter a valid first string");
      first = scnr.nextLine().trim().replaceAll(" ", "");
    }
    System.out.println("enter the second string");
    String second = scnr.nextLine().trim().replaceAll(" ", "");
    while (second.isBlank() || second.isEmpty()){
      System.out.println("enter a valid second string");
      second = scnr.nextLine().trim().replaceAll(" ", "");
    }
    char[] charFirst = first.toCharArray();
    char[] charSecond = second.toCharArray();
    Arrays.sort(charFirst);
    Arrays.sort(charSecond);
    if (Arrays.equals(charFirst, charSecond)){
      System.out.println("Both strings are valid anagrams");
    }else {
      System.out.println("Both strings are not valid anagrams");
    }
  }
}
