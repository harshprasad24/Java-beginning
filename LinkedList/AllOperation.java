public class LinkList {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Intializing
    public static node head;
    public static node tail;
    public static int size;

    public void addFirst(int data) {
        // crete new node
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // new node---head == next
        newnode.next = head;
        // points to new node
        head = newnode;
    }

    public void addLast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void printall() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public void addmiddle(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
            return;
        }
        node newnode = new node(data);
        size++;
        node temp = head;
        int i = 0;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            tail = head = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        node prev = head;// at location size-2
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;// tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key) {
        node temp = head;
        int indx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return indx;
            }
            temp = temp.next;
            indx++;
        }
        return -1;
    }

    public int helper(node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        node prev = null;
        node curr = tail = head;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int indx) {
        int sz = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (indx == sz) {
            head = head.next;
            return;
        }
        int i = 0;
        node prev = head;
        while (i < (sz - indx)) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // slow - fast approach
    public node findmid(node head) { // helper function for palindrome
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 -> find mid
        node midnode = findmid(head);
        // step 2 -> Reverse 2nd Half
        node prev = null;
        node curr = midnode;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step 3 -> check Right half & left half
        node left = head;
        node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        node slow = head;
        node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (flag == false)
            return;

        //finding meeting point
        slow = head;
        node prev = null;//last node 
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addmiddle(2, 3);
        // ll.removeFirst();
        // System.out.println(ll.size);
        // ll.printall();
        // ll.removelast();
        // System.out.println();
        // ll.printall();
        // System.out.println();
        // System.out.println(ll.itrsearch(3));
        // System.out.println(ll.recSearch(2));
        // ll.reverse();
        // ll.printall();
        // ll.removeNthFromEnd(2); 
        // System.out.println();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printall();
        // System.out.println(ll.checkPalindrome());
        // ll.printall();

        // to check cycle
        head = new node(1);
        node temp = new node(2);
        head.next=temp;
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}

