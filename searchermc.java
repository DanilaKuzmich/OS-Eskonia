import java.nio.file.*;

public class searchermc {
   public static void main(String[] args) {	
   
		Path file = Paths.get("eskoniamachine/memoryclear.exe");
		Boolean exists = Files.exists(file);
		System.out.println(exists);
      }
}