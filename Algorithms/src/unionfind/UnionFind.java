package unionfind;

public class UnionFind {

	public UnionFind() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		int i;
		int count = 10;
		
		QuickFind q = new QuickFind(10);
	
		q.union(8, 3);
		
		for( i = 0; i < count; i++)
		{
			System.out.print(q.getId()[i] + " " );
		}
		*/
		
		  int N = 10;
	       QuickUnion q = new QuickUnion(N);
	       q.union(1, 2);
	       q.union(2, 3);
	       for (int i = 0; i < N; i++)
	        System.out.print(q.id[i] + " ");
	}
}

/**
 *	function find (var element) 
 *	while (element is not the root ) element = element's parent
 * return element
*/

/**
 * function union (var setA, var setB)
 * var rootA = find (setA), rootB = find (setB)
 * if (rootA is equal to rootB ) return
 * else set rootB as rootA's parent
*/

/**
 * union (A, B) - merge A's set with B's set
 * find (A) - finds what set A belongs to
 * */

/**
 *  Each operation takes O(n) time in the worst case, for a total O(n2) runtime
 * */
