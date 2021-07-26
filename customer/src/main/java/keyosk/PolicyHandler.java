package keyosk;

import java.util.Optional;

import keyosk.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired CustomerRepository customerRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderPlaced_Status(@Payload OrderPlaced orderPlaced){

        if(!orderPlaced.validate()) return;

        System.out.println("\n\n##### listener Status : " + orderPlaced.toJson() + "\n\n");

        // Sample Logic //
        Customer customer = new Customer();
        customer.setOrderStatus("ORDER PLACED");
        customerRepository.save(customer);

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderCanceled_Status(@Payload OrderCanceled orderCanceled){

        if(!orderCanceled.validate()) return;

        System.out.println("\n\n##### listener Status : " + orderCanceled.toJson() + "\n\n");

                // Sample Logic //
        Customer customerObj = new Customer();

        Optional<Customer> tempObj =  customerRepository.findById(orderCanceled.getOrderId());

        if(tempObj.isPresent()){
            customerObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        customerObj.setOrderStatus(orderCanceled.getOrderStatus());
        customerRepository.save(customerObj);
    }

    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayed_Status(@Payload Payed payed){

        if(!payed.validate()) return;

        System.out.println("\n\n##### listener Status : " + payed.toJson() + "\n\n");

                // Sampl Logic //
        Customer customerObj = new Customer();

        Optional<Customer> tempObj =  customerRepository.findById(payed.getOrderId());

        if(tempObj.isPresent()){
            customerObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        customerObj.setOrderStatus(payed.getOrderStatus());
        customerRepository.save(customerObj);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayCancelled_Status(@Payload PayCancelled payCancelled){

        if(!payCancelled.validate()) return;

        System.out.println("\n\n##### listener Status : " + payCancelled.toJson() + "\n\n");

                // Sampl Logic //
        Customer customerObj = new Customer();

        Optional<Customer> tempObj =  customerRepository.findById(payCancelled.getOrderId());

        if(tempObj.isPresent()){
            customerObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        customerObj.setOrderStatus(payCancelled.getOrderStatus());
        customerRepository.save(customerObj);

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverStoreOrderAccepted_Status(@Payload StoreOrderAccepted storeOrderAccepted){

        if(!storeOrderAccepted.validate()) return;

        System.out.println("\n\n##### listener Status : " + storeOrderAccepted.toJson() + "\n\n");

                // Sampl Logic //
        Customer customerObj = new Customer();

        Optional<Customer> tempObj =  customerRepository.findById(storeOrderAccepted.getOrderId());

        if(tempObj.isPresent()){
            customerObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        customerObj.setOrderStatus(storeOrderAccepted.getOrderStatus());
        customerRepository.save(customerObj);

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverStoreOrderRejected_Status(@Payload StoreOrderRejected storeOrderRejected){

        if(!storeOrderRejected.validate()) return;

        System.out.println("\n\n##### listener Status : " + storeOrderRejected.toJson() + "\n\n");

                // Sampl Logic //
        Customer customerObj = new Customer();

        Optional<Customer> tempObj =  customerRepository.findById(storeOrderRejected.getOrderId());

        if(tempObj.isPresent()){
            customerObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        customerObj.setOrderStatus(storeOrderRejected.getOrderStatus());
        customerRepository.save(customerObj);

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverStoreCooked_Status(@Payload StoreCooked storeCooked){

        if(!storeCooked.validate()) return;

        System.out.println("\n\n##### listener Status : " + storeCooked.toJson() + "\n\n");

                // Sampl Logic //
        Customer customerObj = new Customer();

        Optional<Customer> tempObj =  customerRepository.findById(storeCooked.getOrderId());

        if(tempObj.isPresent()){
            customerObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        customerObj.setOrderStatus(storeCooked.getOrderStatus());
        customerRepository.save(customerObj);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
