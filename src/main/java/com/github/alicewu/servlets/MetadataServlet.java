package com.github.alicewu.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.alicewu.services.MetadataServices;

public class MetadataServlet extends HttpServlet {
	
	MetadataServices metadataServices = new MetadataServices();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		metadataServices.getMetadataClient(request, response);
	}


}
