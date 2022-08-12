package mainPkg.test;

import mainPkg.core.EngineManager;
import mainPkg.core.WindowManager;
import mainPkg.core.utils.Consts;
import org.lwjgl.Version;

public class Launcher {

    private static WindowManager window;
    private static TestGame game;

    public static void main(String[] args){
        System.out.println(Version.getVersion());
        window = new WindowManager(Consts.TITLE, 800, 800, false);
        EngineManager engine = new EngineManager();
        game = new TestGame();
        try{
            engine.start();
        } catch (Exception e){
            e.printStackTrace();
        }


    }


    public static WindowManager getWindow() {
        return window;
    }

    public static TestGame getGame() {
        return game;
    }
}
