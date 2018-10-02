import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class LCATest {

@Test 
public void testConstructor() {
	LCA tree = new LCA(); 
    tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3);
}

@Test
public void testLCA() {
	LCA tree = new LCA(); 
    tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 
    tree.root.right.left = new Node(6); 
    tree.root.right.right = new Node(7); 
    
    assertEquals("Checking with working tree" ,2, tree.findLCA(4,5));
    assertEquals("Checking with working tree" ,1, tree.findLCA(4,6));
    assertEquals("Checking with working tree" ,1, tree.findLCA(3,4));
    assertEquals("Checking with working tree" ,2, tree.findLCA(2,4));

}

@Test
public void nullRoot() {
	LCA tree = new LCA(); 
	tree.root = new Node(0);
	tree.root = null;
    assertEquals("Checking with null rooted tree" ,-1, tree.findLCA(0,0));
}

@Test
public void missingNodes() {
	LCA tree = new LCA(); 
	tree.root = new Node(0);
	tree.root.left = new Node(2); 
    tree.root.right = new Node(3);
    tree.root.left.right = new Node(5); 
    tree.root.right.left = new Node(6); 
    assertEquals("Checking with n1 missing" ,-1, tree.findLCA(1,2));
    assertEquals("Checking with n2 missing" ,-1, tree.findLCA(3,1));
    assertEquals("Checking with n1 present" , 3, tree.findLCA(3,6));
    assertEquals("Checking with n1 path >0" , 0, tree.findLCA(6,0));
}

}
