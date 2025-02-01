import java.util.ArrayList;

class Rule{
    ArrayList<Part> input,output;
    ArrayList<MemberShip> OutputMemberShip;/// Resulting memberships
    Rule(){
        input=new ArrayList<>();
        output=new ArrayList<>();
        OutputMemberShip = new ArrayList<>();
    }
    // copy constructor
    Rule(Rule rCopy){
        this.input=rCopy.input;
        this.output=rCopy.output;
        this.OutputMemberShip = rCopy.OutputMemberShip;
    }
}