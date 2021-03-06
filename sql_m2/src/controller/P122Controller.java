package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Cake;
import service.CakeDao;

@WebServlet("/P122Controller")
public class P122Controller extends HttpServlet {
	//Controller -> Model(List<Cake>) -> p.122.jsp
	private CakeDao cakeDao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cakeDao = new CakeDao();
		//평균가격보다 높은 케익들을 조회하여 리턴하는 메서드
		List<Cake> list = cakeDao.selectCakeListOverAvg();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/views/p122.jsp").forward(request, response);
	}
}