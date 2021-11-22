package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.Member;
import mybatis.config.DBService;


public class MemberDAO {

	
	private SqlSessionFactory factory;
	private static MemberDAO instance = new MemberDAO();
	
	private MemberDAO() {
		factory = DBService.getInstance().getFactory();
	}
	public static MemberDAO getInstance() {
		return instance;
	}
	
	
	public List<Member> selectMemberList(){
		SqlSession ss = factory.openSession();
		List<Member> list = ss.selectList("dao.member.selectMemberList");
		ss.close();
		return list;
	}
	
	public int insertMember(Member member) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.member.insertMember", member);
		if(result>0)ss.commit();
		ss.close();
		return result;
	}

	public int deleteMember(String no) {
		SqlSession ss = factory.openSession(false);
		int result = ss.delete("dao.member.deleteMember", no);
		if(result>0)ss.commit();
		ss.close();
		return result;
	
	}
}
