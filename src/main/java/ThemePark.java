import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> visitedPlaces;

    public ThemePark(ArrayList<IReviewed> visitedPlaces) {
        this.visitedPlaces = visitedPlaces;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.visitedPlaces;
    }

    public void visit (Visitor visitor, Attraction attraction){

    }
}
