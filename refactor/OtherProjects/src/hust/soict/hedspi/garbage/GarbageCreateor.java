/**
* @author Đinh Văn Luận - 20215083
*/

package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreateor {
	public static void main(String[] args) throws IOException {
		String filename = "E:/WorkSpace/java_lab/refactor/OtherProjects/src/hust/soict/hedspi/garbage/data.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		
		System.out.println("Dinh Van Luan - 20215083");
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		@SuppressWarnings("unused")
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char)b;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String : " + (endTime - startTime) + "ms");
		
	}
}



