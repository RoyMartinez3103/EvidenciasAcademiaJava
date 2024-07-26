
public class SMS_Service implements MessageService{
	
	@Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
