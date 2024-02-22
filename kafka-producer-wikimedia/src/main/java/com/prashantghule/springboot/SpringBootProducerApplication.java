package com.prashantghule.springboot;

import com.prashantghule.springboot.producer.WikimediaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner
{
    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;

    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }
}
