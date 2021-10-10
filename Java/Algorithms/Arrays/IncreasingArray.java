import java.io.*; 
import java.util.*; 


class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
			int sizeOfArray = sc.nextInt();

			Integer[] arr = new Integer[sizeOfArray];

			for(int i=0;i<sizeOfArray; i++)
			{
				arr[i] =sc.nextInt();
			}

			int possibleDiviser =2;

			for(int i= 1;i<sizeOfArray; i++)
			{
				while(possibleDiviser <= arr[i] && arr[i]%possibleDiviser!=0)
				{
					possibleDiviser++;
				}

				if(possibleDiviser> arr[i])
				{
					System.out.println("NO");
					return;
				}
				possibleDiviser++;
			}

			System.out.println("YES");
	}
}
