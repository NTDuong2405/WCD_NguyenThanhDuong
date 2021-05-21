package controller;

import entity.Employee;
import repository.GenericRepository;
import service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListEmployees extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Lấy ra danh sách sản phẩm
        req.setAttribute("listEmpl", employeeService.getList());
        req.getRequestDispatcher("/employees/list.jsp").forward(req,resp);
    }
}
