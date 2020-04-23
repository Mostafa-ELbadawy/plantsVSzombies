package mygame;

import com.jme3.app.SimpleApplication;
import mygame.allObjects.level;
import mygame.allObjects.level01;
import mygame.allObjects.theGameMenu;


/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 *
 * @author normenhansen
 */
public class Main extends SimpleApplication{

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
  
    @Override
    public void simpleInitApp() {

             stateManager.attach(new theGameMenu(this));
    }


}
