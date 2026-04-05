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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null  && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode secondHalf=reverse(slow);
        ListNode firstHalf=head;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current= head;
        while(current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }

}
//here slow is mid position dividing the entire node into mid and passing the mis element into reverse and then compare the first half and second half  if bothare equal then the node is a palindrome