public class Display implements ISystem
{
    @Override
    public highResolutionSettings getHighResolution()
    {
        return new DisplayInHR();
    }

    @Override
    public lowResolutionSettings getLowResolution()
    {
        return new DisplayInLR();
    }
}
