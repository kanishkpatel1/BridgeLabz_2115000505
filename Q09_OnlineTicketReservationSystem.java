class TicketReservationSystem {
    private class TicketNode {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        String bookingTime;
        TicketNode next;

        TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }

    private TicketNode head;
    private int totalTickets;

    public TicketReservationSystem() {
        head = null;
        totalTickets = 0;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        totalTickets++;
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }
        
        TicketNode temp = head;
        TicketNode prev = null;
        
        do {
            if (temp.ticketId == ticketId) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    // If it's the only ticket
                    if (temp.next == head) {
                        head = null;
                    } else {
                        // If the head node is being removed
                        TicketNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = temp.next;
                        last.next = head;
                    }
                }
                totalTickets--;
                System.out.println("Ticket with ID " + ticketId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie Name: " + temp.movieName);
            System.out.println("Seat Number: " + temp.seatNumber);
            System.out.println("Booking Time: " + temp.bookingTime);
            System.out.println("----------------------------");
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String searchCriteria) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equals(searchCriteria) || temp.movieName.equals(searchCriteria)) {
                System.out.println("Ticket ID: " + temp.ticketId);
                System.out.println("Customer Name: " + temp.customerName);
                System.out.println("Movie Name: " + temp.movieName);
                System.out.println("Seat Number: " + temp.seatNumber);
                System.out.println("Booking Time: " + temp.bookingTime);
                System.out.println("----------------------------");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for the given search criteria.");
        }
    }

    public void totalBookedTickets() {
        System.out.println("Total Booked Tickets: " + totalTickets);
    }
}

public class Q09_OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        
        system.addTicket(1, "John Doe", "Movie A", "A1", "2025-02-12 10:00 AM");
        system.addTicket(2, "Jane Smith", "Movie B", "B3", "2025-02-12 02:00 PM");
        system.addTicket(3, "Alice Johnson", "Movie A", "C4", "2025-02-12 06:00 PM");

        system.displayTickets();
        system.searchTicket("Movie A");

        system.removeTicket(2);
        system.displayTickets();
        
        system.totalBookedTickets();
    }
}
