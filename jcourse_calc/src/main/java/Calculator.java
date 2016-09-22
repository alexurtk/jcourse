
public class Calculator {
    /**
     * Calc result
     */
    private int result;

    /**
     * adds arguments
     * @param params Arguments to sum
     */
    public void add(int ... params){
        for (Integer param : params) {
            this.result += param;
        }
    }

    /**
     * multiplies arguments
     * @param params Arguments
     */
    public void multiple(int ... params){
        for (Integer param : params){
            this.result *= param;
        }
    }

    /**
     * Return result
     * @return Calculation result
     */
    public int getResult(){
        return this.result;
    }

    /**
     * Cleans calculation result
     */
    public void CleanResult(){
        this.result = 0;
    }




}
