import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		// 45, Alex, dog, 3/2/12
		// 32, Dave, cat, 5/4/12
		// CSV Files are comma separated values (data)
		String path = "C:\\Users\\lyeja\\Downloads\\SacramentocrimeJanuary2006.csv";
		String line = "";
		
		try {
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		while((line = br.readLine()) != null) {
			String[] values = line.split(",");
			System.out.println("Date: " + values[0] + "Crime Description: " + values[5]);;
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
