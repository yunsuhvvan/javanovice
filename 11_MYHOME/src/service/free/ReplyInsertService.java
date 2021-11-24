package service.free;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dto.Free;

public class ReplyInsertService implements FreeService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int depth = Integer.parseInt(request.getParameter("depth"));
		Long groupNo  = Long.parseLong(request.getParameter("groupNo"));
		Long groupOrd  = Long.parseLong(request.getParameter("groupOrd"));
		String writer = request.getParameter("writer");
		String content =  request.getParameter("content");
		
		
		Free free = new Free();
		free.setDepth(depth);
		free.setGroupNo(groupNo);
		free.setGroupOrd(groupOrd);
		free.setWriter(writer);
		free.setContent(content);
		
		
		
		
		
		return null;
	}

}
