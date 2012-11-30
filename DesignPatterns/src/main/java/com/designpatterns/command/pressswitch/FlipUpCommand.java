package com.designpatterns.command.pressswitch;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 10:31 AM
 */
public class FlipUpCommand implements Command {

  private Light light;

  public FlipUpCommand(final Light light) {
    this.light = light;
  }

  @Override public void execute() {
   light.turnOn();
  }

  @Override public String toString() {
    return "FlipUpCommand{light=" + light + '}';
  }
}
