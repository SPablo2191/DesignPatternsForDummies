package creational.AbstractFactory.classes;

import creational.AbstractFactory.interfaces.IButton;
import creational.AbstractFactory.interfaces.ICheckbox;
import creational.AbstractFactory.interfaces.IGuiFactory;

public class WinFactory implements IGuiFactory {

    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ICheckbox creatCheckbox() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creatCheckbox'");
    }
    
}
