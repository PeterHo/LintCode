package problem._452;

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    /**
     * @param head a ListNode
     * @param val  an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode listHead = new ListNode(0);
        listHead.next = head;
        ListNode node = listHead;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return listHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(1);
        head.next = node;
        ListNode ret = new Solution().removeElements(head, 1);
        System.out.println(ret.val);
    }
}
