    import java.util.*;
    public class q24_rewrite_Sample2 {
        public static void main(String[] args) {

                // Create a variable name to indicate the person traveling
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the name of the traverller ");
                String name = sc.next();
                
                // Create a variable fromCity, viaCity and toCity to indicate the city
                // from city, via city and to city the person is travelling
                System.out.println("Enter from City");
                String fromCity = sc.next();
                System.out.println("Enter viaCity: ");
                String viaCity = sc.next();
                System.out.println("Enter toCity ");
                String toCity = sc.next();
            
                // Create a variable distanceFromToVia to indicate the distance 
                // between the fromCity to viaCity
                System.out.println("Enter the distance from to via ");
                double distanceFromToVia = sc.nextDouble();
            
                // Create a variable timeFromToVia to indicate the time taken to 
                // travel from fromCity to viaCity in minutes
                int timeFromToVia = 4 * 60 + 4;
            
                // Create a variable distanceViaToFinalCity to indicate the distance 
                // between the viaCity to toCity
                System.out.println("Enter the distance via to Final City ");
                double distanceViaToFinalCity = sc.nextDouble();
            
                // Create a variable timeViaToFinalCity to indicate the time taken to
                // travel from viaCity to toCity in minutesṣ
                int timeViaToFinalCity = 4 * 60 + 25;
            
                // Create a variable totalDistance to indicate the total distance
                // between the fromCity to toCity
                double totalDistance = distanceFromToVia + distanceViaToFinalCity;
            
                // Create a variable totalTime to indicate the total time taken to
                // travel from fromCity to toCity in minutes
                int totalTime = timeFromToVia + timeViaToFinalCity;
                        // Print the travel details
                        System.out.println("The Total Distance travelled by " + name + " from " + 
                        fromCity + " to " + toCity + " via " + viaCity +
                        " is " + totalDistance + " km and " +
                        "the Total Time taken is " + totalTime + " minutes");
            }
            
    }
