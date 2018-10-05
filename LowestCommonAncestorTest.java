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
    testDag.addChildNode(null, 5, 5);
		assertTrue("test contains true", testDag.contains(5) );
		assertFalse("test contains false", testDag.contains(50) );

	}

	@Test
	public void testGet() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();
    testDag.addChildNode(null, 5, 5);
		Integer expectedResult = 5;
		assertEquals("Check get case1", expectedResult, testDag.get(5) );
		expectedResult = null;
		assertEquals("Check get case2", expectedResult, testDag.get(50) );


	}
 	@Test
	public void testLCA() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();
    testDag.addChildNode(null, 5, 5);
		//side1
		testDag.addChildNode(5, 3, 3);
		testDag.addChildNode(3, 4, 4);
		testDag.addChildNode(3, 2, 2);
		testDag.addChildNode(2, 1, 1);
		//side2
		testDag.addChildNode(5, 7, 7);
		testDag.addChildNode(7, 9, 9);
		testDag.addChildNode(7, 6, 6);
		testDag.addChildNode(9, 8, 8);
		testDag.addChildNode(9, 10, 10);

		Integer expectedResult = 5;
		assertEquals("test LowestCommonAncestor5", expectedResult, testDag.lowestCommonAncestor(7, 3) );

		expectedResult = 3;
		assertEquals("test LowestCommonAncestor3", expectedResult, testDag.lowestCommonAncestor(1, 4) );

		expectedResult = 7;
		assertEquals("test LowestCommonAncestor7", expectedResult, testDag.lowestCommonAncestor(9, 6) );

		expectedResult = 5;
		assertEquals("test LowestCommonAncestor whole tree", expectedResult, testDag.lowestCommonAncestor(10, 1) );

		expectedResult = 9;
		assertEquals("test LowestCommonAncestor5", expectedResult, testDag.lowestCommonAncestor(9, 10) );

	}

	@Test
	public void testMakeChild() {
		DAG<Integer, Integer> testDag = new DAG<Integer, Integer>();
    testDag.addChildNode(null, 5, 5);
		//side1
		testDag.addChildNode(5, 3, 3);
		testDag.addChildNode(3, 4, 4);
		testDag.addChildNode(3, 2, 2);
		testDag.addChildNode(2, 1, 1);
		//side2
		testDag.addChildNode(5, 7, 7);
		testDag.addChildNode(7, 9, 9);
		testDag.addChildNode(7, 6, 6);
		testDag.addChildNode(9, 8, 8);
		testDag.addChildNode(9, 10, 10);

		Integer expectedResult = 5;
		assertEquals("test LowestCommonAncestor5", expectedResult, testDag.lowestCommonAncestor(7, 1) );

		testDag.makeChild(2, 7);

		expectedResult = 2;
		assertEquals("test LowestCommonAncestor5", expectedResult, testDag.lowestCommonAncestor(7, 1) );

	}
}
