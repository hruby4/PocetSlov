import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class counter {
	int countS = 0;
	int countW = 0;
	int countL = 0;

	public void CountSW() {

		try {
			File file = new File("lm.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (!data.equals("")) {
					for (int i = 0; i < data.length(); i++) {

						if (data.charAt(i) == ' ') {
							countS++;

						}

					}
					String[] words = data.split("\\s+");

					countW += words.length;

				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.println("Count of words is " + countW);
		System.out.println("Count of spaces is " + countS);
	}
}
