package B_Projects.Project_5.Mortgage;

public class HousePrices extends Users {
    private int price;

    public HousePrices(String username, String whichCondtiton, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondtiton, houseType, roomCount, downPayment, longTerm, statesTax);
        this.roomCountToPrice();
        this.conditionToPrice();
        this.houseTypeToPrice();
        this.calculateTax();
    }

    public void roomCountToPrice() {
        if (this.getRoomCount() == 0) {
            this.price += 10000;
        } else if (this.getRoomCount() == 1) {
            this.price += 20000;
        } else if (this.getRoomCount() == 2) {
            this.price += 30000;
        } else if (this.getRoomCount() == 3) {
            this.price += 40000;
        } else if (this.getRoomCount() == 4) {
            this.price += 50000;
        } else if (this.getRoomCount() == 5) {
            this.price += 60000;
        }

    }

    public void conditionToPrice() {
        if (this.getWhichCondtiton().equalsIgnoreCase("New")) {
            this.price += 50000;
        } else if (this.getWhichCondtiton().equalsIgnoreCase("Like New")) {
            this.price += 40000;
        } else if (this.getWhichCondtiton().equalsIgnoreCase("Old")) {
            this.price += 30000;
        } else if (this.getWhichCondtiton().equalsIgnoreCase("renew required")) {
            this.price += 15000;
        }

    }

    public void houseTypeToPrice() {
        if (this.getHouseType().equalsIgnoreCase("apartment")) {
            this.price += 20000;
        } else if (this.getHouseType().equalsIgnoreCase("condo")) {
            this.price += 30000;
        } else if (this.getHouseType().equalsIgnoreCase("house")) {
            this.price += 40000;
        }

    }

    public void calculateTax() {
        this.price += this.price * this.getStatesTax().getTax() / 100;
    }

    public int getPriceTotal() {
        return this.price;
    }

    public int getPriceEachMonth() {
        int pesinat = this.price - this.getDownPayment();
        return pesinat / this.getLongTerm();
    }
}

