from queue import Queue

from Node import Node

class SEARCH:
    def find(self, root, target):
        if root is None:
            return False
        return target == root.val or self.find(root.left,target) or self.find(root.right, target)

    def find_iterative(self, root, target):
        if root is None:
            return False
        else:
            queue = Queue()
            queue.put(root)

            while not queue.empty():
                cur = queue.get()
                if cur.val == target:
                    return True
                if cur.left:
                    queue.put(cur.left)
                if cur.right:
                    queue.put(cur.right)
            return False