import java.util.ArrayList;

class FuzzySet{
    String setName;
    FuzzySetType setType;  // Type of fuzzy set (TRI/TRAP).
    ArrayList<Double> values;//inputs From User
    FuzzySet(){
        values=new ArrayList<>();
    }
}