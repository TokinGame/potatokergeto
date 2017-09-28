package tech.tokin.game.potatokergeto;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by davim on 2016. 10. 07..
 */

public class MenuStage extends MyStage {

    OneSpriteStaticActor kacsa;
    float elapsedtime = 0;


    public MenuStage(Viewport viewport, Batch batch, Game game) {

        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);

        kacsa = new OneSpriteStaticActor(Assets.manager.get(Assets.DUCK));
        addActor(kacsa);
        kacsa.setSize(100, 100);
        kacsa.setPosition(Globals.WORLD_WIDTH/2-this.getWidth()/2, Globals.WORLD_HEIGHT/2-this.getHeight()/2);
    }


    public void refresh() {
        //backGround.setSize(getViewport().getWorldWidth(),getViewport().getWorldHeight());
    }
    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
           //game.setScreen(new ExitScreen(game));
        }
        return false;
    }


    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        elapsedtime += delta;
        kacsa.setRotation(-elapsedtime*60);
    }

    public void init(){














        refresh();
    }
}

