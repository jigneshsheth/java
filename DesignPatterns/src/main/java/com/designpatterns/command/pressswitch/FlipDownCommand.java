package com.designpatterns.command.pressswitch;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 10:33 AM
 */
public class FlipDownCommand implements Command {
  private Light light;

  public FlipDownCommand(final Light light) {
    this.light = light;
  }

  @Override public void execute() {
    light.turnOff();
  }

  @Override public String toString() {
    return "FlipDownCommand{light=" + light + '}';
  }
}
