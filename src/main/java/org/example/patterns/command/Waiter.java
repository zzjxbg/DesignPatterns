package org.example.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 请求者角色
 */
public class Waiter {

    //持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command cmd) {
        //将cmd对象存储到list集合
        commands.add(cmd);
    }

    //发起命令功能
    public void orderUp() {
        System.out.println("新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
