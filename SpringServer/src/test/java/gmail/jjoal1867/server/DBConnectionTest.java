package gmail.jjoal1867.server;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//JUnit4를 이용해서 테스트를 수행하는 설정 
@RunWith(SpringJUnit4ClassRunner.class)
//설정파일을 실행해서 테스트를 수행하는 설정 
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DBConnectionTest {
	
	//데이터 접속 Test : 데이터 접속 정보 확인 
	//@Inject:동일한 자료형의 bean 이 있으면 자동으로 주입
	//*Inject 대신에 Autowired 사용 가능
	@Inject
	private DataSource ds;
	
	//Test를 위한 어노테이션 
	@Test
	public void testConection()throws Exception{
		Connection con = null;
		try {
			con = ds.getConnection();
			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				con.close();
			}
		}	
	}
	
	
	//SqlSessionFactoryBean의 생성여부 확인 : MyBatis 환경설정 파일경로 확인 
	@Autowired
	private SqlSession sqlSession;
	@Test
	public void sqlSessionTest() {
		System.out.println(sqlSession);
		
		//데이터 삽입,조회,삭제 테스트 
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "제목");
		map.put("contents", "내용");
		map.put("regdate", "2018-12-04 12:00:00");
		map.put("image_path", "sample.png");
		//System.out.println(sqlSession.insert("memo.memoinsert", map));
		//System.out.println(sqlSession.selectList("memo.memolist"));
		//System.out.println(sqlSession.selectOne("memo.memodetail", 3).toString());
		//System.out.println(sqlSession.delete("memo.memodelete", 7));
			
	}
}




















