package com.timf.exception;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.timf.service.voc.VocService;

@RestControllerAdvice
public class CommonExceptionHandler {

	private final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<Map<String, String>> ExceptionHandler(Exception e) {
		HttpHeaders responseHeaders = new HttpHeaders();
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		
		Map<String, String> map = new HashMap<>();
		map.put("code", "400");
		map.put("errorType", httpStatus.getReasonPhrase());
		map.put("message", e.getMessage());
		
		return new ResponseEntity<>(map, responseHeaders, httpStatus);
	}
}
