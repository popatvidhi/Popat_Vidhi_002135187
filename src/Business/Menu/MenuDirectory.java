/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import UI.MainJFrame;
import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class MenuDirectory {
    private ArrayList<Menu> menuDirectory;
    
    public MenuDirectory() {
        menuDirectory = new ArrayList();
    }

    public ArrayList<Menu> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<Menu> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    public void removeMenu(Menu menu) {
        menuDirectory.remove(menu);
    }
    
    public Menu newItem(String itemName, double price, String res) {
        Menu menu = new Menu(itemName, price, res);
        menuDirectory.add(menu);
        return menu;
    }
    
}
