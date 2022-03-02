package com.soon.design._14_command._02_after;

import com.soon.design._14_command._01_before.Game;

//invoker
public class Button{

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(new GameStartCommand(new Game()));
        button.press();
        button.press();
    }

}
