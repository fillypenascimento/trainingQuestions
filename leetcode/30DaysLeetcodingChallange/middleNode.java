package trainingQuestions.leetcode.30DaysLeetcodingChallange;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class Solution1 {
    public ListNode middleNode(ListNode head) {
        ListNode slow_node = head, fast_node = head;
        int counter = 0;

        while(fast_node.next != null && fast_node.next.next != null){
            slow_node = slow_node.next;
            fast_node = fast_node.next.next;
        }
        
        ListNode result;
        
        if(fast_node.next == null){
            result = slow_node;
        } else {
            result = slow_node.next;
        }

        return result;
    }
}


class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode actual_node = head;
        int counter = 0;

        while(actual_node.next != null){
            counter++;
            actual_node = actual_node.next;
        }

        int middle_node = (counter + 1) / 2, i = 0;
        actual_node = head;

        while(i < middle_node){
            actual_node = actual_node.next;
            i++;
        }

        return actual_node;
    }
}