package project;

import java.util.Arrays;

public class queue {
	
	int[]arr=new int[5];
	int rear;
	int front;



	public queue() {
		rear =-1;
		front=-1;
	}
		public void enqueue(int num) {
		
			if(rear==4)
			{
				System.out.println("Queue spreadout ");
				
			}
			else
			{
			arr[++rear]=num;
			}
			
		}	
	public void dequeue() {
		{
			if(front==4)
			{
				System.out.println("Empty Queue");
			}
			else
			{
				arr[++front]=0;
				
			}
		}
		}
		public void display() {
		
			System.out.println(Arrays.toString(arr));
		
		}
	


		
			
		}
