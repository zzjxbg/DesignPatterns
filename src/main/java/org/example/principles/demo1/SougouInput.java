package org.example.principles.demo1;

public class SougouInput {

    private AbstractSkin skin;  //聚合关系

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
