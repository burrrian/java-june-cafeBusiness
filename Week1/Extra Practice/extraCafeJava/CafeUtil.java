import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;

        for (int week = 1; week <= 10; week++) {
            System.out.printf("The week is: %d and the sum is %d \n", week, sum);
            sum += week;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        System.out.println("Hmm");
        // place holder
        double amount = 0;
        for (int loopValue = 0; loopValue < prices.length; loopValue++) {
            // value from the loopValue
            System.out.println("The array values:"+ prices[loopValue] + "The placements are:" + loopValue + "\n");
            amount += prices[loopValue];
        }
        return amount;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int loopValue = 0; loopValue < menuItems.size(); loopValue++){
            System.out.printf("%s %s \n", loopValue, menuItems.get(loopValue));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.printf("Enter name: ");
        String customerName = System.console().readLine();
        System.out.printf("Hey, %s! \n", customerName);
        System.out.printf("There is exactly %s customers ahead of you, \n", customers.size());
        customers.add(customerName);
        // so sysout.println is used for printing out a value vs. printf is to have some
        // logical print
        System.out.println(customers); 
    }
}
