package gmail.jjoal1867.server.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmail.jjoal1867.server.dao.MemoDAO;

@Service
public class MemoServiceImpl implements MemoService {
	@Autowired
	private MemoDAO memoDao;

	
	//전체보기 요청처리 : memo테이블의 전체데이터를 가져오는 요청을 처리할 메소드 구현 
	@Override
	public Map<String, Object> memolist(HttpServletRequest request) {
		// 전체 데이터의 개수 가져오기 
		int memoCount = memoDao.memocount();
		// 전체 데이터의 목록 가져오기 
		List<Map<String, Object>> list = memoDao.memolist();
		
		Map<String, Object>map = new HashMap<String, Object>();
		//key이름, 숫자 or 문자저장 여부 
		map.put("memocount", memoCount);
		map.put("memos", list);
		
		return map;
	}

	
	//상세보기 요청처리 : num을 파라미터로 입력받아 memo테이블에서 하나의 데이터를 찾아오는 메소드 선언 
	@Override
	public Map<String, Object> memodetail(HttpServletRequest request) {
		//파라미터인 num을 읽어서 정수로 변환 
		int num = Integer.parseInt(request.getParameter("num"));
		Map<String, Object> map = memoDao.memodetail(num);
		return map;
	}
	
	
}
