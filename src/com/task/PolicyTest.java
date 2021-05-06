package com.task;

public class PolicyTest {
	public static void main(String[] args) {
		Policy[] policies = { new Policy("Smith", "Internal"), new Policy("Doe", "External"),
				new Policy("John", "Internal") };
		for (int i = 0; i < 1; i++) {
			   if (policies[i].getType().equals("Internal")) {
			      System.out.println(policies[i].getName());
			   }
			}
	}
}

class Policy {
	String name, type;

	public Policy(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}
}