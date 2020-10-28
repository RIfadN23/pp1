import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionV5  {

  private static void leerArchivo() throws IOException, FileNotFoundException{
    FileInputStream fis = null;
    fis = new FileInputStream("myfile.txt");
    int caracter;

    while ((caracter = fis.read()) != -1) {
      System.out.print((char) caracter);
    }
    fis.close();
  } 
  public static void main(String args[]) {
    try {
      leerArchivo();
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}