package edu.cnm.deepdive;



public class Factorials {

  public static long computeRecursive(int limit) {
    if (limit < 0) {
      throw new  IllegalArgumentException();
    }
    if (limit == 0) {
      return 1;
    }
    return limit * computeRecursive(limit - 1);
  }

  public static boolean checkRecursive(String palindrome) {
    char[] decomp = palindrome.toCharArray();

    for (int i = 0; i < decomp.length; i++) {
      char x = decomp[i];
      char y = decomp[decomp.length -1 - i];
      Character.compare(x, y);
      if (x != y) {
        return false;
      }
    }

//    for (int k = 0; k < decomp.length; k++) {
//
//    }
    return true;
    }
  }
