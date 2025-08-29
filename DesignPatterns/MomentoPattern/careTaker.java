package DesignPatterns.MomentoPattern;

import java.util.Stack;

public class careTaker {
    public static void main(String[] args) {
        Editor editor=new Editor();
        Stack<Momento> history=new Stack<>();

        editor.type("Hello");
        history.push(editor.save());

        editor.type(" World");
        history.push(editor.save());

        editor.type(", How are you?");
        editor.save();

        editor.restore(history.pop());
        editor.show();

        editor.restore(history.pop());
        editor.show();

    }
}
