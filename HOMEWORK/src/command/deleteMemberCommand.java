package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.MemberDAO;

public class deleteMemberCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String no = request.getParameter("no");
		if(no.isEmpty()) {
			no = "";
		}
		
		
		
		int result = MemberDAO.getInstance().deleteMember(no);
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(obj); 
		out.close();
		
		
	}

}
