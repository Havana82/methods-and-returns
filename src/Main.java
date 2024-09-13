public class Main {
    public static void main(String[] args) {
        System.out.println(investment(20000, 40000, 30000));
        System.out.println(investment(60000, 40000, 30000));
        User user1 = new User("bob", "Carson", "example.com", "abcde");
        User user2 = new User("Greg", "Martins", "example2.com", "mypassword");
        System.out.println(user1.getFirstName());
        System.out.println(user2.getLastName());

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