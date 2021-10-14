package com.session;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Student {
	int stid;
	String stname, email;
	int mobile;

	public Student(int stid, String stname, String email, int stdmarks) {
		this.stid = stid;
		this.stname = stname;
		this.email = email;
		this.mobile = stdmarks;
	}

	public Student(int sid, String na, String em, String mob) {
		// TODO Auto-generated constructor stub
	}

	public void show() {
		System.out.println("id :" + stid + ", name : " + stname + ", Email :" + email + ", Mob :" + mobile);
	}

	public void show1() {
		System.out.println("id :" + stid + ", name : " + stname + ", Email :" + email + ", Mob :" + mobile);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emailpat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Student[] St = new Student[5];
		System.out.println("enter 5 student details : id, name, Email, Mob");

		for (int i = 0; i < 5; i++) {
			int sid = sc.nextInt();
			String na = sc.next();
			String em = sc.next();
			String mob = sc.next();
			if (em.matches(emailpat) && mob.matches("\\+?\\d{10}"))
				St[i] = new Student(sid, na, em, mob);
			else {
				System.out.println("please check mobileNo or email");
				break;
			}
		}

		try {

			System.out.println("Students details whose MobNo starts with 98 ");
			for (Student std : St) {

				if (std.mobile.startsWith("98")) {

					std.show();

				}

			}
			int count = 0;
			System.out.println("Students  email id from mail");
			for (Student std : St) {
				Pattern p = Pattern.compile("@g(oogle)?mail\\.com$");
				Matcher m = p.matcher(std.email);
				if (m.find())

					std.show();
				else {

					count++;

				}
			}
			System.out.println("");
			System.out.println(" number of students whose email id is not from gmail is : " + count);

		} catch (Exception e) {
			System.out.println(" make sure u had enter right mobNo and email");
		}

	}
}


