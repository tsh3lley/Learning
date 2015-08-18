
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	 public ListNode deleteDuplicates(ListNode head) {
	    //ListNode temp = head;
	    ListNode change = head;
	    while(change != null){
	        if (change.next == null) break;
	        if (change.next.val == change.val){
	            change.next = change.next.next;
	        }else {
	            change = change.next;
	        }
	    }
	return head;
	}
}
