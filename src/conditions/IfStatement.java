package conditions;

public class IfStatement {
    public static void main(String[] args) {
        boolean isAuthenticated = false;
        System.out.println("logged in");
        if (!isAuthenticated)
            System.out.println("not logged in");

//        selling and cost price
        float sellingPrice = 1200, costPrice = 1000;
        System.out.println("profit");
        if (costPrice > sellingPrice)
            System.out.println("Loss");
        else
            System.out.println("no profit or loss");
    }
}
