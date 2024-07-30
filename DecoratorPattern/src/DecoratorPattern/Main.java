package DecoratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Notifier emailNotifier = new EmailNotifier();
	        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
	        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

	        System.out.println("Sending notifications via Email, SMS, and Slack:");
	        slackNotifier.send("This is a test message");
	}

}
