import java.util.Stack;
 
class SpecialStack
{
    private Stack<Integer> s;        
    private Stack<Integer> aux;      
    public MinStack()
    {
        s = new Stack<>();
        aux = new Stack<>();
    }
    public void push(int val)
    {
        s.push(val);
   
        if (aux.isEmpty()) {
            aux.push(val);
        }
        else {
           
            if (aux.peek() >= val) {
                aux.push(val);
            }
        }
    }
 
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack underflow!!");
            System.exit(-1);
        }
 
        int top = s.pop();
 
        if (top == aux.peek()) {
            aux.pop();
        }
 
        return top;
    }
 
    public int top() {
        return s.peek();
    }
 
    public int size() {
        return s.size();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public int getMin()
    {
        if (aux.isEmpty())
        {
            System.out.println("Stack underflow!!");
            System.exit(-1);
        }
 
        return aux.peek();
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        SpecialStack s = new SpecialStack();
 
        s.push(6);
        System.out.println(s.getMin());     
 
        s.push(7);
        System.out.println(s.getMin());    
 
        s.push(8);
        System.out.println(s.getMin());     
 
        s.push(5);
        System.out.println(s.getMin());     
 
        s.push(3);
        System.out.println(s.getMin());     
 
        System.out.println(s.pop());    
        System.out.println(s.getMin());     
 
        s.push(10);
        System.out.println(s.getMin());    
 
        System.out.println(s.pop());     
        System.out.println(s.getMin());    
 
        System.out.println(s.pop());   
        System.out.println(s.getMin());     
    }
}
