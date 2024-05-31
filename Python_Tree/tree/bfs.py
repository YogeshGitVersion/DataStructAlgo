from queue import Queue


class BFS:
	def bfs(self):
		queue = Queue()
		queue.put(self)

		while not queue.empty():
			print('Queue: ',queue)
			cur_node = queue.get()
			print(cur_node.val)

			if cur_node.left:
				queue.put(cur_node.left)
			
			if cur_node.right:
				queue.put(cur_node.right)
		