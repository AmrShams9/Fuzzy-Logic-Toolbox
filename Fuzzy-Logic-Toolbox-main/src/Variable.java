import java.util.ArrayList;

class Variable{
    String varName;

    VarType vType;  // IN or Out

    long lower,upper; //Bounds

    double crispValue = -1; //Each Input have Crisp Value To Calculate Memberships ,assigned to -1indicate that the variable has not yet been assigned a meaningful value for its crisp (precise, non-fuzzy) representation.


    ArrayList<FuzzySet> fuzzySets;

    ArrayList<MemberShip> MemberShips;// Intercept values For Each Variable

    ArrayList<point> points;//Each Variable Have Points Of its FuzzySets

    Variable(){
        fuzzySets=new ArrayList<>();

        points=new ArrayList<>();

        MemberShips=new ArrayList<>();
    }
}