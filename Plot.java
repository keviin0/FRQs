public class Plot {

    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield)
    {
        cropType = "corn";
        cropYield = 30;
    }

    public String getCropType()
    {
        return cropType;
    }

    public int getCropYield()
    {
        return cropYield;
    }



}
