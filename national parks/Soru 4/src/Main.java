import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            int[] arr = {8, 9, 6, 7, 10, 1, 11, 5, 3, 4, 2};
            Queue productQueue = new Queue(arr.length);
            int sTime = 0;
            int aTime = 0;

            for (int value : arr) {
                productQueue.Insert(value);
            }
            int sumPerson = productQueue.Size();
            int j = 0; 
            System.out.println("****************************************QUEUE****************************************");
            while (!productQueue.IsEmpty()) {
                int temp = productQueue.Remove();
                aTime += 3 * temp;
                sTime += aTime;
                System.out.println((j + 1) + " person's process took seconds " + aTime);
                j++;
            }
            double average = (double) sTime / sumPerson;
            System.out.println("Average time for a person is : " + average);


            System.out.println("****************************************PRIORITYQ****************************************");


            PriorityQ priorityQ = new PriorityQ();
            int prioritysumPerson = 0;
            int priorityTime = 0;
            int priorityaTime = 0;
            for (int item : arr) {
                priorityQ.Add(item);
                prioritysumPerson++;
            }
            int k = 0;
            while (!priorityQ.IsEmpty()) {
                int priorityTemp = priorityQ.Remove();
                priorityaTime += priorityTemp * 3;
                priorityTime += priorityaTime;
                System.out.println((k + 1) + " person's process took  seconds : " + priorityaTime); 
                k++;
            }

            double priorityAverage = (double) priorityTime / prioritysumPerson;
            System.out.println("Average time for a person is :" + priorityAverage);



        }
    }

}

class PriorityQ {


    private List<Integer> queueList;
    private int nItems;

    public PriorityQ() {
        queueList = new ArrayList<>();
        nItems = 0;
    }

    public void Add(int item) {
        queueList.add(item);
        nItems++;
    }

    public int Remove() {
        int a=0;
        int tempMin = queueList.get(0);
        for (int product : queueList) {
            if (tempMin > product) {
                tempMin = product;
              a= queueList.indexOf(tempMin);
            }
        }
        queueList.remove(a);
        nItems--;
        return tempMin;
    }


    public boolean IsEmpty() {
        return (nItems == 0);
    }

}

class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;


    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void Insert(int j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public int Remove() {
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }


    public boolean IsEmpty() {
        return (nItems == 0);
    }

    public boolean IsFull() {
        return (nItems == maxSize);
    }

    public int Size() {
        return nItems;
    }

}

