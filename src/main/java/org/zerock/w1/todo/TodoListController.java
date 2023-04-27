package org.zerock.w1.todo;

import org.zerock.w1.service.TodoService;
import org.zerock.w1.todo.dto.TodoDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list");

//        3. TodoService에서 제공하는 List<TodoDTO>를 가져온다.
        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();

//        4. 객체를 보관
        req.setAttribute("list", dtoList);

        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req,resp);
    }

}