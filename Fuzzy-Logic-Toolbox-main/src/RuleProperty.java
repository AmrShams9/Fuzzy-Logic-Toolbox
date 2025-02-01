//Purpose: Holds a variable, set, and the resulting membership for rules

class RuleProperty{
    String varName = null;  // Variable name.
    String SetName = null;  // Set name.
    double Result = -1;     // Membership result.
    String operation = null;// Operation (e.g., NOT, AND, OR).

    public RuleProperty(String varName, String setName, double result) {
        this.varName = varName;
        SetName = setName;
        Result = result;
    }

    public RuleProperty(String operation) {
        this.operation = operation;
    }
}