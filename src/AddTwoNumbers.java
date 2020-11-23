import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   ListNode dummyHead= new ListNode(0);
   ListNode p1 = l1;
   ListNode p2 = l2;
   ListNode current = dummyHead;
   int carry = 0;
   int sum = 0;
   while(p1 != null || p2 != null){
     int x = (p1 != null) ? p1.val : 0;
     int y = (p2 != null) ? p2.val : 0; //conditional "?" operator
     sum = x + y + carry;
     carry = sum / 10;
     current.next = new ListNode(sum % 10);
     current = current.next;
     if(p1 != null) p1 = p1.next;
     if(p2 != null) p2 = p2.next;
   }
   if(carry > 0){
     current.next = new ListNode(carry);
   }
   return dummyHead.next;
  }

  public static void main(String[] args) {
    ListNode l3 = new ListNode(3);
    ListNode l2 = new ListNode(4, l3);
    ListNode l1 = new ListNode(2, l2);

    ListNode ll3 = new ListNode(4);
    ListNode ll2 = new ListNode(6, ll3);
    ListNode ll1 = new ListNode(5, ll2);
    addTwoNumbers(l1, ll1);
  }
}
