package week1.singletonpatternexample;

public class Logger {
    private static Logger loggerInstance;
    private Logger(){

    }
    public static Logger getInstance(){
        if(loggerInstance == null){
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }
}
