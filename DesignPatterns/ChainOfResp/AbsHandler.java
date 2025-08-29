package DesignPatterns.ChainOfResp;

abstract class AbsHandler {
    static int info=1;
    static int deboug=2;
    static int error=3;

    protected int level;

    protected AbsHandler nextAbsHandler;

    public void setNextAbsHandler(AbsHandler nextAbsHandler){
        this.nextAbsHandler=nextAbsHandler;
    }

    public void logMessage(int level,String msg){
        if(this.level<=level)
            write(msg);

        if(nextAbsHandler!=null)
            nextAbsHandler.logMessage(level,msg);
    }

    protected abstract void write(String msg);
}
