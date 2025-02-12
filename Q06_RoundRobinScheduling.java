import java.util.Scanner;

public class Q06_RoundRobinScheduling {
    static class Process {
        int processId, burstTime, remainingTime, priority;
        Process next;

        Process(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
            this.next = null;
        }
    }

    private Process tail;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
        } else {
            newProcess.next = tail.next;
            tail.next = newProcess;
            tail = newProcess;
        }
    }

    public void removeProcess(int processId) {
        if (tail == null) {
            System.out.println("No process found.");
            return;
        }

        Process temp = tail, prev = null;

        do {
            if (temp.next.processId == processId) {
                prev = temp;
                break;
            }
            temp = temp.next;
        } while (temp != tail);

        if (prev == null) {
            System.out.println("Process not found.");
            return;
        }

        Process toDelete = prev.next;

        if (toDelete == tail) {
            if (tail == tail.next) {
                tail = null;
            } else {
                prev.next = tail.next;
                tail = prev;
            }
        } else {
            prev.next = toDelete.next;
        }
    }

    public void roundRobinSchedule(int timeQuantum) {
        if (tail == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalTime = 0, completedProcesses = 0;
        double totalWaitingTime = 0, totalTurnaroundTime = 0;
        Process current = tail.next;

        while (tail != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                totalTime += execTime;
                current.remainingTime -= execTime;

                System.out.println("Executing Process " + current.processId + " for " + execTime + " units.");

                if (current.remainingTime == 0) {
                    System.out.println("Process " + current.processId + " completed.");
                    totalTurnaroundTime += totalTime;
                    totalWaitingTime += totalTime - current.burstTime;
                    removeProcess(current.processId);
                    completedProcesses++;
                }
            }
            current = (tail != null) ? current.next : null;
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / completedProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / completedProcesses));
    }

    public void displayProcesses() {
        if (tail == null) {
            System.out.println("No processes in queue.");
            return;
        }
        Process temp = tail.next;
        System.out.println("Processes in queue:");
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime +
                    ", Remaining Time: " + temp.remainingTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != tail.next);
    }

    public static void main(String[] args) {
        Q06_RoundRobinScheduling scheduler = new Q06_RoundRobinScheduling();
        Scanner sc = new Scanner(System.in);

        scheduler.addProcess(1, 5, 1);
        scheduler.addProcess(2, 3, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);

        scheduler.displayProcesses();

        System.out.print("\nEnter time quantum: ");
        int timeQuantum = sc.nextInt();

        scheduler.roundRobinSchedule(timeQuantum);
        sc.close();
    }
}
