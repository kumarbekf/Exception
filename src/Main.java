
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car.close();
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("kumar");
            
        } catch (ArithmeticException e) {
            try {
                output.close();
            } catch (ArithmeticException e1) {
                e1.printStackTrace();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);


        }
    }
}


