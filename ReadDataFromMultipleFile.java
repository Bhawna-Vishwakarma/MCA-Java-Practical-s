import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ReadDataFromMultipleFile 
{
	public static void main(String[] args) throws IOException
	{
		File[] files = {new File("Factorial.java"), new File("PerfactNumber.java")};

		/* File dir = new File("ReadDataFromMultipleFiles");
		if (dir.exists() && dir.isDirectory()) 
		{
		            File[] files = dir.listFiles();
		            if (files != null) 
			{ */
				for (File file : files) //fetching all files
				{
					if(file.isFile())
					{
						BufferedReader in = null;
						String line;
						try{
							in = new BufferedReader(new FileReader(file));
							while((line = in.readLine()) != null){
								System.out.println(line);
							}
						}catch(IOException e){
							System.out.println(e);
						}finally{
							if(in != null){
								in.close();
							}
						}
					}
				}
			/*}else{
                System.out.println("No files found in the directory.");
			}
		}else{
			System.out.println("Directory does not exist or is not a directory.");
		}*/
	}
}
