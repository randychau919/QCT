package qct.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	/**
	 * Send request demo 1
	 */
	@GetMapping(value = "/QCTTest_sendRequest1")
	public void sendRequestDemo1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// Send request(use Postman) with ULR :
		// http://localhost:8080/QCTTest_sendRequest1?test_key=qct
		String testKey = request.getParameter("test_key");
		if (testKey.equals("qct")) {
			response.getWriter().append("Success - You can send request to qct Test Website.");
		} else {
			response.getWriter().append("Fail - You can not send request to qct Test Website.");
		}
	}
}