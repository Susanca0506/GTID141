
package actividad02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author carde
 */
public class Main {
    
    public static void main(String[] args) {
      Menu menu = new Menu("palabras.txt");
      
      menu.ejecutar();
    }
   
}
