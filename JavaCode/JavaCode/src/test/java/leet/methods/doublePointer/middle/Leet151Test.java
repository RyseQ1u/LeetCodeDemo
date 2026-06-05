package leet.methods.doublePointer.middle;

import leet._class.linklist.ListNode;
import leet.methods.linklist.middle.Leet86;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Leet151Test {
    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet206WithMethodSource(String input1, String expected) {
        String res = new Leet151().reverseWords(input1);
        Assertions.assertEquals(expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of( "  hello world  ", "world hello"),
                Arguments.of( "a good   example", "example good a")

        );
    }
}