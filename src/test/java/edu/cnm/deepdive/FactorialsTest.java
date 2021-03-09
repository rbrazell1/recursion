package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FactorialsTest {

  static final long[][] testInput = {
      {0, 1},
      {1, 1},
      {5, 120},
      {10, 3628800},
      {13, 6227020800L},
  };

  @DisplayName("computeRecursive(non-exceptional)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) == {1}")
  @MethodSource("provideTestCases")
  void computeRecursive(int input, long output) {
    assertEquals(output, Factorials.computeRecursive(input));
  }

  @DisplayName("computeRecursive(exceptions)")
  @Test
  void computeRecursive_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

  static Arguments[] provideTestCases() {
    return new Arguments[]{
        Arguments.of(0, 1L),
        Arguments.of(1, 1L),
        Arguments.of(5, 120L),
        Arguments.of(10, 3628800L),
        Arguments.of(13, 6227020800L),
    };
  }
}