package com.task;

import java.io.IOException;

public class A {
	public String getAddress(long companyID) throws IOException {
		return "";// code to return address
	}

	public void getAddressx(long companyID) throws IOException {
		getAddress(1);
	}
}

class X extends A {
	@Override
	public String getAddress(long companyID) {
		return "";// code to return address
	}
}