package org.jersey.restful.examples.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.jersey.restful.examples.messenger.model.Message;

public class DatabaseClass {
	
	
	public static Map<Long, Message> messages = new HashMap<Long, Message>();
	
	
	public static Map<Long, Message> getMessages(){
		return messages ;
	}
	
	

}
