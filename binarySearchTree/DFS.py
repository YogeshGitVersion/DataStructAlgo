from Node import Node
class DFS:
    def dfs_itrative(self, root):
        if root.val == None:
            return []
        stack = [root]
        result = []
        while stack:
            cur = stack.pop()
            result.append(cur.val)
            if cur.right:
                stack.append(cur.right)
            if cur.left:
                stack.append(cur.left)
        return result

    def dfs_recursive(self, root): #similar to pre-order trav
        if root.val == None:
            return []
        result = [root.val]
        if root.left:
           result.extend(self.dfs_recursive(root.left))
        if root.right:
           result.extend(self.dfs_recursive(root.right))
        return result