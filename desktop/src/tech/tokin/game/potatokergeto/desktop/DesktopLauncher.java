package tech.tokin.game.potatokergeto.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import tech.tokin.game.potatokergeto.Globals;
import tech.tokin.game.potatokergeto.UltimateGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Globals.WORLD_WIDTH;
		config.height = Globals.WORLD_HEIGHT;
		new LwjglApplication(new UltimateGame(), config);

	}
}
