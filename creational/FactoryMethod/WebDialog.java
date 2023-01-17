package creational.FactoryMethod;

import creational.FactoryMethod.Interfaces.IButton;
import creational.FactoryMethod.Interfaces.IDialog;

public class WebDialog  implements IDialog{

    @Override
    public void render() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
    
}
