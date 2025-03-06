package methods.linklist.easy;

import leet._class.ListNode;
import leet.methods.linklist.easy.Leet206;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet206Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet206WithMethodSource(ListNode l1, ListNode expected) {
        ListNode res = new Leet206().reverseList2(l1);
        Assertions.assertEquals (expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1,new ListNode(2,new ListNode(3))),
                        new ListNode(3,new ListNode(2,new ListNode(1)))



                )

        );
    }

}