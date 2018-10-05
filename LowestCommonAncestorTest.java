public class LowestCommonAncestorTest {

 	@Test
	public void testEmpty() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();
    assertTrue("Check empty", testDag.isEmpty() );
		int expectedSize = 0 ;
		assertEquals("Check empty", expectedSize, testDag.size() );
		testDag.addChildNode(null, 5, 5);
		assertEquals("Check !empty", false, testDag.isEmpty());

	}

	@Test
	public void testSize() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();
    testDag.addChildNode(null, 5, 5);
		int expectedSize = 1;
		assertEquals("test size 1", expectedSize, testDag.size() );
		testDag.addChildNode(5, 4, 4);
		testDag.addChildNode(4, 3, 3);
		testDag.addChildNode(3, 2, 2);
		testDag.addChildNode(2, 1, 1);
		expectedSize = 5;
		assertEquals("test size multiple", expectedSize, testDag.size() );

	}

	@Test
	public void testContains() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();

	}

	@Test
	public void testGet() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();

	}
 	@Test
	public void testLCA() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();

	}

	@Test
	public void testMakeChild() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();

	}
}
