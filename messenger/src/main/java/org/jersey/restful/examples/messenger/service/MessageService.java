package org.jersey.restful.examples.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jersey.restful.examples.messenger.database.DatabaseClass;
import org.jersey.restful.examples.messenger.model.Message;

public class MessageService {
	
	Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		
		messages.put(1L, new Message(1L,"Hello Jersey", "Sandeep"));
		messages.put(2L, new Message(2L,"Hello REST", "Sandeep"));
	}
	
	public List<Message> getMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long messageId) {
		return messages.get(messageId);
		
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1L);
		messages.put(message.getId(), message);
		return message;
	}

}
