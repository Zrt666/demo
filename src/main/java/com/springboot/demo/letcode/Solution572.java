package com.springboot.demo.letcode;

/**
 * 另一个树的子树
 *
 * 给定两个非空二叉树s和t，检验s中是否包含和t具有相同结构和节点值的子树。
 * s的一个子树包括s的一个节点和这个节点的所有子孙。s也可以看做它自身的一颗
 * 子树
 */
public class Solution572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null && t != null) {
            return false;
        }

        // 要么这两个树相同，要么s左子树与t相同，要么s右子树与t相同
        return isSametree(s, t) || isSametree(s.left, t) || isSametree(s.right, t);
    }

    public boolean isSametree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        // 根、左、右子树均相同则表示相同的二叉树
        return s.val == t.val && isSametree(s.left, t.left) && isSametree(s.right, t.right);
    }

}
