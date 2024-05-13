public class Program{
    public static void Main(string[] args){
        Console.WriteLine("Client: Testing client code with the first factory type...");
        IFurnitureFactory furnitureFactory = new ModernFactory();
        IChair newChair = furnitureFactory.CreateChair();
        newChair.SitOn();
        Console.WriteLine("Client: Testing client code with the second factory type...");
        furnitureFactory = new VictorianFactory();
        newChair = furnitureFactory.CreateChair();
        newChair.SitOn();
    }
}