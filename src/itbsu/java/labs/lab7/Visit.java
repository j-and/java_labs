package itbsu.java.labs.lab7;

public class Visit {
    // private String mode;
    private String visitor;
    // private boolean isPaid;
    private String date;

    public Visit(String visitor, String date) {
        // super();
        this.visitor = visitor;
        this.date = date;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    // public String getMode() {
    // return mode;
    // }
    //
    // public void setMode(String mode) {
    // this.mode = mode;
    // }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
