package B_Projects.Project_5.Mortgage;

public enum StatesTax {
    NEWYORK(20),
    NEWJERSEY(15),
    FLORIDA(5),
    OHIO(12);

    private int tax;

    private StatesTax(int tax) {
        this.tax = tax;
    }

    public int getTax() {
        return this.tax;
    }
}
