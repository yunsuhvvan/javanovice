package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.exceptions.PersistenceException;
import org.json.JSONArray;
import org.json.JSONObject;

import dao.MemberDAO;
import dto.Member;

public class InsertMemberCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
			String no = request.getParameter("no");
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			Optional<String> optAge = Optional.ofNullable(request.getParameter("age"));
			int age = Integer.parseInt(optAge.orElse("1"));
			
			Member member = new Member();
			member.setNo(no);
			member.setName(name);
			member.setBirthday(birthday);
			member.setAge(age);
			
			
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			
			int result = MemberDAO.getInstance().insertMember(member);
			
			JSONObject obj = new JSONObject();
			obj.put("result", result);
			
			response.setContentType("application/json; charset=utf-8");
			
			PrintWriter out = response.getWriter();
			out.println(obj); 
			out.close();
		
	}

}
