import java.io.*;

public class RCall {

	public static void main(String args[]) {
		
		Process theProcess = null;
		BufferedReader inStream = null;
		// Path of our R Script path
		String dataDir = "helloRWorld.R";
		// Path of Rscript software
		// Add Rscript.exe to your Path variable.. R\R-3.5.1\bin\x64\Rscript.exe (in Windows)
		String environments = "Rscript";

		System.out.println("Calling to R Script ...");
 
		try {
			theProcess = Runtime.getRuntime().exec(String.format("%s %s", environments, dataDir));
		} catch(IOException e) {
			System.err.println("Error in exec() method");
			e.printStackTrace();
		}
		    
		// Read R output
		try {
			inStream = new BufferedReader(
				new InputStreamReader( theProcess.getInputStream() )
			);
			System.out.println(inStream.readLine());
		} catch(IOException e) {
			System.err.println("Error in inStream.readLine()");
			e.printStackTrace();
		}
	}
} 