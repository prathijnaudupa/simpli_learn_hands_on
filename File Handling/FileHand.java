import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
  
class FileHand {
    public static void main(String[] args)
    {
  
        // File name specified
        File obj = new File("myfile.txt");
          System.out.println("File Created!");

        String path = System.getProperty("myfile.txt");
        String text = "Added text";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }
    }
}