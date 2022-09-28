import java.util.*;
public class SpecialStack {
    int front,rear,size;
    int[] arr;
    SpecialStack(int size){
        this.front = -1;
        this.rear = size;
        this.size = size;
        this.arr = new int[size];
        Arrays.fill(arr,Integer.MAX_VALUE);
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){

        if((this.front+1) >= rear){
            return true;
        }else{
            return false;
        }
    }


    public void push(int data){
       // this.front = this.front + 1;
        if(isFull()){
            System.out.println("Queue is full");
        }else{

            arr[this.front + 1] = data;
            this.front +=1;
        }
    }

    public int   pop(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            this.front -= 1;
            return arr[this.front  +1];
        }
    }

    public int getMin(){
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        Collections.sort(list);
        return list.get(0);


    }

        public void print(){
        for(int i : arr){
            System.out.println(i);
        }
        }
    public static void main(String[] args) {
        System.out.println("Enter size of Queue");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        SpecialStack queue = new SpecialStack(size);
      /*
        queue.push(1);
        queue.push(2);
        queue.pop();
        System.out.println("------------printing Queue-------------------");
        queue.print();
        */


        while(true) {
            System.out.println("Press 1:    Push Element");
            System.out.println("Press 2 : Pop Element");
            System.out.println("Press 3 : Get Minimum Element from Queue");
            System.out.println("Press 4 : Print Queue");
            System.out.println("Press 5 : Exit");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Element to be inserted");
                    int data = sc.nextInt();
                    queue.push(data);
                    break;
                case 2:


                        System.out.println("Element Poped : " + queue.pop());
                        break;
                case 3:
                        System.out.println("Minimum Element : " + queue.getMin());
                        break;
                case 4:
                        System.out.println("-------------- printing Queue --------------------------");
                        queue.print();
                        break;
                case 5:
                        System.exit(0);
                default:
                        System.out.println("Enter Correct Option");
            }

        }

    }
}
