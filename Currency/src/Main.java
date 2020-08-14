import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            double purchasePrice = Double.parseDouble(in.readLine());
            double cash = Double.parseDouble(in.readLine());
            Main.calculateChange(purchasePrice, cash);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void calculateChange(double purchasePrice, double cash) {
        // Access your code here. Feel free to create other classes as required
        if (cash == purchasePrice) {
            System.out.println("Zero");
        } else if (cash > purchasePrice) {
            CashRegister cr = new CashRegister();
            System.out.println(Main.minimumNumberOfWays(cr.getRegister(),(int)((cash-purchasePrice)*100)));
        } else {
            System.out.println("ERROR");
        }
    }

    public static String minimumNumberOfWays(List<Currency> denominations, int amount) {
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        Currency[] prevCoin = new Currency[amount + 1];
        for (int j = 1; j <= amount; j++) {
            dp[j] = Integer.MAX_VALUE;
            for (Currency c:denominations) {
                int currencyVal = (int) (c.getValue() * 100);
                if (currencyVal <= j && (1 + dp[j - currencyVal] < dp[j])) {
                    dp[j] = 1 + dp[j - currencyVal];
                    prevCoin[j] = c;
                }
            }
        }

        List<Currency> returnChange = new ArrayList<>();
        for (int i = amount; i >= 1; ) {
            returnChange.add(prevCoin[i]);
            int j = i;
            i = amount - (int)(prevCoin[i].getValue() * 100);
            amount -= (int)(prevCoin[j].getValue() * 100);
        }

        Collections.sort(returnChange, (c1, c2) -> (int) ((c2.getValue() - c1.getValue())*100));

        String out = returnChange.toString();
        return out.substring(1, out.length()-1);
    }
}