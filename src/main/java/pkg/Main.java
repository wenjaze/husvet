package pkg;

import org.apache.logging.log4j.*;

public class Main {
    private static final long delay = 500;
    private static final Marker statementMarker = MarkerManager.getMarker("STATEMENT");
    private static final Marker requestMarker = MarkerManager.getMarker("REQUEST");
    private static final Logger easterLogger = LogManager.getLogger("easterLogger");

    public static void main(String[] args) throws InterruptedException {

        int nrOfIter = Integer.parseInt(args[0]);

        String[] poem = new String[]
                {"Zöld erdőben jártam.",
                        "Kék ibolyát láttam.",
                        "El akart hervadni.",
                        "Szabad-e locsolni?"};

        for (int i = 0 ; i < nrOfIter;++i){
            easterLogger.warn(poem[0]);
            easterLogger.trace(statementMarker,poem[1]);
            easterLogger.info(statementMarker,poem[2]);
            easterLogger.error(requestMarker,poem[3]);
            Thread.sleep(delay);
        }
    }

}