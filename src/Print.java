public class Print implements ISystem
{
    @Override
    public highResolutionSettings getHighResolution()
    {
        return new PrintInHR();
    }

    @Override
    public lowResolutionSettings getLowResolution()
    {
        return new PrintInLR();
    }
}
