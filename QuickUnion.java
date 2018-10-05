 class Example
	{

	private int[] id; 

	private int[] sz; 

	private int count; 

	public Example(int N)

	{

	count = N;

	id = new int[N];

	for (int i = 0; i < N; i++) 

	id[i] = i;

	sz = new int[N];

	for (int i = 0; i < N; i++) sz[i] = 1;

	}

	public int count()

	{ return count; }

	public boolean connected(int p, int q)

	{ return find(p) == find(q); }

	private int find(int p)

	{ 

	while (p != id[p]) p = id[p];

	return p;

	}

	public void union(int p, int q)

	{

	int i = find(p);

	int j = find(q);

	if (i == j)
		return;


	if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }

	else { id[j] = i; sz[i] += sz[j]; }

	count--;

	}
	public void print()
	{
		for(int i=0;i<id.length;i++)
		{
			System.out.print("\t"+id[i]);
		}
		System.out.print("\n");
	}
	}
 
	 public  class QuickUnion
	{
	public static void main(String[] args)
	{
	System.out.println("QUICK UNION");
	Example d1 = new Example(10);
	d1.union(9,0);
	d1.print();
	d1.union(3,4);
	d1.print();
	d1.union(5,8);
	d1.print();
	d1.union(7,2);
	d1.print();
	d1.union(2,1);
	d1.print();
	d1.union(5,7);
	d1.print();
	d1.union(0,3);
	d1.print();
	d1.union(4,2);
	d1.print();
	System.out.println(d1.connected(9,0));
	System.out.println(d1.connected(2,4));
	System.out.println(d1.connected(7,2));
	System.out.println(d1.connected(5,6));
	}
	}


