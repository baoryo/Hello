import java.io.*;
import java.util.Scanner;

public class TestingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//write();
		//read();
		Scanner input = new Scanner(System.in);
		String con = "y";
		FileWriter fw = new FileWriter("StudentName.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		while(con.equals("y") == true ) {
			System.out.println("Enter a student name: ");
			String name = input.nextLine();
			pw.println(name);
			System.out.println("Do you want to enter another name? y or Y to continue");
			con = input.nextLine();
		}
		pw.close();
		read();

	}
	public static void write() throws IOException  {
		FileWriter fw = new FileWriter("Testing.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("This");
		pw.println("is");
		pw.println("a");
		pw.println("Test");
		pw.println("File");
		
		pw.close();
		System.out.println("Writing is done!!");
	}
	public static void read() throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		Scanner rFile = new Scanner(file);
		while(rFile.hasNext()) {
			String text = rFile.nextLine();
			System.out.println(text);
		}
		rFile.close();
	}

}
