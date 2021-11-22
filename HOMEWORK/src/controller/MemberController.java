package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.InsertMemberCommand;
import command.MemberCommand;
import command.SelectMemberListCommand;
import command.deleteMemberCommand;

@WebServlet("*.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		
		MemberCommand mc = null;
		
		switch(command) {
		case "selectMemberList.do" :
			mc = new SelectMemberListCommand();
			break;
		case "insertMember.do" :
			mc = new InsertMemberCommand();
			break;
			
		case "deleteMember.do" :
			mc = new deleteMemberCommand();
			break;
		}
		
		if(mc != null) { // Null처리
			mc.execute(request, response);
		}
		
	}
		
		
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
