package com.github.alicewu.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.github.alicewu.dao.MarketOrderDao;
import com.github.alicewu.dao.MarketStateDao;
import com.github.alicewu.dao.impl.MarketOrderDaoImpl;
import com.github.alicewu.dao.impl.MarketStateDaoImpl;
import com.github.alicewu.domain.MarketOrder;
import com.github.alicewu.domain.MarketState;
import com.github.alicewu.services.OrderServices;

public class OrderServlet extends HttpServlet {

	OrderServices orderServices = new OrderServices();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		orderServices.getMyOrders(request.getParameter("clientId"), request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		orderServices.submitOrder(request);
	}

}
