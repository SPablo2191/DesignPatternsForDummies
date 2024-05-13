class ModernFactory : IFurnitureFactory
{
    public IChair CreateChair()
    {
        return new ModernChair();
    }
}