class TextEditor {
    private class Node {
        String textState;
        Node prev, next;
        
        Node(String text) {
            this.textState = text;
            this.prev = this.next = null;
        }
    }

    private Node currentState;
    private Node head, tail;
    private int size;
    private final int MAX_HISTORY_SIZE = 10;

    public TextEditor() {
        this.head = this.tail = this.currentState = null;
        this.size = 0;
    }

    public void addState(String text) {
        Node newNode = new Node(text);
        
        if (head == null) {
            head = tail = currentState = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            currentState = tail;
        }

        size++;

        if (size > MAX_HISTORY_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.textState);
        } else {
            System.out.println("No more undo available.");
        }
    }

    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.textState);
        } else {
            System.out.println("No more redo available.");
        }
    }

    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current Text: " + currentState.textState);
        } else {
            System.out.println("No text available.");
        }
    }
}

public class Q08_UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        
        editor.addState("Initial Text.");
        editor.addState("Added First Sentence.");
        editor.addState("Added Second Sentence.");
        editor.addState("Added Third Sentence.");

        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.redo();

        editor.displayCurrentState();
    }
}
