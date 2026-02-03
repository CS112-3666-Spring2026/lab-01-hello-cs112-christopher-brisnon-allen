/**
 * Room java: Driver class for data type representing Room in Dungeon
 * 
 * Class Invariant: No error checking for number of rooms
 * 
 * @author Christopher Brinson-Allen
 * @version 1.0
 */
public class Room {
    /**
     * Instance Variable
     */
    private int roomNumber;

    /**
     * Default Constructor creates Room with default value
     */
    public Room() {
        this.roomNumber = 0;
    }

    /**
     * Full constructor creates Room with a specific value
     */
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Mutator/Setter changes the value of instance variable
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Accessor/Getter
     * 
     * @return the value of the instance variable
     */
    public int getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * toSring method to output string representing room Number
     * 
     * @return the string Room number: 01
     */
    public String toString() {
        return "Room number: " + roomNumber;
    }

    /**
     * Equals method
     * 
     * @return true/false if two Room objects have the same value
     */
    public boolean equals(Room other) {
        if (other == null) {
            return false;
        }
        return this.roomNumber == other.roomNumber;
    }

    /**
     * Copy Constructor copys the value of one room to another
     */
    public Room(Room other) {
        this.roomNumber = other.roomNumber;
    }
}