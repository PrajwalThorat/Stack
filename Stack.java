public class Stack {

    Node TOP ;

    public Stack(){
        TOP = null;
    }

    public void push(int data){
        Node node = new Node(data);
        if(TOP==null){
            node.nodeNext = null;
            TOP = node ;
            System.out.println("Element Push : "+TOP.data);
        }else{
            node.nodeNext = TOP;
            TOP = node;
            System.out.println("Element Push : "+TOP.data);
        }
    }
    public void pop(){
        Node temp;
        if(TOP==null){
            System.out.println("Stack UnderFlow !!");
            return;
        }
        temp = TOP;
        TOP = TOP.nodeNext;
        System.out.println("Element pop : "+temp.data);
    }
    
}
