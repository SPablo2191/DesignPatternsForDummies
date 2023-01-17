# Factory Method:
- The Factory Method separates product construction code from the code that actually uses the product. Therefore it’s easier to extend the product construction code independently from the rest of the code.
- For example, to add a new product type to the app, you’ll only need to create a new creator subclass and override the factory method in it.

````Java 
    // factory method
    IDialog dialog;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese config: windows o web");
    String config = sc.nextLine().toLowerCase();
    sc.close();
    switch (config) {
        case ("windows"):
            dialog = new WindowsDialog();
            break;
        case ("web"):
            dialog = new WebDialog();
            break;
        default:
            dialog = new WebDialog();
            break;
    }
    IButton newbutton = dialog.createButton();
    newbutton.onClick();
````