package attractions;

public abstract class Attraction implements interfaces.IReviewed {

    private String name;
    private int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
