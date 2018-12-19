import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class app2 {

	private static BufferedReader br;

	public static void main(String[] args) {
		
		 File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
		
			
			String line;
			
			line = br.readLine();
			
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		

	}

}
