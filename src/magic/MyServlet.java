package magic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    DBWorker worker = new DBWorker();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset = utf-8");

	String name = request.getParameter("name");
	String evaluation = request.getParameter("evaluation");
	String comment = request.getParameter("comment");

	try {
	    Main.addPost(name, evaluation, comment);

	    String query = "SELECT * FROM BOOK";

	    try {
		PreparedStatement statement = worker.getConnection().prepareStatement(query);
		ResultSet resultSet = statement.executeQuery();
		PrintWriter pw = response.getWriter();

		while (resultSet.next()) {
		    UserName userName = new UserName();
		    userName.setName(resultSet.getString("name"));
		    userName.setEvaluation(resultSet.getString("evaluation"));
		    userName.setComment(resultSet.getString("comment"));
		    userName.setId(resultSet.getInt("id"));

		    pw.println(userName.toString());

		}

		statement.close();
		resultSet.close();
		pw.close();
	    } catch (SQLException e) {
		e.printStackTrace();
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
