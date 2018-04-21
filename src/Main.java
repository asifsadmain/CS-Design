public class Main {

    public static void main(String[] args)
    {
        Display display = new Display();
        lowResolutionSettings LR = display.getLowResolution();
        highResolutionSettings HR = display.getHighResolution();
        System.out.println(LR.doForLowResolution());
        System.out.println(HR.doForHighResolution());

        Print print = new Print();
        lowResolutionSettings LRS = print.getLowResolution();
        highResolutionSettings HRS = print.getHighResolution();
        System.out.println(LRS.doForLowResolution());
        System.out.println(HRS.doForHighResolution());

    }
}
