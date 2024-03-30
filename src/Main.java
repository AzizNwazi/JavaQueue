import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Print a message indicating the start of the ticket sales application
        System.out.println("Ticket sales application...");
        // Initialize a Random object to generate random numbers
        Random random = new Random();

        // Create a Queue to hold the names of customers
        Queue<String> ticket_queue = new LinkedList<>();

        // Add customer names to the ticket queue
        ticket_queue.offer("Murat");
        ticket_queue.offer("Hasan");
        ticket_queue.offer("Sarah");
        ticket_queue.offer("Lara");
        ticket_queue.offer("Aziz");
        ticket_queue.offer("Ezgi");
        ticket_queue.offer("Mehmet");
        ticket_queue.offer("Okan");
        ticket_queue.offer("Gökhan");
        ticket_queue.offer("Azer");

        // Generate a random number of tickets to be sold
        int numberOfTicket = 1 + random.nextInt(10);
        // Print the number of tickets sold
        System.out.println("tickets are sold...");
        System.out.println("number Of Ticket : " + numberOfTicket);
        // Delay for 3 seconds to simulate ticket sales
        Thread.sleep(3000);

        // Sell tickets to customers in the queue
        while (numberOfTicket != 0) {
            // Poll the first customer from the queue and print a message indicating they bought a ticket
            System.out.println(ticket_queue.poll() + " Bought the ticket...");
            // Decrement the number of tickets remaining
            numberOfTicket--;
            // Delay for 1 second to simulate the ticket selling process
            Thread.sleep(1000);
        }

        // Print a message indicating that all tickets have been sold
        System.out.println("Tickets sold out...");
    }
}
