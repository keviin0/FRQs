public class ExperimentalFarm {
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }

    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */
    public Plot getHighestYield(String c)
    {
        int bigYield = 0;
        Plot tempPlot = null;
        for (int row = 0; row < farmPlots.length; row++){
            for (int col = 0; col < farmPlots[row].length; col++){
                if (farmPlots[row][col].getCropType() == c){
                    if (farmPlots[row][col].getCropYield() > bigYield ){
                        bigYield = farmPlots[row][col].getCropYield();
                        tempPlot = farmPlots[row][col];
                    }
                }
            }
        }
        if (bigYield > 0){
            return  tempPlot;
        }
        else{
            return null;
        }
    }

    /** Returns true if all plots in a given column in the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */
    public boolean sameCrop(int col) {
        Plot firstPlot = null;
        boolean allSame = false;
        for (int row = 0; row < farmPlots.length; row++) {
            if (row == 0) {
                firstPlot = farmPlots[row][col];
            }

            if (farmPlots[row][col].getCropType() == firstPlot.getCropType()) {
                allSame = true;
            }


        }
        return allSame;

    }


}
