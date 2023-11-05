package board_infinity;

import java.util.*;

class StackExamples {

    public String reverse(String input) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : input.toCharArray()){
            stack.push(ch);
        }

        String reversed = "";

        while (!stack.empty()) {
            reversed += stack.pop();
        }

        return reversed;
    }
}

class QueueExample {
    public void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        while (!queue.isEmpty()) 
            stack.push(queue.remove());
        System.out.println("Original Queue : " + stack);

        while (!stack.isEmpty())
            queue.add(stack.pop());
        System.out.println("Reverse Queue : " + queue);
    }
}

public class Examples {

    public static void main(String[] args) {

        // Stack Example
            String str = "ABCDEFU";
            StackExamples stackStringReverser = new StackExamples();

            System.out.println("Original String : " + str);
            System.out.println("Reverse String : " + stackStringReverser.reverse(str));
        
        // Queue Example
            Queue<Integer> queueStringReverse = new ArrayDeque<Integer>();
            
            queueStringReverse.add(10);
            queueStringReverse.add(20);
            queueStringReverse.add(30);
            queueStringReverse.add(40);
            
            QueueExample queueExample = new QueueExample();
            queueExample.reverse(queueStringReverse);   
    }
}
