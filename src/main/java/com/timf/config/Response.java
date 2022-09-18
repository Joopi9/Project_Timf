package com.timf.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Response {

	private int code = 200;
	protected String message = "Ok";
	protected Object data;

	public Response(Object data) {
		this.data = data;
	}

	public Response(int code, String message) {
		this.code = code;
		this.message = message;
	}

}
