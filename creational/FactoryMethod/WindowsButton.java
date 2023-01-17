package creational.FactoryMethod;

import creational.FactoryMethod.Interfaces.IButton;

public class WindowsButton implements IButton {

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onClick() {
        System.out.println("hola desde button windows");

    }

}
