package amigos;

import java.util.Stack;

public class WorkingWithStacks {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(11);
        stack.push(1);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        int deleted = stack.pop();
        System.out.println(stack.size() + " deleteed "+ deleted );


    }
}
