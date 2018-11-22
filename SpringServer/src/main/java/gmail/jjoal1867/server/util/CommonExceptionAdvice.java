package gmail.jjoal1867.server.util;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//설정된 패키지에서 예외가 발생하면 이곳의 메소드가 처리합니다.
@ControllerAdvice("gmail.jjoal1867.server")
//인스턴스 자동 생성
@Component
public class CommonExceptionAdvice {
	@ExceptionHandler(Exception.class)
	private ModelAndView errorModelAndView(Exception ex) {

		ModelAndView modelAndView = new ModelAndView();
		// 에러 페이지 경로
		modelAndView.setViewName("/error/error");
		modelAndView.addObject("exception", ex);

		return modelAndView;
	}
}
