package haos;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    static DBWorker worker = new DBWorker();

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	    throws javax.servlet.ServletException, IOException {

	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("firstName");
	String evaluation = request.getParameter("evaluation");
	String comment = request.getParameter("comment");

	response.setContentType("text/html; charset = utf-8");

	try {
	    Main.addPost(name, evaluation, comment);
	    PrintWriter pw = response.getWriter();
	    pw.println("Выполнил");
	    pw.close();
	} catch (SQLException | ClassNotFoundException e) {
	    e.printStackTrace();
	}

	// String query = "select * from book";
	//
	// try {
	// Statement statement = worker.getConnection().createStatement();
	// ResultSet resultSet = statement.executeQuery(query);
	//
	// while (resultSet.next()) {
	// userName userName = new userName();
	// userName.setName(resultSet.getString("name"));
	// userName.setEvaluation(resultSet.getString("evaluation"));
	// userName.setComment(resultSet.getString("comment"));
	// userName.setId(resultSet.getInt("id"));
	//
	// PrintWriter out = response.getWriter();
	// out.println(userName);
	// }
	//
	// statement.close();
	// resultSet.close();
	//
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
    }
}
