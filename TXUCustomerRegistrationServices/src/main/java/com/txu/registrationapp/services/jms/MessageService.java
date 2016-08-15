package com.txu.registrationapp.services.jms;

import com.txu.registrationapp.dao.MessageDao;

/*
 * This class processes the messages and stores sid 
 * in respective customer table based on cid
 */
public class MessageService {

	public boolean processMessage(int sid, int cid) {

		MessageDao messagedao = new MessageDao();
		
		if (messagedao.saveSid(sid, cid)) {
			return true;
		}
		
		return false;
	}

}
