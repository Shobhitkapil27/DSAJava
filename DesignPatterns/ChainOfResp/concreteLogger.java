package DesignPatterns.ChainOfResp;

public class concreteLogger extends AbsHandler{

    public concreteLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Out:: Logged Message : "+msg);
    }
}

class ErrorLog extends AbsHandler{

    public ErrorLog(int level){
        this.level=level;
    }
    @Override
    protected void write(String msg) {
        System.out.println("Error out :: Logged Message : "+msg);
    }
}

class FileLog extends AbsHandler{

    public FileLog(int level){
        this.level=level;
    }
    @Override
    protected void write(String msg) {
        System.out.println("File out :: Logged Message : "+msg);
    }
}
