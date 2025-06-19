package leet.methods.recall;

import leet._class.Tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet104Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(TreeNode root, int expected) {
        int res = new Leet104().maxDepth(root);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        //test1
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        //test2
        TreeNode node2 = new TreeNode(1, null, new TreeNode(2));


        return Stream.of(
//                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12, 3},9,4),
                Arguments.of(node1, 3),
                Arguments.of(node2, 2)
        );
    }
}