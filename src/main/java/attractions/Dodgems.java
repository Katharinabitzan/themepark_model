package attractions;

import interfaces.ITicketed;
import sun.reflect.generics.visitor.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating){
        super(name, rating);
    }


    public double defaultPrice() {
        return 10;
    }

    public double priceFor(Visitor visitor) {
        if visitor.getHeight()
        return 0;
    }
}