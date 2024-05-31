class Node:
    def __init__(self, val = None):
        self.val = val
        self.left = None
        self.right = None

def io_manualTree():
    tree = Node(3)
    tree.left = Node(9)
    tree.right = Node(20)
    tree.right.left = Node(15)
    tree.right.right = Node(7)
    #      3
    #    /   \
    #   9      20
    #         /  \
    #        15   7

def io_arrayToTree(array):
    return -1

def io_leetcode_arrayToTree(array):
    return -1
