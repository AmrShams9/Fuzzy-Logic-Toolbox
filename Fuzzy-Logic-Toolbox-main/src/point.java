// Class point for making the Tri or Trap shapes
class point{
    double x1,x2,y1,y2,x3,y3,x4,y4 = -1;//max 4 points in TRAP and max 3 points in TRI
    String FuzzySetName;
    String VariableName;
    //TRI
    public point(String fuzzySetName,String VariableName ,double x1, double y1, double x2, double y2,double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y3 = y3;
        this.y1 = y1;
        this.y2 = y2;
        this.FuzzySetName = fuzzySetName;
        this.VariableName = VariableName;
    }
    //TRAP
    public point(String fuzzySetName ,String VariableName,double x1, double y1, double x2, double y2,double x3, double y3,double x4, double y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y3 = y3;
        this.y4 = y4;
        this.y1 = y1;
        this.y2 = y2;
        this.FuzzySetName = fuzzySetName;
        this.VariableName = VariableName;

    }
}