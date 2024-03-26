from typing import Optional


class TreeNode:
	def __init__(self, val=0, left=None, right=None):
		self.val = val
		self.left = left
		self.right = right

class Solution:
	def inorderTraversal(self, root: Optional[TreeNode]) -> list[int]:
		res = []
		stack = []
		cur = root
		while cur or stack:
			#goes to left until leaf node 
			while cur:
				stack.append(cur)
				cur = cur.left
			cur = stack.pop()
			res.append(cur.val)
			cur = cur.right
			
		return res
	
	def array_tree(self, array):
		if not array:
			return None
		# define which index is root use : index
		def const_tree(self, index):
			if(len(array) >= 1 and array[index] == None):
				return None
			node = TreeNode(array[index])
			node.left = const_tree(2*index+1)
			node.right = const_tree(2*index+2)
			return node

		return const_tree(0)
Sol = Solution()
#root = TreeNode(1, None, TreeNode(2, TreeNode(3)))
#root = TreeNode(1, TreeNode(2, TreeNode(3, TreeNode(4, None, TreeNode(5, TreeNode(6))))))
#array = [1,2,3,4,5,6]
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)
root.right.left = TreeNode(6)

print(Sol.inorderTraversal(root))
#root = Sol.array_tree(array)
#print(root.val)