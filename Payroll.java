public class Payroll {
    private int[] itemsSold = {48,50,37,62,38,70,55,37,64,60};// number of items sold by each employee
    private double[] wages = new double[10];

    //private double[] wages; // wages to be computed in part (b)



    /** Returns the bonus threshold as described in part (a).
     *

     */

    /*(a)   Complete the method computeBonusThreshold below, which is intended to return the bonus threshold based on the contents of the itemsSold array. Assume that itemsSold has been filled appropriately, and that the array contains at least three employees.
    public double computeBonusThreshold() */

    public double computeBonusThreshold()

    {
        double tempTotal = 0;
        double tempMin=0;
        double tempMax=0;

        if (itemsSold[0] > itemsSold[1]){
            tempMax = itemsSold[0];
            tempMin = itemsSold[1];
        }

        if (itemsSold[0] < itemsSold[1]){
            tempMax = itemsSold[1];
            tempMin = itemsSold[0];
        }

        if (itemsSold[0] == itemsSold [1]){
            tempMax = itemsSold[0];
            tempMin = 0;
        }

        for(int i : itemsSold){
            tempTotal += i;
            if (i > tempMax){
                tempMax = i;
            }

            if (i < tempMin){

                tempMin = i;
            }
        }

        ;
        tempTotal = (tempTotal-tempMax-tempMin) / (itemsSold.length-2);

        return tempTotal;


        /* To be implemented in part (a) */


    }



    /** Computes employee wages as described in part (b)

     * and stores them in wages.

     * The parameter fixedWage represents the fixed amount each employee

     * is paid per day.

     * The parameter perItemWage represents the amount each employee

     * is paid per item sold.

     */

    public void computeWages(double fixedWage, double perItemWage)

    {

        /* To be implemented in part (b) */
        int employeeCount = 0;
        for(int i : itemsSold){
            if (i > computeBonusThreshold()){
                wages[employeeCount] = ((fixedWage + i * perItemWage) * 1.1);
            }

            else{
                wages[employeeCount] = (fixedWage + i * perItemWage);
            }
            ++employeeCount;

        }
        System.out.println("Employee 0: " +wages[0]);
        System.out.println("Employee 9: "+wages[9]);
        System.out.println("Bonus Threshold: "+computeBonusThreshold());

    }





// Other instance variables, constructors, and methods not shown.
}
