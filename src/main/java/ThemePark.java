import attractions.Attraction;
import interfaces.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.allReviewed = new ArrayList<>();
    }

    public int stallCount() {
        return stalls.size();
    }

    public int attractionsCount() {
        return attractions.size();
    }

    public ArrayList getAllReviewed(){
        return allReviewed();
    }
}
