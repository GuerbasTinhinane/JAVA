
public class TestTree {
	public static void main(String[] args) {
		Tree<Integer> tree1 = new Tree<Integer>(10);
		tree1.Insert(7);
		tree1.Insert(1);
		tree1.Insert(15);
		tree1.Insert(-2);
		tree1.Insert(9);
		tree1.Insert(3);
		tree1.Insert(0);
		tree1.Insert(12);
		tree1.Insert(-9);
		tree1.Insert(2);
		tree1.Insert(2);
		tree1.Parcours();
		}

}
