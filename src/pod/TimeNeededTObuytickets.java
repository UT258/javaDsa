package pod;

import java.util.*;

public class TimeNeededTObuytickets {
    public static void main(String[] args) {
        int arr[]={5,1,1,1};
        System.out.println(timeRequiredToBuy(arr,0));
    }

    public static int timeRequiredToBuy(int[] tickets, int p) {
        int time = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int ticket : tickets) {
            queue.add(ticket);
        }
        while (true) {
            for (int i = 0; i < queue.size(); i++) {
                int ticket = queue.poll();
                if (ticket > 0) {
                    queue.add(ticket - 1);
                }
                time++;
                if (queue.size() == p && queue.peek() == 0) {
                    return time;
                }
            }
        }
    }
}