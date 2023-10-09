/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University, Brian Johnston
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		System.out.println("\n============================\n"); //better readability for the output in the console.
		aSearch.DFS(root);
		
		//additions to the application class to complete the required output.
		aSearch.calcHeight();
		System.out.println("\n============================\n");
		System.out.println("The height of the tree is: " + (int) aSearch.rHeight + ".");
		System.out.println("The total number of nodes traversed is: " + aSearch.counter + ".");

	}

}