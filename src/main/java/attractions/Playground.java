package attractions;

import sun.reflect.generics.visitor.Visitor;

public class Playground extends Attraction implements interfaces.ISecurity {


    public Playground(String name, int rating){

        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() ) return false;
    }
}
