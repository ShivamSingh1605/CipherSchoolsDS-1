package primitiveDT;

public class artisticpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 60;
		for(int i=0;i<2*size+1;i++)
		{
			if(i==0 || i==2*size) //first line or last line
			{
				System.out.print("+");
				for(int j=0;j<2*size;j++)
				{
					System.out.print("-");
				}
				System.out.print("+");
				System.out.println();
			}
			else if(i==size)
			{
				System.out.print("|<");
				for(int j=0;j<2*size-2;j++)
				{
					if(size%2==0) //even
					{
						System.out.print("-");
					}
					else
					{
						System.out.print("=");
					}
				}
				System.out.print(">|");
				System.out.println();
			}
			else if(i<size)
			{
				System.out.print("|");
				for(int j=0;j<size-i;j++)
				{
					//spaces at starting
					System.out.print(" ");
				}
				System.out.print("/");
				for(int j=0;j<2*i-2;j++)
				{
//					minuses or equals print
					if(i%2==0) //even
					{
						System.out.print("-");
					}
					else
					{
						System.out.print("=");
					}
					
				}
				System.out.print("\\");
				for(int j=0;j<size-i;j++)
				{
					//spaces at ending
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();//leave a line after each line gets printed
			}
			else
			{
				int x = 2*size - i;
				System.out.print("|");
				for(int j=0;j<i-size;j++)
				{
					//spaces at starting
					System.out.print(" ");
				}
				System.out.print("\\");
				for(int j=0;j<2*x-2;j++)
				{
//					minuses or equals print
					if(x%2==0) //even
					{
						System.out.print("-");
					}
					else
					{
						System.out.print("=");
					}
					
				}
				System.out.print("/");
				for(int j=0;j<i-size;j++)
				{
					//spaces at ending
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();//leave a line after each line gets printed
			}
		}
	}

}
