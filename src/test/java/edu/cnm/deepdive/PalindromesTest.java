package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PalindromesTest {

  @ParameterizedTest(name = "[{index}] Asserting checkRecursive ({0}) == {1}")
  @CsvFileSource(resources = "palindromes-test-case.csv", numLinesToSkip = 1)
  void checkRecursive(String input, boolean output) {
    assertEquals(output, Factorials.checkRecursive(input));
  }
}