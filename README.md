# DataStructAlgo
Try to add the learn topics of Data Structures and Algorithms

1. `binary_tree.py` file contains all the tree node creations such as `root` and `children`. Further it contains methods for `inserting` the element into the tree and main objects.

2. Next, the important operation is *Searching* also mentioned as *Traversal* in the tree, which is of 2 kinds namely `DFS(Depth First Search)` and `BFS(Breadth First Search)`. 
	DFS, as name implies the traversal is performed from `root` until it reaches the leaf node first and then moves to next child(backtracks). This varied with the order of traversal: *pre-order, post-order and in-order traversal*. So DFS in trees is implemented using these order traversals. `order.py` file contains the DFS.
	BFS, starts from root and moves to neighbor nodes first and then moves to neighbor nodes in the next level. 