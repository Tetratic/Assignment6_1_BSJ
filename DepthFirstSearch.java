/**
    A class that searches a precreated binary tree using a depth first search method..
    @author Brian Johnston
    @version 1.0
*/
public class DepthFirstSearch {

	
	public int counter=0,height=0;
	public double rHeight=0;
	
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}
	
	/**Traverses the tree from the given node
	 * @param n  node from which the search begins, typically the root node.*/
	public void DFS(Node n) {
		System.out.println(n.toString());
		
		
		//check to see if node is a leaf
		if(n.getlChild()==null) {}
		else {
			DFS(n.getlChild());
			DFS(n.getrChild());
			height++;
		}
		counter++;
		
	}
	/**Method used to properly calculate the height of the tree
	 * @return rHeight  the proper height of the tree.*/
	public double calcHeight() {
		height++;
		rHeight =(Math.log((double) height)/Math.log(2));
		return rHeight++;
		//calculating the height by the knowledge of a binary tree
		//using a logarithm with base 2, we can find the height of
		//the tree by adding 1 to the times we have child nodes,
		//taking that result log base 2, and then adding 1 to the final result
	}
}
