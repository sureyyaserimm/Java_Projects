package B_Projects.Project_5.Mortgage;

public class Users {

    private String username;
    private String whichCondtiton;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int longTerm;
    private StatesTax statesTax;

    public Users(String username, String whichCondtiton, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        this.setUsername(username);
        this.setWhichCondtiton(whichCondtiton);
        this.setHouseType(houseType);
        this.roomCount = roomCount;
        this.setDownPayment(downPayment);
        this.setLongTerm(longTerm);
        this.setStatesTax(statesTax);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWhichCondtiton() {
        return this.whichCondtiton;
    }

    public void setWhichCondtiton(String whichCondtiton) {
        this.whichCondtiton = whichCondtiton;
    }

    public String getHouseType() {
        return this.houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getRoomCount() {
        return this.roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getDownPayment() {
        return this.downPayment;
    }

    public void setDownPayment(int downPayment) {
        this.downPayment = downPayment;
    }

    public int getLongTerm() {
        return this.longTerm;
    }

    public void setLongTerm(int longTerm) {
        this.longTerm = longTerm;
    }

    public StatesTax getStatesTax() {
        return this.statesTax;
    }

    public void setStatesTax(StatesTax statesTax) {
        this.statesTax = statesTax;
    }
}

