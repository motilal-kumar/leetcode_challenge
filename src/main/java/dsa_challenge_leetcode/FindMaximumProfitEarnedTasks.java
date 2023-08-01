package dsa_challenge_leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindMaximumProfitEarnedTasks {


    public static void main(String[] args) {

        ArrayList<Task>  list  =  new ArrayList<>();

        list.add(new Task(1, 9, 15));
        list.add(new Task(2, 2, 2));
        list.add(new Task(3, 5, 18));
        list.add(new Task(4, 7, 1));
        list.add(new Task(5, 4, 25));
        list.add(new Task(6, 2, 20));
        list.add(new Task(7, 5, 8));
        list.add(new Task(8,  7,10));
        list.add(new Task(9,  4, 12));
        list.add(new Task(10, 3, 5));

        System.out.println("Maximum profit is : ");

        getMaximumProfitEarned(list);

    }
    static void getMaximumProfitEarned(ArrayList<Task> a)
    {
        int number = a.size();
        Collections.sort(a, (x, y) -> {
            return x.taskDeadlines - y.taskDeadlines;
        });

        //2 10 9 7 3 4 8 1

        ArrayList<Task> list = new ArrayList<>();
        PriorityQueue<Task> maxHeap = new PriorityQueue<>(
                (x, y) -> { return x.taskProfit - y.taskProfit; });

        for (int i = number - 1; i > -1; i--) {
            int slots;

            if (i == 0) {
                slots = a.get(i).taskDeadlines;
            }
            else {
                slots = a.get(i).taskDeadlines
                        - a.get(i - 1).taskDeadlines;
            }


            maxHeap.add(a.get(i));

            while (slots > 0
                    && maxHeap.size() > 0) {

                Task task = maxHeap.remove();

                slots--;

                list.add(task);
            }
        }

        Collections.sort(list, (x, y) -> {
            return x.taskDeadlines - y.taskDeadlines;
        });

        for (Task task : list) {
            System.out.print(task.taskId + " ");
        }
        System.out.println();
    }




  /*  Given a list of tasks with deadlines and total profit earned on completing a task, find the maximum profit earned by executing the tasks within the specified deadlines. Assume that each task takes one unit of time to complete, and a task can’t execute beyond its deadline. Also, only a single task will be executed at a time.

    For example, consider the following set of tasks with a deadline and the profit associated with it. If we choose tasks 1, 3, 4, 5, 6, 7, 8, and 9, we can achieve a maximum profit of 109. Note that task 2 and task 10 are left out.
    Tasks	Deadlines	Profit
1	9	15
        2	2	2
        3	5	18
        4	7	1
        5	4	25
        6	2	20
        7	5	8
        8	7	10
        9	4	12
        10	3	5*/

}
