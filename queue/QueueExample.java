package queue;

public class QueueExample {
    public static void main(String[] args) {
        CustomQueue obj = new CustomQueue(15);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);

        System.out.println("Dequeued: " + obj.dequeue());
        System.out.println("Dequeued: " + obj.dequeue());
        System.out.println("Dequeued: " + obj.dequeue());
        System.out.println("Dequeued: " + obj.dequeue());
        obj.traverse();
    }
}

class CustomQueue {
    int[] arr;
    int front, rear, maximum;

    CustomQueue(int arrSize) {
        arr = new int[arrSize];
        rear = -1;
        front = -1;
        maximum = arr.length;
    }

    void enqueue(int data) {
        if (rear == maximum - 1) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) { // first element
            front = 0;
        }
        arr[++rear] = data;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.print("Underflow ");
            return -1;
        }
        int ele = arr[front++];
        if (front > rear) { // reset if empty
            front = rear = -1;
        }
        return ele;
    }

    void traverse() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}
