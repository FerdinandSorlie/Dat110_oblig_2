package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		Client client = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		client.createTopic("temperature");
		client.subscribe("temperature");

		for(int i = 0; i <COUNT; i++){
			PublishMsg msg = (PublishMsg) client.receive();
		}

		client.unsubscribe("temperature");
		client.disconnect();
		System.out.println("Display stopping ... ");
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
