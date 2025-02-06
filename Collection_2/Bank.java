package Collection_2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Bank {
    public static void main(String[] args) {
        Map<Integer, LinkedList<String>> transactions = new HashMap<>();

        addTransaction(transactions, 99, "Deposit 1500");
        addTransaction(transactions, 99, "Withdraw 650");
        addTransaction(transactions, 99, "Deposit 2000");

        System.out.println("Transactions for Account 101: " + transactions.get(101));
    }

    public static void addTransaction(Map<Integer, LinkedList<String>> transactions, int accountID, String transaction) {
        transactions.putIfAbsent(accountID, new LinkedList<>());

        LinkedList<String> transList = transactions.get(accountID);

        if (transList.size() >= 10) {
            transList.removeFirst();
        }

        transList.add(transaction);
    }
}
