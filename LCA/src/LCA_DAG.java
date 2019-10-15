public class LCA_DAG {
  private final int V;
	private int E;
	private ArrayList<Integer>[] adj;
	private int[] indegree;
	public boolean[] marked;
	public boolean[] stack;
	public boolean checkDAG;

	public LCA_DAG(int V) {
		if (V < 0)
			throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		ArrayList<Integer>[] arrayLists = (ArrayList<Integer>[]) new ArrayList[V];
		adj = arrayLists;
		for (int v = 0; v < V; v++) {
			adj[v] = new ArrayList<Integer>();

		}
		checkDAG = true;
		marked = new boolean[V];
		stack = new boolean[V];
}
