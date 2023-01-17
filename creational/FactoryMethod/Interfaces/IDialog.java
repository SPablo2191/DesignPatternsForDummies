package creational.FactoryMethod.Interfaces;

// Factory Method => createButton() 
public interface IDialog {
    public void render();

    public IButton createButton();
}
