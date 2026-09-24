/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(count<k){
            if(temp==null){
                return head;
            }
            count++;
            temp=temp.next;
        }
        ListNode prev=reverseKGroup(temp,k);
        int x=0;
        temp=head;
        while(x<k){
            ListNode nextt=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextt;
            x++;
        }
        return prev;
    }
}