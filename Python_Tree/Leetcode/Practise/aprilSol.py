from typing import List, Optional

from Python_Tree.binarySearchTree.Node import Node

class Solution:
    def isBalanced(self, root: Optional[Node]) -> bool:
        if not root:
            return 0
        bo, height = self.helper(root)

        return bo


    def helper(self,root):
        stat = True
        depth = 0
        # leaf node
        if not root.left and not root.right:
            stat = True
            depth = 1
        # left
        if root.left:
            self.helper(root.left)
        # right
        if root.right:
            self.helper(root.right)
        return stat, depth





def main():
    tree = Node(3)
    tree.left = Node(9)
    tree.left.left = Node(8)
    tree.right = Node(20)
    tree.right.left = Node(15)
    tree.right.right = Node(7)
    #  y    3
    #    /   \
    # y  9      20 y
    #  /       /  \
    #y 8       15   7 y

    sol = Solution()
    print('Final Result: ', sol.isBalanced(tree)) # 3,9,20,15,7
main()