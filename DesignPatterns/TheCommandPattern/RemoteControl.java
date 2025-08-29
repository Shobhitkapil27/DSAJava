package DesignPatterns.TheCommandPattern;

public class RemoteControl {
    public Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
