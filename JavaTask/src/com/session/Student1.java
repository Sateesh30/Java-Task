package com.session;

public class Student1 {

		int stid;
		String name;
		String course;
		int marks;
		public Student1(int stid, String name, String course, int marks) {
			
			this.stid = stid;
			this.name = name;
			this.course = course;
			this.marks = marks;
		}
		public void show() {
			System.out.println( "Stid:"+stid+", name:"+name+",course:"+course
					+",marks:"+marks);
		}


	}


