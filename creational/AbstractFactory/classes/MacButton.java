package creational.AbstractFactory.classes;

import creational.AbstractFactory.interfaces.IButton;

/**
 * MacButton
 */
public class MacButton implements IButton{
    public void paint() {
        System.out.println("Hi, i am Apple button!");
    }

    
}