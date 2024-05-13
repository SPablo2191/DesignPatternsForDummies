class VictorianFactory : IFurnitureFactory
{
    public IChair CreateChair()
    {
        return new VictorianChair();
    }
}