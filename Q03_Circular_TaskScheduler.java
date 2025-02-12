import java.util.*;

public class Q03_Circular_TaskScheduler {
    class TaskSchedular {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        TaskSchedular next;

        TaskSchedular(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }

    }

    public static TaskSchedular head;
    public static TaskSchedular tail;

    public void addFirst(int taskId, String taskName, int priority, String dueDate) {
        TaskSchedular newNode = new TaskSchedular(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        }

        // 1 23 34 4
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void addLast(int taskId, String taskName, int priority, String dueDate) {
        TaskSchedular newNode = new TaskSchedular(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void addSpecificInx(int index, int taskId, String taskName, int priority, String dueDate) {

        // 1->2->-3->4
        if (index == 0) {
            // newNode.next=head;
            // head=newNode;
            addFirst(taskId, taskName, priority, dueDate);
            return;

        }

        TaskSchedular newNode = new TaskSchedular(taskId, taskName, priority, dueDate);
        TaskSchedular temp = head;

        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            if (temp == head) {
                return;
            }
            i++;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) {
                tail = newNode;
            }
        }

    }

    public void removeTask(int taskId) {
        if (head == null) {
            return;
        }
        if (head.taskId == taskId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }

        }
        TaskSchedular temp = head;
        while (temp.next != head) {
            if (temp.next.taskId == taskId) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void distplayTask() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }
        TaskSchedular temp = head;
        while (temp != null) {
            System.out.println("Details of Task ");
            System.out.println("TaskId: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println("<<==============>>");
            temp = temp.next;
            if (temp == head) {
                break;
            }
        }
    }

    public void prioritTask(int priority) {
        TaskSchedular temp = head;
        while (temp != null) {
            if (temp.priority == priority) {
                // if (priority.equals(temp.priority)) {
                System.out.println("This is Priority Task: " + temp.priority);
            }
            temp = temp.next;
        }

    }

    public int totalTask() {
        int count = 0;
        TaskSchedular temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
            if(temp==head){
                return count;
            }
        }
        // System.out.println("Total no. of Task performed is: "+count);
        return count;
    }

    public static void main(String[] args) {
        Q03_Circular_TaskScheduler scheduler = new Q03_Circular_TaskScheduler();
        scheduler.addFirst(1, "Task-A", 4, "2025-02-15");
        scheduler.addLast(2, "Task-B", 2, "2025-02-13");
        scheduler.addSpecificInx(1, 2, "Task-C", 3, "2025-02-14");
        scheduler.addSpecificInx(2, 4, "Task-D", 1, "2025-02-10");
        scheduler.distplayTask();

        scheduler.removeTask(1);
        scheduler.distplayTask();

        System.out.println("Total no. of Task " + scheduler.totalTask());
    }

}
