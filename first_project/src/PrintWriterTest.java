import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException {
		PrintWriter page1 = new PrintWriter("PrintWriterTestResult.txt");
		page1.write("hello1 ");
		page1.write("hello2 ");

		page1.close();
		System.out.println("Task is ended");




	}

}
