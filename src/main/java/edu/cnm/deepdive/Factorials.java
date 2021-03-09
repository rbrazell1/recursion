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

}
