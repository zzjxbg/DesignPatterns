package org.example.principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        PandaSafetyDoor door = new PandaSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("============");

        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
