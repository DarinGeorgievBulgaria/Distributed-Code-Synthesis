import java.math.BigDecimal;
/**
 * This is the Numbers class which is used simply to access and store the user's input as an object
 * @author Darin Georgiev
 */
public class Numbers implements java.io.Serializable {
    private BigDecimal bd1;
    private BigDecimal bd2;
    private BigDecimal bd3;
    /**
     * This is the Number's contstructor
     * @param bd1 - the first number inputted by the user
     * @param bd2 - the second number inputted by the user
     * @param bd3 - the third number inputted by the user
     */
    public Numbers(BigDecimal bd1, BigDecimal bd2, BigDecimal bd3){
        //super();
        this.bd1 = bd1;
        this.bd2 = bd2;
        this.bd3 = bd3;

    }
    /**
     * This is a getter method to access the first number.
     * @return the first number
     */
    public BigDecimal getnum1(){

        return bd1;
    }
    /**
     * This is a getter method to access the second number.
     * @return the second number
     */
    public BigDecimal getnum2(){

        return bd2;
    }
    /**
     * This is a getter method to access the third number.
     * @return the third number
     */
    public BigDecimal getnum3(){

        return bd3;
    }
    /**
     * This is a setter method which can change the first number
     * @param bd1BigDecimal
     */
    public void setnum1(BigDecimal bd1BigDecimal){
        this.bd1 = bd1BigDecimal;
    }
    /**
     * This is a setter method which can change the second number
     * @param bd2BuBigDecimal
     */
    public void setnum2(BigDecimal bd2BuBigDecimal){
        this.bd2 = bd2BuBigDecimal;
    }
    /**
     * This is a setter method which can change the third number
     * @param bd3BigDecimal
     */
    public void setnum3(BigDecimal bd3BigDecimal){
        this.bd3 = bd3BigDecimal;
    }

}
    
