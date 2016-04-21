package com.sample;


import org.apache.activemq.ActiveMQConnectionFactory;

import com.sample.App.HelloWorldConsumer;
import com.sample.App.HelloWorldProducer;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;


public class MQSender {
	
	 public static void main(String[] args) throws Exception {
	        thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	        Thread.sleep(1000);
	        thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	        Thread.sleep(1000);
	    	thread(new HelloWorldProducer(), false);
	     	thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	        Thread.sleep(1000);
	        thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	        thread(new HelloWorldProducer(), false);
	    }
	 
	 public static void thread(Runnable runnable, boolean daemon) {
	        Thread brokerThread = new Thread(runnable);
	        brokerThread.setDaemon(daemon);
	        brokerThread.start();
	    }
	 
	    public static class HelloWorldProducer implements Runnable {
	        public void run() {
	            try {
	                // Create a ConnectionFactory
	                //ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
	            	   ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
	                   //"tcp://localhost:61616");

	                // Create a Connection
	                Connection connection = connectionFactory.createConnection();
	                connection.start();
	 
	                // Create a Session
	                Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	 
	                // Create the destination (Topic or Queue)
	                Destination destination = session.createQueue("COM.SAMPLE");
	 
	                // Create a MessageProducer from the Session to the Topic or Queue
	                MessageProducer producer = session.createProducer(destination);
	                producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
	 
	                // Create a messages
	                String text = "Message Sent! From: " + Thread.currentThread().getName() + " : " + this.hashCode();
	                TextMessage message = session.createTextMessage(text);
	 
	                // Tell the producer to send the message
	                System.out.println("Sent message: "+ message.hashCode() + " : " + Thread.currentThread().getName());
	                producer.send(message);
	 
	                // Clean up
	                session.close();
	                connection.close();
	            }
	            catch (Exception e) {
	                System.out.println("Caught: " + e);
	                e.printStackTrace();
	            }
	        }
	    }
}
