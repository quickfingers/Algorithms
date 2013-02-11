package unionfind;

public class QuickFind {
	
	private int[] id;
	
	public int[] getId() {
		return id;
	}

	/**
	 * @param N
	 */
	public QuickFind(int N) {
		id = new int[N];
		
		for(int i=0; i < N; i++)
		{
			id[i]=i;
		}
	}
	
	/**
	 * @param id1
	 * @param id2
	 * @return
	 */
	public boolean isConnected(int id1, int id2)
	{
		return id[id1] == id[id2];
	}
	
	/**
	 * @param id1
	 * @param id2
	 */
	public void union(int id1, int id2)
	{
		int id_1 = id[id1];
		int id_2 = id[id2];
		
		for (int i = 0; i < id.length; i++)
		{
			if(id[i] == id_1) id[i] = id_2;
		}
	}
	




}
