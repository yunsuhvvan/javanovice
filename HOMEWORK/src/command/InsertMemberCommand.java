package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import dao.MemberDAO;
import dto.Member;

public class InsertMemberCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		try {
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
		
			
		} catch (SQLIntegrityConstraintViolationException e) { //
			e.printStackTrace();
			response.setContentType("text/plain; charset=utf-8");
			
			PrintWriter out = response.getWriter();
			out.println("동일한 회원번호는 입력할 수 없습니다.");
			
			response.setStatus(2001); 
		} catch (SQLException e) {
			PrintWriter out = response.getWriter();
			out.println("잘못된 데이터가 전달 되었습니다.");
			response.setStatus(2002);
			
		} catch (Exception e) {
			response.setContentType("text/plain; charset=utf-8");
			
			PrintWriter out = response.getWriter();
			out.println("알 수 없는 예외가 발생했습니다.");
			
			response.setStatus(2003);

		}




	}

}
