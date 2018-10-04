import java.util.Scanner;

class Percolation 
 {
	boolean[][] p;
	boolean b,d;
	int x,y,r,c,i,j;

	 public Percolation(int n)
	 {
		// create n-by-n grid, with all sites blocked
		 boolean[][] p = new boolean[n][n];
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 p[i][j]=false;
			 }
		 }
	 }
	 @SuppressWarnings("unused")
	private int root()
	 {
		return 0;
		 
	 }
	 public boolean isConnected(int r,int c,int x,int y)
	 {
		if(isOpen(r,c+1)==true)
		{
			union();
		}
		else if(isOpen(r,c-1)==true)
		{
			union();
		}
		else if(isOpen(r-1,c)==true)
		{
			union();
		}
		else if(isOpen(r+1,c)==true)
		{
			union();
		}
		else
		{
			System.out.println("No connectivity");
		}
			return false; 
	 }
	 public void union()
	 {
		 
	 }
	 public  void open(int row, int col)    
	 // open site (row, col) if it is not open already
	 {
		 for(int i=0;i<p.length;i++)
		 {
			 for(int j=0;j<p.length;j++)
			 {
				 if(p[row][col]==false)
				 {
					p[row][col]=true; 
					System.out.println("Site opened successfully!");
				 }
				 else
				 {
					 union();
				 }
			 }
		 }
		 
	 }
	 public boolean isOpen(int row, int col)
	// is site (row, col) open?
	 {
		 int r,c;
		 r= row;
		 c= col;
		 for(int i=0;i<p.length;i++)
		 {
			 for(int j=0;j<p.length;j++)
			 {
				 if(p[r][c]==true)
				 {
					System.out.println("The site is open");
					isConnected(r,c,x,y);
				 }
			 }
		 }
		 
		 return true;
	 }
	 public boolean isFull(int row, int col)
	//is site (row, col) full?
	 {
		 for(i=0;i<r;i++)
		 {
			 for(j=0;j<c;j++)
			 {
				 b =isConnected(r,c,i,j);
			 }
		 }
		 return b;
	 }
	 public int numberOfOpenSites()
	// number of open sites
	 {
		 int count=0;
		 for(int i=0;i<p.length;i++)
		 {
			 for(int j=0;j<p.length;j++)
			 {
				 if(p[i][j]==true)
				 {
					 count= count+1;
				 }
			 }
		 }
		 return count;
	 }
	 public boolean percolates()
	// does the system percolate?
	 {
		 for(i=0;i<r;i++)
		 {
			 for(j=0;j<c;j++)
			 {
				 d =isFull(r,c);
			 }
		 }
		 return d;
	 }
	 
}
public class Solution
{
	public static void main(String[] args)
	{
		int N;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value size of the grid:");
		N=scan.nextInt();
		Percolation p = new Percolation(N);
		p.numberOfOpenSites();
		int r,c,count1=0;
		while(count1<(N*N))
		{
			//scan.hasNext();
			System.out.println("Enter the row value:");
			r=scan.nextInt();
			System.out.println("Enter the col value:");
			c=scan.nextInt();
			p.open(r, c);
		}
		
	}
}
// You can implement the above API to solve the problem
