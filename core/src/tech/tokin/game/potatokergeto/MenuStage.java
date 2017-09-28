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



    public MenuStage(Viewport viewport, Batch batch, Game game) {

        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
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


    public void init(){














        refresh();
    }
}

