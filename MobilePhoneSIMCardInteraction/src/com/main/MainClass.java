package com.main;

import java.util.Scanner;

import com.mobile.MobilePhone;
import com.mobile.impl.RealMeMobile;
import com.sim.impl.Airtel;
import com.sim.impl.BSNL;
import com.sim.impl.JIO;

public class MainClass {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			MobilePhone mobile = new RealMeMobile(scanner);
			while (true) {
				System.out.println("Select Your Network Provider");
				System.out.println("1.JIO\n2.Airtel\n3.BSNL\n4.Exit");
				int provider = scanner.nextInt();
				br: while (true) {
					switch (provider) {
					case 1:
						System.out.println(
								"1.Insert JIO SIM Card\n2.Make Call\n3.Send Text Msg\n4.Remove JIO SIM Card\n5.Show SIM\n6.Exit");
						int operations = scanner.nextInt();
						switch (operations) {
						case 1:
							mobile.insertSim(new JIO());
							break;
						case 2:
							try {
								mobile.makeCall();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						case 3:
							mobile.sendText();
							break;
						case 4:
							mobile.removeSim();
							break;
						case 5:
							System.out.println(mobile.displaySimCardName());
							break;
						case 6:
							break br;
						default:
							System.err.println("Not a Valid Operation");
						}// innerswitch
						break;
					case 2:
						System.out.println(
								"1.Insert JIO SIM Card\n2.Make Call\n3.Send Text Msg\n4.Remove JIO SIM Card\n5.Show SIM\n6.Exit");
						int operations2 = scanner.nextInt();
						switch (operations2) {
						case 1:
							mobile.insertSim(new Airtel());
							break;
						case 2:
							try {
								mobile.makeCall();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						case 3:
							mobile.sendText();
							break;
						case 4:
							mobile.removeSim();
							break;
						case 5:
							System.out.println(mobile.displaySimCardName());
							break;
						case 6:
							break br;
						default:
							System.err.println("Not a Valid Operation");
						}// innerswitch
						break;
					case 3:
						System.out.println(
								"1.Insert JIO SIM Card\n2.Make Call\n3.Send Text Msg\n4.Remove JIO SIM Card\n5.Show SIM\\n6.Exit");
						int operations3 = scanner.nextInt();
						switch (operations3) {
						case 1:
							mobile.insertSim(new BSNL());
							break;
						case 2:
							try {
								mobile.makeCall();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						case 3:
							mobile.sendText();
							break;
						case 4:
							mobile.removeSim();
							break;
						case 5:
							System.out.println(mobile.displaySimCardName());
							break;
						case 6:
							break br;
						default:
							System.err.println("Not a Valid Operation");
						}// innerswitch
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.err.println("Invalid Provider");
					}// outer switch
				} // inner while
			} // outerLoop
		} // try-with-resource

	}// main
}// class