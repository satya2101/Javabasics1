package core_java_concepts;

import java.util.PriorityQueue;

public class Q_Example {

	public static void main(String[] args) {
		PriorityQueue q1=new PriorityQueue();
				q1.add(10); //adding elements into Queue
				q1.add(30);
				q1.add(20);
				System.out.println(q1);
				
				//used to fetch top most element of the queue and removes it.
				System.out.println("polling\t"+q1.poll()); 
				System.out.println(q1);
				
				// Use to fetch top most element of Q' but not removes.
				System.out.println("peeking\t"+q1.peek()); 
				System.out.println(q1);

	}

}
