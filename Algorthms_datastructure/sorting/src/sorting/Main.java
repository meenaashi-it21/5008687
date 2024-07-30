package sorting;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 350.0),
            new Order("O004", "Diana", 200.0),
            new Order("O005", "Eve", 300.0)
        };
        System.out.println("Bubble Sort:");
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }
        System.out.println("\nQuick Sort:");
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }

	}

}
