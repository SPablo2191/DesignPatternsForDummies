package creational.AbstractFactory.classes;

import creational.AbstractFactory.interfaces.IButton;
import creational.AbstractFactory.interfaces.ICheckbox;
import creational.AbstractFactory.interfaces.IGuiFactory;

/**
 * MacFactory
 */
public class MacFactory  implements IGuiFactory{

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox creatCheckbox() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creatCheckbox'");
    }

    
}