import LowestCommonAncestor
root = LowestCommonAncestor.Node(10)      #node0
root.left = LowestCommonAncestor.Node(7)  #node1
root.left.left = LowestCommonAncestor.Node(3)    #node2
root.left.right = LowestCommonAncestor.Node(8)   #node3
root.right = LowestCommonAncestor.Node(11)       #node4
def test_LCA():
LCAnode = LowestCommonAncestor.findLCA(root,root.left.left,root.left.right)
assert(self.LCAnode.key == 7 )
