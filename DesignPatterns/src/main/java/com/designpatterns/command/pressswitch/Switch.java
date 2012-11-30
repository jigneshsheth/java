package com.designpatterns.command.pressswitch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 10:34 AM
 */
public class Switch {

  private List<Command> commandHistory= new ArrayList<Command>();

  public void saveAndExecuteCommand(Command cmd){
    commandHistory.add(cmd);
    cmd.execute();
  }

  public List<Command> getCommandHistory() {
    return commandHistory;
  }

  public void printCommandHistory() {
    for (Command cmd:commandHistory) {
      System.out.println(cmd.toString());
    }

  }

}
