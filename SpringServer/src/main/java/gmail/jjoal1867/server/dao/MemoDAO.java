package gmail.jjoal1867.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemoDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//SQL호출하는 메소드 
	
	//전체 데이터 개수를 가져오는 메소드 
	public int memocount() {
		return sqlSession.selectOne("memo.memocount");
	}
	
	//전체 데이터의 목록을 가져오는 메소드 
	public List<Map<String, Object>> memolist(){
		return sqlSession.selectList("memo.memolist");
	}
	
	//num을 파라미터로 입력받아 memo테이블에서 하나의 데이터를 찾아오는 메소드 
	public Map<String, Object> memodetail(int num){
		return sqlSession.selectOne("memo.memodetail", num);
	}
	
	//Map을 파라미터로 입력받아 memo테이블에 데이터를 삽입하는 메소드
	public int memoinsert(Map<String, Object> map){
		return sqlSession.insert("memo.memoinsert",map);
	}

	//num을 파라미터로 입력받아서 memo테이블의 데이터를 삭제하는 메소드 
	public int memodelete(int num){
		return sqlSession.delete("memo.memodelete", num);
	}
}
