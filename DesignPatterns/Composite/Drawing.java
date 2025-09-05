package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Graphic {

    List<Graphic> children = new ArrayList<>();

    public void add(Graphic g){
        children.add(g);
    }

    public void remove(Graphic g){
        children.remove(g);
    }

    @Override
    public void Draw() {
       for(Graphic g:children)
           g.Draw();
    }
}
