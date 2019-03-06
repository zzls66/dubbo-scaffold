/*
package com.gupaoedu.user.test;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

*/
  /*

public class JMSSender {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory=
                new ActiveMQConnectionFactory
                        ("tcp://192.168.11.153:61616");
        Connection connection=null;
        try{
            connection=connectionFactory.createConnection();
            connection.start();
            Session session=connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);
            Destination destination=session.createQueue("myQueue");
            MessageProducer producer=session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            TextMessage message=session.createTextMessage("VIP上课时间:周三、周六、周日");
            producer.send(message);
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
*/
