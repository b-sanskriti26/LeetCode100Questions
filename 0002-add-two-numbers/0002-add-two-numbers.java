import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack <Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        ListNode l3=new ListNode();
        while(l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        
        String str1="";
        String str2="";
        
        while(!stack1.isEmpty()){
            str1+=stack1.pop();
        }
         while(!stack2.isEmpty()){
            str2+=stack2.pop();
        }
              BigInteger l1int = new BigInteger(str1);
              BigInteger l2int = new BigInteger(str2);
            BigInteger num = l1int.add(l2int);
        //BigInteger num=Integer.valueOf(str1)+Integer.valueOf(str2);
        System.out.print("num"+num);
        String str=String.valueOf(num);
        ListNode temp=l3;
        for(int i=str.length()-1;i>=0;i--){
            temp.val= Integer.parseInt(String.valueOf(str.charAt(i)));  
          //   tmp.val = Integer.parseInt(String.valueOf(sumStr.charAt(i)));
           if(i!=0){
               temp.next=new ListNode();
           }else{
               temp.next=null;
           }
            temp=temp.next;
        }
        
        return l3;
    }
}