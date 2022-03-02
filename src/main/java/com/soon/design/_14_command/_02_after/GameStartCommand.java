package com.soon.design._14_command._02_after;

import com.soon.design._14_command._01_before.Game;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
