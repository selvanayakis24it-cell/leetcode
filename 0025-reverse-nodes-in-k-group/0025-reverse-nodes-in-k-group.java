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
     if(head==null){
        return null;
     } 
    int totalnode=totalnodes(head);  
    if(totalnode<k){
        return head;
    }
    ListNode prev=null;
    ListNode nxt=null;
    ListNode temp=head;
    int count=k;
    while(temp!=null && count!=0){
        nxt=temp.next;
        temp.next=prev;
        prev=temp;
        temp=nxt;
        count--;
    }
    head.next=reverseKGroup(temp,k);
    return prev;
    }
    public int totalnodes(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}