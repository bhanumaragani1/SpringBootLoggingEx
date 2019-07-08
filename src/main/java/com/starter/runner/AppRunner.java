package com.starter.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	private static Logger log = LogManager.getLogger(AppRunner.class);
	@Override
	public void run(String... args) throws Exception {

		try {
			log.info("Console runner started");
			int a=10,b=20,c=-1;
			
			log.info("Data init clone");
			if(a>0 && b<0) {
				c = a+b;
				log.info("If block executed");
			}else {
				c = a-b;
				log.info("Else block executed");
			}
			log.debug("Final result is:"+c);
			if(c>0)
				throw new RuntimeException("Hello sameple");
		}catch (Exception e) {
			log.error("Error found: "+e);
		}
		System.exit(0);
	}

}
