#from pre_order import display
from order import DFS
from bfs import BFS

class Tree:
	#create a root node
	def __init__(self, val):
		self.val = val
		self.left = None
		self.right = None

	#insert children
	#Left
	def insert_left(self, val):
		if self.left == None:
			self.left = Tree(val)
		else:
			new_node = Tree(val)
			new_node.left = self.left
			self.left = new_node
	#Right
	def insert_right(self, val):
		if self.right == None:
			self.right = Tree(val)
		else:
			new_node = Tree(val)
			new_node.right = self.right
			self.right = new_node
	
#t1 = Tree(1)
#t2 = Tree(2)
#t3 = Tree(3)
#t1.left = t2.val
#t1.right = t3.val
#print('This creates new node that will be load on Memory', t1.left)

#t1.insert_left(12)
#print('Maintains continuity of the tree: ', t1.left.val)

#--------		
root = Tree('a')
root.insert_left('b')
root.insert_right('c')

p1_l = root.left
p1_l.insert_right('d')

p1_r = root.right
p1_r.insert_left('e')
p1_r.insert_right('f')
#-----------

#root.insert_left(2)
#root.insert_right(3)
#root.left.insert_left(4)
#root.left.insert_right(5)
#root.right.insert_left(6)
#root.right.insert_right(7)


BFS.bfs(root)
