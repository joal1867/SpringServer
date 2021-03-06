package gmail.jjoal1867.server.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartHttpServletRequest;

//사용자의 요청을 처리하기 위한 메소드의 모양을 선언 
public interface MemoService {
	
	//전체보기 요청처리 : memo테이블의 전체데이터를 가져오는 요청을 처리할 메소드 선언 
	public Map<String, Object> memolist(HttpServletRequest request);

	//상세보기 요청처리 : num을 파라미터로 입력받아 memo테이블에서 하나의 데이터를 찾아오는 메소드 선언 
	public Map<String,Object> memodetail(HttpServletRequest request);
	
	//메모삭제를 위한 메소드 선언 
	public Map<String, Object> memodelete(HttpServletRequest request);
	
	//메모 삽입를 위한 메소드 선언 (*이미지파일 저장을 위해 MultipartHttpServletRequest 사용)
	public Map<String, Object> memoinsert(MultipartHttpServletRequest request);
}
