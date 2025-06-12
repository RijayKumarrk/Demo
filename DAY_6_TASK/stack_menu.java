package project;

import java.util.Scanner;

public class stack_menu {
    
    static class Stack {
        int[] stack = new int[5];
        int top = -1;

        public void push(int num) {
            if (top == stack.length - 1) {
                System.out.println("Stack Overflow! Cannot push " + num);
            } else {
                stack[++top] = num;
                System.out.println(num + " pushed to stack.");
            }
        }

        public void pop() {
          
                System.out.println("Popped out: " + stack[top--]);
        }

        public void peek() {
        
                System.out.println("Top element is: " + stack[top]); 
        }
        

        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Stack elements:");
                for (int i = top; i >= 0; i--) {
                    System.out.println(stack[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        Stack stack = new Stack();
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. EXIT");
            System.out.print("Enter your option: ");
            choice = rk.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int num = rk.nextInt();
                    stack.push(num);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

    }
}
