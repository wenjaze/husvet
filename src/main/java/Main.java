import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.appender.ConsoleAppender;

public class Main {

    static final Logger easterLogger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        /* TODO
         *
         *  Get args -> i, log poem i times;
         *
         * */
        String[] poem = new String[]
                {"Zöld erdőben jártam.",
                        "Kék ibolyát láttam.",
                        "El akart hervadni.",
                        "Szabad-e locsolni?"};


        easterLogger.trace("Zöld erdőben jártam.");
    }

}