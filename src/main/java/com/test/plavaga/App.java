package com.test.plavaga;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{

	private static final Log	log			= LogFactory.getLog(App.class.getName());
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
