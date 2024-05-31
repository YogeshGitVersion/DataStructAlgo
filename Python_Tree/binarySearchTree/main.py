from DFS import DFS
from BFS import bfs
from Node import Node
from search import SEARCH

def main():
    tree = Node('a')
    tree.left = Node('b')
    tree.right = Node('c')
    tree.left.left = Node('d')
    tree.left.right = Node('e')
    tree.right.right = Node('f')
    #      a
    #    /   \
    #   b     c
    #  / \     \
    # d   e     f

    tree1 = Node()
    #
# # --------- DFS ----------
#     d = DFS()
#     print('DFS: ',d.dfs_itrative(tree))
#     print('DFS: ',d.dfs_itrative(tree1))
#     # print(d.dfs_recursive(tree)) #a,b,d,e,c,f
#     # print(d.dfs_recursive(tree1))
# # ---------- BFS ----------
#     b = bfs()
#     print('BFS: ', b.bfs_iterative(tree))

# ----- Search for an element --------
    s = SEARCH()
    print(s.find_iterative(tree, 'a'))

if __name__ == '__main__':
    main()