package org.example.patterns.adapter.object_adapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TF card read a msg :hello word TF";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF card write msg : " + msg);
    }

}
