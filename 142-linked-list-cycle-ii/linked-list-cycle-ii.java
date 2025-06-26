/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode fast=head;
        // ListNode slow =head;
        // ListNode fast1=head;
        // ListNode slow1=head;
        // int count =0;
    
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(fast==slow){
        //         ListNode temp=slow;
        //         do{
        //             temp=temp.next;
        //             count++;
        //             } while(temp!=slow);
              
        //       while(count-->0){
        //         slow1=slow1.next;
        //       }
        //       while(slow1!=fast1){
        //         slow1=slow1.next;
        //         fast1=fast1.next;
        //       }
                        
        //   return fast1;  
        //     }
        // }
        // return null;   

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode entry=head;
                while(entry!=slow){
                    slow=slow.next;
                    entry=entry.next;
                }
                return slow;
            }
        }
        return null;  
    }
}