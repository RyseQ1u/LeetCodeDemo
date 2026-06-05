package methods.linklist.easy;

import leet.methods.hashTable.easy.Leet205;
import leet.methods.stackAndqueue.easy.Leet20;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet205Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet205WithMethodSource(String input1, String input2, boolean expected) {
        boolean res = new Leet205().isIsomorphic(input1, input2);
        Assertions.assertEquals(expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        "foo", "bar",
                        false),
                Arguments.of(
                        "13", "42",
                        true)


        );
    }

}