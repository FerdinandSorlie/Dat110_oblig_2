package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	private String topic;
	private String message;

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public String getTopic() {
		return topic;
	}

	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topic=" + topic + ", message=" + message + "]";
	}
}
