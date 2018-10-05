import java.util.Scanner;

public class Quick_Find {
		
	private int []id;
	public Quick_Find(int n)
	{
		id = new int[n];
		for(int i=0;i<n;i++)
		{
			id[i]=i;
		}
	}
		boolean connected(int p, int q)
		{
			return true;
		}
		void union(int p, int q)
		{
			int pid = id[p];
			int qid = id[q];
			for(int i=0;i<id.length;i++)
			{
				if(id[i]==pid)
				{
					id[i]=qid;
				}
			}
		
		}
		
			public static void main(String args[])
			{
				/*Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();*/
				Quick_Find qf = new Quick_Find(10);
				qf.union(9,0);
				qf.union(3,4);
				qf.union(5,8);
				qf.union(7,2);
				qf.union(2,1);
				qf.union(5,7);
				qf.union(0,3);
				qf.union(4,2);
				
				
				for(int i=0;i<10;i++) {
					System.out.println(qf.id[i]);
				}
				//sc.close();
			}
			
			
		}
