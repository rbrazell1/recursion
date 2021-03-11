package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FactorialsTest {


  @DisplayName("computeRecursive(non-exceptional)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) == {1}")
  @CsvFileSource(resources = "factorials-test-non-exception.csv", numLinesToSkip = 1)
  void computeRecursive(int input, long output) {
    assertEquals(output, Factorials.computeRecursive(input));
  }

  @DisplayName("computeRecursive(exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) throws IllegalArgumentException")
  @CsvFileSource(resources = "factorials-test-exception.csv", numLinesToSkip = 1)
  void computeRecursive_exception(int input, Class<? extends Throwable> expectedException) {
    assertThrows(expectedException, () -> Factorials.computeRecursive(input));
  }

//  static List<Arguments> provideTestCases() {                 *** Used with @Arguments ***
//    return List.of (
//        Arguments.of(0, 1L),
//        Arguments.of(1, 1L),
//        Arguments.of(5, 120L),
//        Arguments.of(10, 3628800L),
//        Arguments.of(13, 6227020800L)
//        );
//  }
}