package jug.istanbul.demo.controller;

import jug.istanbul.demo.utility.CheckInputUtility;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;
import java.util.zip.CheckedInputStream;

@RestController
public class HelloController {

    private HashMap hashmap = new HashMap();

	@GetMapping("/")
	public String getIndex() throws InterruptedException {
        BigDecimal value = new BigDecimal("12.5");
        value = value.subtract(BigDecimal.valueOf(2.5));
        hashmap.put(ThreadLocalRandom.current().nextInt(1000), value);
        String result = CheckInputUtility.checkBlackList(value.toString());
		return "Greetings from Spring Boot! "  + result;
	}

    @PostMapping("/post")
    public ResponseEntity<String> setIndex(@RequestBody String information) throws InterruptedException {

        Logger.getGlobal().info("information");
        information = CheckInputUtility.checkBlackList(information);
        return new ResponseEntity<String>(information, HttpStatus.CREATED);
    }

}