package gmail.jjoal1867.server;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gmail.jjoal1867.server.dao.MemoDAO;

//JUnit4를 이용해서 테스트를 수행하는 설정 
@RunWith(SpringJUnit4ClassRunner.class)
//설정파일을 실행해서 테스트를 수행하는 설정 
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DAOMethodTest {
	
	@Autowired
	private MemoDAO memoDao;
	@Test
	public void memoDaoTest() {
		//데이터 개수 조회
		//System.out.println(memoDao.memocount());

		//데이터 전체 조회 
		//System.out.println(memoDao.memolist());
		
		//특정 데이터 조회 
		System.out.println(memoDao.memodetail(5));
		
		//데이터 삽입  
//		Map<String, Object>map = new HashMap<String, Object>();
//		map.put("title","제목테스트");
//		map.put("contents","내용테스트");
//		map.put("regdate","2018-12-05");
//		map.put("image_path", "test.png");
//		System.out.println(memoDao.memoinsert(map));
		
		//데이터 삭제 
		//System.out.println(memoDao.memodelete(1));

		
		

	}
}
