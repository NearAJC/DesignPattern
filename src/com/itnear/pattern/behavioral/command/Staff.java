package com.itnear.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：员工类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class Staff {

    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
