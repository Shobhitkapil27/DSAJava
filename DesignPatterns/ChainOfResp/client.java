package DesignPatterns.ChainOfResp;

public class client {
    private static AbsHandler getChain(){
        AbsHandler errorLogger=new ErrorLog(AbsHandler.error);
        AbsHandler fileLogger=new FileLog(AbsHandler.deboug);
        AbsHandler infoLogger=new concreteLogger(AbsHandler.info);

        errorLogger.setNextAbsHandler(fileLogger);
        fileLogger.setNextAbsHandler(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbsHandler loggerChain=getChain();

        loggerChain.logMessage(AbsHandler.info,"This is an informational message");
        loggerChain.logMessage(AbsHandler.deboug,"This is an deboug message");
        loggerChain.logMessage(AbsHandler.error,"This is an Error message");
    }
}
