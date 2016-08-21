import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class helloWorldWithUserCourse2 {
	public static void main(String args[]) {
		System.out.println("Please input your name");
		Scanner userInput = new Scanner(System.in);
		String user = userInput.next();
		System.out
				.println(user
						+ ": Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal...Hullo, Hal, do you read me?...");
		try {
		    TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out
				.println(user
						+ ": Hullo, Hal, do you read me?...Do you read me, Hal?...Do you read me, Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println("Hal: Affirmative, " + user + ", I read you.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user + ": Open the pod bay doors, Hal.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println("Hal: I'm sorry, " + user
				+ ", I'm afraid I can't do that.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user + ": What's the problem?");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Hal: I think you know what the problem is just as well as I do.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user + ": What're you talking about, Hal?");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Hal: This mission is too important for me to allow you to jeopardise it.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user
				+ ": I don't know what you're talking about, Hal.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user + ": Where the hell'd you get that idea, Hal?");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Hal: "
						+ user
						+ ", although you took very thorough precautions in the pod against my hearing you, I could see your lips move.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user
				+ ": Alright, Hal. I'll go in through the emergency airlock.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println("Hal: Without your space- helmet," + user
				+ ", you're going to find that rather difficult.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user
				+ ": Hal, I won't argue with you any more. Open the doors.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out
				.println("Hal: "
						+ user
						+ ", this conversation can serve no purpose any more. Goodbye.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

		}
		System.out.println(user + ": Hal? Hal. Hal. Hal! Hal!");
	}
}
