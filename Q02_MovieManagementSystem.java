import java.util.*;

public class Q02_MovieManagementSystem {
    class Node {
        String movieTitle;
        String director;
        int releaseYear;
        float rating;
        Node prev;
        Node next;

        Node(String movieTitle, String director, int releaseYear, float rating) {
            this.movieTitle = movieTitle;
            this.director = director;
            this.releaseYear = releaseYear;
            this.rating = rating;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addFirstRecord(String movieTitle, String director, int releaseYear, float rating) {
        Node newNode = new Node(movieTitle, director, releaseYear, rating);
        if (head == null) {
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLastRecord(String movieTitle, String director, int releaseYear, float rating) {
        Node newNode = new Node(movieTitle, director, releaseYear, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeRecord(String movieTitle) {
        Node temp = head;
        while (temp != null) {
            if (temp.movieTitle.equals(movieTitle)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null){
                        head.prev = null;
                    }
                } 
                else if (temp == tail){
                    tail = tail.prev;
                    if (tail != null){
                        tail.next = null;
                    }
                }
                 else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    public void searchByDirector(String director) {
        Node temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Found: " + temp.movieTitle);
            }
            temp = temp.next;
        }
    }

    public void searchByRating(float rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found: " + temp.movieTitle);
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.movieTitle + " (" + temp.director + ")");
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.movieTitle + " (" + temp.director + ")");
            temp = temp.prev;
        }
    }

    public void updateRating(String movieTitle, float newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.movieTitle.equals(movieTitle)) {
                temp.rating = newRating;
                System.out.println("Rating updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    public static void main(String[] args) {
        Q02_MovieManagementSystem movieList = new Q02_MovieManagementSystem();
        movieList.addFirstRecord("Movie1", "Director1", 2000, 4.5f);
        movieList.addLastRecord("Movie2", "Director2", 2005, 3.8f);
        movieList.addLastRecord("Movie3", "Director1", 2010, 4.0f);
        movieList.displayForward();
        movieList.removeRecord("Movie2");
        movieList.displayForward();
        movieList.displayReverse();
        movieList.searchByDirector("Director1");
        movieList.updateRating("Movie3", 4.7f);
        movieList.displayForward();
    }
}
