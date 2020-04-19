package it.vscalcione.supermario.game.model.brick;

import it.vscalcione.supermario.game.manager.GameEngine;
import it.vscalcione.supermario.game.model.GameObject;
import it.vscalcione.supermario.game.model.Map;
import it.vscalcione.supermario.game.model.prize.Prize;

import java.awt.image.BufferedImage;

public abstract class Brick extends GameObject{

    private boolean breakable;

    private boolean empty;

    public Brick(double x, double y, BufferedImage style){
        super(x, y, style);
        setDimension(48, 48);
    }

    public boolean isBreakable() {
        return breakable;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Prize reveal(GameEngine engine){ return null;}

    public Prize getPrize() {
        return null;
    }
}
