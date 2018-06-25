package com.farang.test;

import com.farang.model.Stakeholder;

public class TestAddStakeholder {

	public static void main(String[] args) {

		System.out.println("****************************************");

		Stakeholder testadd = new Stakeholder("testadd", "testadd", "testadd", "testadd", "testadd", "testadd",
				"testadd", "testadd", "testadd", "testadd", "testadd", "testadd", "testadd");

		try {
			testadd.connecDB();
			testadd.add();
			System.out.println("*****************Success***************");
			System.out.println("*****************Success***************");

			testadd.closeDB();

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("*****************False***************");
		}
		System.out.println("****************************************");

	}
}
