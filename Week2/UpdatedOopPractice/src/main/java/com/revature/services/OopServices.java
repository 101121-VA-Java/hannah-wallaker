package com.revature.services;

import java.time.LocalDate;

import com.revature.models.BoringTask;
import com.revature.models.ExcitingTask;
import com.revature.models.ImportantTask;
import com.revature.models.Task;
import com.revature.models.User;

public class OopServices {

	protected String s;
	String something; // default access modifier

	public void doEncapsulation() {
		User u = new User();
//		u.username = "Kevin";
		User k = new User();
//		k.username = "Kevin";

//		k.age = 15;
//		
//		k.age = -25;

		u.setAge(-25);

		new Object();

		/*
		 * SYSO - calls u.toString() implicitely - default implementation of toString(),
		 * per the Object Class, is the memory address - to return meaning information,
		 * we have to override the method to be relevant to the fields of that class
		 * 
		 */
		System.out.println("u age: " + u.getAge());
		System.out.println(k);

		System.out.println("Is k.equals(u)? " + k.equals(u));
	}

	public void doInheritance() {
		User u = new User();
		Task t1 = new Task("Laundry", LocalDate.parse("2021-10-20"));
		System.out.println(t1);
		Task t2 = new Task ("Quiz", LocalDate.parse("2021-10-20"));
		System.out.println(t2);
		Task t3 = new Task ("Adopt a puppy!", LocalDate.parse("2021-10-20"));
		System.out.println(t3);
		
		u.setTask(t1);
		u.setTask(t3);
		u.setTask(t2);

		System.out.println(u);

		ImportantTask it = new ImportantTask("Quiz", LocalDate.now());

		it.stress();

		System.out.println(it);
	}

	public void doPolymorphism() {
		// method overriding
		Task t1 = new Task();
		t1.setName("Laundry");
		t1.setDueDate(LocalDate.now());
		System.out.println("This should print toString() from Task class: " + t1);

		ImportantTask t2 = new ImportantTask();
		t2.setName("Quiz");
		t2.setDueDate(LocalDate.now());
		System.out.println("This should print toString() from ImportantTask class: " + t2);

		BoringTask bt = new BoringTask();

		System.out.println("This should print toString() from BoringTask class: " + bt);

		ExcitingTask t3 = new ExcitingTask();
		t3.setName("Adopt a puppy!");
		t3.setDueDate(LocalDate.now());
		System.out.println("This should print toString() from ExcitingTask class: " + t3);

		// method overloading

		bt.setDueDate(LocalDate.now());

		System.out.println("Due date before all: " + bt.getDueDate());

		bt.procrastinate();

		System.out.println("Due date after procrastinate(): " + bt.getDueDate());

		bt.procrastinate(5);

		System.out.println("Due date after procrastinate(5): " + bt.getDueDate());

		bt.procrastinate(5, 2);

		System.out.println("Due date after procrastinate(5, 2): " + bt.getDueDate());

		
		//My work with ExcitingTask
		t3.setDueDate(LocalDate.now());

		System.out.println("Due date before all: " + t3.getDueDate());

		
		t3.excitement();

		System.out.println("Due date after excitement(): " + t3.getDueDate());

		t3.excitement(2);

		System.out.println("Due date after excitement(2): " + t3.getDueDate());

		t3.excitement(4, 3);

		System.out.println("Due date after excitement(4, 3): " + t3.getDueDate());

		
		
		// Upcasting
		Task t = new BoringTask();
		Task it = new ImportantTask();
		Task t31 = new ExcitingTask();

		Task[] tasks = { t, it, t31 };

		for (Task task : tasks) {
			System.out.println(task.toString());
		}
		
//		BoringTask boring = (BoringTask) new Task();
		

	}
}
