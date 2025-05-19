package leet.methods.doublePointer.middle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Stream;

class Leet15Test {
    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet206WithMethodSource(int[] input1, List<List<Integer>> expected) {
        List<List<Integer>> res = new Leet15().threeSum(input1);
        Assertions.assertEquals(expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of( new int[]{-1,0,1,2,-1,-4}, new ArrayList<ArrayList<Integer>>(){{
                    add(new ArrayList<>(Arrays.asList(-1, -1, 2)));
                    add(new ArrayList<>(Arrays.asList(-1, 0, 1)));
                }})
        );
    }
}