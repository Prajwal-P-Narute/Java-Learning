import java.util.Scanner;
class StackImplementation {
	int size;
	int [] stackArray;
	int top;
	
	public StackImplementation(int length) {
		size = length;
		top = -1;
		stackArray = new int[size];
		
	}
	

	public int peek() {
		 
		if(top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == stackArray.length - 1)
			return true;
		else 
			return false;
	}
	
	public void push(int value) {
		if( top == stackArray.length - 1) {
			System.out.println("you cannot add element because stack is full");
			
		}
		else {
			
			stackArray[++top] = value;
			System.out.println(value + " is added to the top of the stack");
			
		}		
		
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		else {
			int popped = stackArray[top--];
			System.out.println(popped + " is popped from the stack");
			return popped;
		}
	}
	
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the stack");
		int size = sc.nextInt();
		
		StackImplementation stack = new StackImplementation(size);
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		stack.pop();
//		stack.isEmpty();
//		stack.peek();
//		stack.isFull();
		
		 while (true) {
	            System.out.println("\nStack Operations:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Check if Stack is Empty");
	            System.out.println("5. Check if Stack is Full");
	            System.out.println("6. Exit");

	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter a number to push: ");
	                    int value = sc.nextInt();
	                    stack.push(value);
	                    break;
	                case 2:
	                    int poppedValue = stack.pop();
	                    if (poppedValue != -1) {
	                        System.out.println("Popped: " + poppedValue);
	                    }
	                    break;
	                case 3:
	                    int topValue = stack.peek();
	                    if (topValue != -1) {
	                        System.out.println("Top element: " + topValue);
	                    }
	                    break;
	                case 4:
	                    System.out.println("Is stack empty? " + stack.isEmpty());
	                    break;
	                case 5:
	                    System.out.println("Is stack full? " + stack.isFull());
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	}

}
	}
}
