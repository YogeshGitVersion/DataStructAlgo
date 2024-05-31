 #DFS way of traversing a tree
class DFS:
	#create a root node
	def __init__(self, val):
		self.val = val
		self.left = None
		self.right = None

	def pre_order(self):
		print(self.val)
		if self.left:
			self.left.pre_order()
		if self.right:
			self.right.pre_order()

	def in_order(self):
		if self.left:
			self.left.in_order()
		print(self.val)
		if self.right:
			self.right.in_order()
	
	def post_order(self):
		if self.left:
			self.left.post_order()
		if self.right:
			self.right.post_order()
		print(self.val)


	
	