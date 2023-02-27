package creational.AbstractFactory.classes;

import creational.AbstractFactory.interfaces.IButton;

/**
 * WinButton
 */
public class WinButton implements IButton{
    public void paint() {
        System.out.println("Hi, i am windows button!");
    }

    
}