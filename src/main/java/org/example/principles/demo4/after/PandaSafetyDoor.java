package org.example.principles.demo4.after;

public class PandaSafetyDoor implements AntiTheft,Fireproof,Waterproof{
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }

    public void waterproof() {
        System.out.println("防水");
    }
}
