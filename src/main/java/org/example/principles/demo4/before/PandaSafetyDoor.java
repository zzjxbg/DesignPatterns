package org.example.principles.demo4.before;

public class PandaSafetyDoor implements SafetyDoor{

    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }

}
