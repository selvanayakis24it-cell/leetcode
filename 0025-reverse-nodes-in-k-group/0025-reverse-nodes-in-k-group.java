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
        int totalnode=totalcount(head);
        if(totalnode==0){
            return null;
        }
        if(totalnode<k){
            return head;
        }

        ListNode prev=null;
        ListNode nxt=null;
        ListNode temp=head;
        int count=k;
        while(temp!=null && count>0){
            nxt=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nxt;
            count--;
        }
        head.next = reverseKGroup(temp,k);
       return prev;
    
    }
    public int totalcount(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}