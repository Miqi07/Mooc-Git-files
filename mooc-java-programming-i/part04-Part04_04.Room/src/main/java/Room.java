public class Room {
    // 1. Declare the private instance variables
    private String code;
    private int seats;

    // 2. Create the constructor to assign incoming values to variables
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
}
