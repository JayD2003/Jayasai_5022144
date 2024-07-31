package exercise_3;
import java.util.*;

public class CustomerOrderSorting {
     public static void main(String[] args) {
        Order[] orders = {
            new Order(3, "Ajay", 370.75),
            new Order(6, "Sai", 250.50),
            new Order(15, "Bright", 900.00),
            new Order(19, "Jay", 200.00)
        };

        // Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            order.showDetails();
        }

        // Test Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            order.showDetails();
        }
    }
}

