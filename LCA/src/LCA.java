import java.util.ArrayList;
import java.util.List;
public class LCA {
	Node root; 
    private List<Integer> path1 = new ArrayList<>(); 
    private List<Integer> path2 = new ArrayList<>(); 
  
    // Finds the path from root node to given root of the tree. 
    int findLCA(int n1, int n2) { 
        path1.clear(); 
        path2.clear(); 
        return findLCAInternal(root, n1, n2);
	
		
	

}
	private int findLCAInternal(Node root, int n1, int n2) { 
    	
    }
