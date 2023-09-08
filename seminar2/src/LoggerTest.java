import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger((LoggerTest.class.getName()));
        writeFileToText("TEST",100);
//        try {
//            FileWriter fileWriter = new FileWriter("text.txt");
//            fileWriter.write("hello");
//            fileWriter.flush();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        try{
//            FileHandler fileHandler = new FileHandler("mylog.txt");
//            fileHandler.setFormatter((new SimpleFormatter()));
//            logger.addHandler(fileHandler);
//            logger.setLevel(Level.ALL);
//            logger.info("This is info message");
//            logger.warning("This is warning message");
//            logger.severe("This is severe message");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void writeFileToText(String str, int N) {
        try {
            FileWriter fileWriter = new FileWriter("task4.txt");
            for (int i = 0; i < N; i++) {
                fileWriter.write(str + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
