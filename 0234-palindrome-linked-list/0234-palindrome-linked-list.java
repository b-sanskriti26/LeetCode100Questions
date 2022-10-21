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
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        while(!stack.isEmpty() && head!=null){
            if(stack.pop().val!=head.val){
                return false;
            }else{
                head=head.next;
            }
        }
    return true;    
    }
}