package com.designpatterns.command.pressswitch;

import static com.designpatterns.command.pressswitch.CommandType.*;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 10:41 AM
 */
public class PressSwitchTest {
  public static void main(String... args) {
    Light light = new Light();
    FlipDownCommand flipDownCommand = new FlipDownCommand(light);
    FlipUpCommand flipUpCommand = new FlipUpCommand(light);
    Switch s= new Switch();

    if (args[0].equalsIgnoreCase(ON.toString())){
      s.saveAndExecuteCommand(flipUpCommand);
    }
    if (args[0].equalsIgnoreCase(OFF.toString())){
      s.saveAndExecuteCommand(flipDownCommand);
    }

    s.printCommandHistory();

  }
}
