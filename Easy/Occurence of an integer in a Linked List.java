    public static int count(Node head, int key) {
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(temp.data == key)
                count++;
            temp = temp.next;
        }
        return count;
    }
}
