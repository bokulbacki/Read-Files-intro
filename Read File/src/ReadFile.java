import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile

	{

		public static void main(String[] args) throws IOException
			{
				Scanner names = new Scanner (new File ("names.txt"));
				while (names.hasNext())
					{
						System.out.println(names.next());
					}
				
			}

	}
