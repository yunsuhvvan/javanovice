package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import dao.MemberDAO;
import dto.Member;

public class SelectMemberListCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		List<Member> list = MemberDAO.getInstance().selectMemberList();
		
		JSONArray arr = new JSONArray(list);
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(arr); 
		out.close();
		
		
	}

}
