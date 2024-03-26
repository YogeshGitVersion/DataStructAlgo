from queue import Queue
from Node import Node

class bfs:
    def bfs_iterative(self, root):
        if root is None:
            return []
        queue = Queue()
        queue.put(root)
        result = []
        while not queue.empty():
            cur = queue.get()
            result.append(cur.val)
            if cur.left:
                queue.put(cur.left)
            if cur.right:
                queue.put(cur.right)
        return result
