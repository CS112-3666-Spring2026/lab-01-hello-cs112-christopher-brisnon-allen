/********************************************
 * AUTHORS: Christopher Brinson-Allen - CBA
 * COLLABORATORS: Nadia Arani
 * LAST MODIFIED: 02/03/2026
 *********************************************
 * Lab01
 *********************************************
 * PROGRAM DESCRIPTION:
 * Refresher on CS111 that displays a void, and one that is
 * value-returning and has a least one @parameter. Than
 * create a class with one instance variable, make sure
 * the class represents ONE thing, and the instance variable
 * is something that describes it. In addition, create the following methods
 * 
 * This a simple setup for a Dungeon Floor and Room Number
 * 
 * Methods to include in Room Class
 * toString method
 * mutator/setter for your instance variable
 * accessor/getter for your instance variable
 * default constructor
 * full constructor
 * equals method
 * copy constructor
 *********************************************/
public class Main {

    public static void floorName() {
        System.out.println("Floor: Crypt");
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        floorName();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(r1); // example using copy Constructor

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true

    }

}
