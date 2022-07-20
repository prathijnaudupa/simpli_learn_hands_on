import java.io.FileReader; 

public class FileRea {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("F:\\Simpli learn\\hello.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    
