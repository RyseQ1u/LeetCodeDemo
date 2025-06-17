package leet.methods.tree;

import leet._class.Tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet230Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(TreeNode root, int k ,int expected) {
        int res = new Leet230().kthSmallest(root,k);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        //test1
        TreeNode node1 = new TreeNode(3,new TreeNode(1,null,new TreeNode(2)),new TreeNode(4));
        int k1 = 1;

        //test2
        TreeNode node2 = new TreeNode(5,new TreeNode(3,new TreeNode(2,new TreeNode(1),null),new TreeNode(4)),new TreeNode(6));
        int k2 = 3;

        return Stream.of(
//                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12, 3},9,4),
                Arguments.of(node1, k1,1)
                ,Arguments.of(node2, k2,3)
        );
    }
}