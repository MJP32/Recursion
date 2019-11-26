package module2.lesson2;

import java.util.Stack;

public class InsertInStack {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int i = 5;
        //insertAtBottomIterative(stack, i);
        insertAtBottomRecursive(stack, i);

        //System.out.println(Arrays.toString(stack.toArray()));

        stack.forEach(k -> {
            System.out.println("" + k);
        });
        System.out.println();
        System.out.println(stack.peek());
    }

    private static void insertAtBottomRecursive(Stack<Integer> stack, int i) {

        if (stack.empty()) {
            stack.push(i);
            return;
        }

        int top = stack.pop();
        insertAtBottomRecursive(stack, i);
        stack.push(top);
    }

    private static void insertAtBottomIterative(Stack<Integer> stack, int i) {

        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        stack.push(i);

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }
}
