package it.vscalcione.supermario.game.model.brick;

import it.vscalcione.supermario.game.manager.GameEngine;
import it.vscalcione.supermario.game.model.Map;
import it.vscalcione.supermario.game.model.hero.Mario;
import it.vscalcione.supermario.game.model.prize.Prize;
import it.vscalcione.supermario.game.view.ImageLoader;

import java.awt.image.BufferedImage;

public class SurpriseBrick extends Brick{

    private Prize prize;

    public SurpriseBrick(double x, double y, BufferedImage style, Prize prize) {
        super(x, y, style);
        setBreakable(false);
        setEmpty(false);
        this.prize = prize;
    }

    @Override
    public Prize reveal(GameEngine engine){
        BufferedImage newStyle = engine.getImageLoader().loadImage("/sprite.png");
        newStyle = engine.getImageLoader().getSubImage(newStyle, 1, 2, 48, 48);

        if(prize != null){
            prize.reveal();
        }

        setEmpty(true);
        setStyle(newStyle);

        Prize toReturn = this.prize;
        this.prize = null;
        return toReturn;
    }

    @Override
    public Prize getPrize(){
        return prize;
    }
}
