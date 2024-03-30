# Ticket Sales Application Using Queue

This Java program simulates a ticket sales application using a queue data structure. The application sells tickets to customers in a first-come, first-served manner.

## Overview

The application utilizes a queue to manage the names of customers who are interested in purchasing tickets. It randomly generates a number of tickets to be sold and then sells these tickets to customers in the queue. Each customer in the queue is processed sequentially, with one ticket sold per customer.

## How It Works

1. **Initialization:** 
   - The application initializes a queue to hold the names of customers (`ticket_queue`).
   - Customer names are added to the queue to represent individuals interested in purchasing tickets.

2. **Ticket Sales:**
   - A random number of tickets to be sold is generated.
   - The application simulates the ticket selling process by dequeuing customers from the queue one by one.
   - Each customer is processed, and a message is printed indicating that they have bought a ticket.
   - The number of remaining tickets is decremented after each sale.

3. **Completion:**
   - Once all tickets have been sold, a message is displayed indicating that the tickets are sold out.

## Code Explanation

- The program utilizes the `Queue` interface implemented by `LinkedList`.
- It uses a `Random` object to generate random numbers for the number of tickets to be sold.
- Threads are used to introduce delays and simulate the ticket selling process.
- Exception handling is implemented for `InterruptedException` when using `Thread.sleep()`.

## Usage

To run the application, simply execute the `Main` class. The program will output messages indicating the ticket sales process, including the names of customers who purchased tickets.

## Dependencies

The program requires the Java Standard Library. No additional dependencies are needed.

## Sample Output

```
Ticket sales application...
tickets are sold...
number Of Ticket : 5
Murat Bought the ticket...
Hasan Bought the ticket...
Sarah Bought the ticket...
Lara Bought the ticket...
Aziz Bought the ticket...
Tickets sold out...
```
