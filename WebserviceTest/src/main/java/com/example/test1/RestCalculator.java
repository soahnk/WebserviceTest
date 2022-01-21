package com.example.test1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCalculator {
	// http://localhost:8080/adds?arg1=20&arg2=10
		@RequestMapping(value = "/adds", method = RequestMethod.GET)
		public int add(@RequestParam("arg1")  int a, @RequestParam("arg2") int b)
		{
			return a+b;
		}
		@RequestMapping(value = "/details", method = RequestMethod.POST, 
				produces = MediaType.APPLICATION_JSON_VALUE)
		//public restoutput detail(@RequestParam("param1")  int length, @RequestParam("param2") int breadth) {
		public restoutput detail(@RequestBody restinput input) {	
			restoutput result=new restoutput();
			result.area=input.length*input.breadth;
			result.perimeter=input.breadth+input.length;
			return result;
		}
}
