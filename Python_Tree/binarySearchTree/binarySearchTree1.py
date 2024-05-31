class BinarySearchTree1:
	def __init__(self, val):
		self.val = val
		self.left = None
		self.right = None

	def insert_node(self, value):
		#has left child
		if value <= self.val and self.left:
			self.left.insert_node(value)
		#has no left child
		elif value <= self.val:
			self.left = BinarySearchTree1(value)
		#has right child
		elif value > self.val and self.right:
			self.right.insert_node(value)
		#has no right child
		else:
			self.right = BinarySearchTree1(value)


	def findVal(self, val):
		if val < self.val and self.left:
			return self.left.findVal(val)
		if val > self.val and self.right:
			return self.right.findVal(val)
		
		return val == self.val

	def clear_node(self):
		self.val = None
		self.left = None
		self.right = None

	def remove_node(self, val, parent):
		if val < self.val and self.left: #check if node is not present
			return self.left.remove_node(val, self)
		elif val < self.val:
			return False
		elif val > self.val and self.right:
			return self.right.remove_node(val, self)
		elif val > self.val:
			return False
		else:#node is present
			if self.left is None and self.right is None and self == parent.left: #no children and found node is left child
				parent.left = None
				self.clear_node()
			elif self.left is None and self.right is None and self == parent.right: #no children and found node is right child
				parent.right = None
				self.clear_node()
			elif self.left and self.right is None and self == parent.left: #has left child and is left child
				parent.left = self.left
				self.clear_node()
			elif self.left and self.right is None and self == parent.right:#has left and is right
				parent.right = self.left
				self.clear_node()
			elif self.right and self.left is None and self == parent.left:#has right and is left
				parent.left = self.right
				self.clear_node()
			elif self.right and self.left is None and self == parent.right:#has right and is right
				parent.right = self.right
				self.clear_node()
			else:#has left and right
				self.value = self.right.find_minimum_value()
				self.right.remove_node(self.value, self)

			return True



def main():
	BST = BinarySearchTree1(15)
	BST.insert_node(10)
	BST.insert_node(8)
	BST.insert_node(12)
	BST.insert_node(20)
	BST.insert_node(17)
	BST.insert_node(25)
	BST.insert_node(19)


	# print(BST.findVal(15))
	# print(BST.findVal(10))
	# print(BST.findVal(8))
	# print(BST.findVal(12))
	# print(BST.findVal(20))
	# print(BST.findVal(17))
	# print(BST.findVal(25))
	# print(BST.findVal(19))
	# print(BST.findVal(0))

	print(BST.remove_node(18,None))
main()