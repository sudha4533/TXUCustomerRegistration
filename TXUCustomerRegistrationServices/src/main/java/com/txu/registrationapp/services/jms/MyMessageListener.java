package com.txu.registrationapp.services.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class dequeues the messages from queue and processes them
 */
public class MyMessageListener implements MessageListener {

	private static final Logger logger = LoggerFactory.getLogger(MyMessageListener.class);
	
	@Override
	public void onMessage(Message msg) {

		System.out.println("Message Listener is active");

		try {

			if (msg != null) {

				TextMessage message = (TextMessage) msg;
				logger.info("JMS message in the queue: " + message);

				String scid = message.getText();

				String[] msgAry = scid.split(":");

				int sid = Integer.parseInt(msgAry[0]);
				int cid = Integer.parseInt(msgAry[1]);

				MessageService messageservice = new MessageService();

				if (messageservice.processMessage(sid, cid)) {
					logger.info("Customer table updated successfully with service plan ID.");
				} else {
					logger.info("Customer table update failed with service plan ID.");
				}
			}

			else {
				logger.info("JMS message in queue is null");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}