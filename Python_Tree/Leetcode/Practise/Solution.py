# Definition for a binary tree node.
from _ast import List
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:

        while( root ):
            if root.left:
                self.inorderTraversal(root.left)
            print(root.val)
            if root.right:
                self.inorderTraversal(root.right)






