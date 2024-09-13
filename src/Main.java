public class Main {
    public static void main(String[] args) {
        System.out.println(investment(20000, 40000, 30000));
        System.out.println(investment(60000, 40000, 30000));

    }
    public static String investment(double savingsAccountBalance, double indexFundBalance, double depositAmount){
            if(savingsAccountBalance > 50000){
                indexFundBalance += depositAmount;
                return "Index fund account updated. New balance: " + indexFundBalance;
            }
            else {
                savingsAccountBalance += depositAmount;
                return  "Savings account updated. New balance: " + savingsAccountBalance;
            }

    }
}