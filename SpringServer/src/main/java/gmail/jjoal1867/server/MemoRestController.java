package gmail.jjoal1867.server;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gmail.jjoal1867.server.service.MemoService;

//Spring 버전이 4.0이상이며, jackson-databind라이브러리가 포함되어있어야 사용가능한 어노테이션 
@RestController
public class MemoRestController {
	//실제 서비스되는 프로젝트의 경우, 여러개의서비스 객체가 포함되는 경우가 많습니다. 
	@Autowired
	private MemoService memoService;
	
	
	//전체보기 요청을 생성해서 처리하는 메소드  
	@RequestMapping(value="memo/memolist", method=RequestMethod.GET)
	public Map<String,Object> memolist(HttpServletRequest request){
		return memoService.memolist(request);
	}
	
	//상세보기 요청을 생성해서 처리하는 메소드 
	@RequestMapping(value="memo/memodetail", method=RequestMethod.GET)
	public Map<String,Object> memodetail(HttpServletRequest request){
		return memoService.memodetail(request);
	}
}
