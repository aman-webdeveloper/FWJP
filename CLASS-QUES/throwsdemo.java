
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class throwsdemo 
{
	public void readFile(String filepath)throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		String data = new String(fis.readAllBytes());
		System.out.println("File Data :\n"+data);
		fis.close();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter filename with path : ");
		String filepath= sc.nextLine();
		
		throwsdemo td=new throwsdemo();
		
		try
		{
			td.readFile(filepath);
		}catch(IOException ie)
		{
			System.out.println("Error : "+ie.getMessage());
		}
	}

}