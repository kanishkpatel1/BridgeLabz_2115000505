import java.util.*;

class CircularTour {
    static class PetrolPump {
        int petrol, distance;
        
        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int start = 0, end = 0;
        int currPetrol = 0;

        while (queue.size() < n) {
            currPetrol += pumps[end].petrol - pumps[end].distance;
            queue.add(end);

            while (currPetrol < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                currPetrol -= pumps[removed].petrol - pumps[removed].distance;
                start = removed + 1;
            }
            
            end = (end + 1) % n;
            if (end == start && queue.size() == n) return start; // Successfully completed the tour
        }

        return -1; // No valid start point
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int start = findStartingPoint(pumps);
        System.out.println(start == -1 ? "No Solution" : "Start at pump " + start);
    }
}
