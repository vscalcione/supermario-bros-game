package it.vscalcione.supermario.game.model.prize;

import it.vscalcione.supermario.game.manager.GameEngine;
import it.vscalcione.supermario.game.manager.MapManager;
import it.vscalcione.supermario.game.model.hero.Mario;

import java.awt.*;

public interface Prize {

    int getPoint();

    void reveal();

    Rectangle getBounds();

    void onTouch(Mario mario, GameEngine engine);

}
