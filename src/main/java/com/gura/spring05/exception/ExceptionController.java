package com.gura.spring05.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice //error가 발생했을때 catch하는 Class
public class ExceptionController{
		//NowAllowException type 의 예외가 발생하면 호출되는 메소드 
		@ExceptionHandler(NotAllowException.class)
		public ModelAndView notAllow(NotAllowException ne) {
			ModelAndView mView=new ModelAndView();
			mView.addObject("exception", ne);
			mView.setViewName("error/not_allow");
			return mView;
		}
	/*
	 * 스프링 프레임워크가 동작하는 중에 DBFailException type의 예외가 발생하면 호출되는 메소드
	 * @ExceptionHandler(예외 클래스 type)
	 */
	@ExceptionHandler(DBFailException.class)
	public ModelAndView dbFail(DBFailException e) {
		ModelAndView mView = new ModelAndView();
		//"exception"이라는 키값으로 예외객체의 참조값을 담고
		//담은 예외객체는 view page에서 ${exception.message}형태로 사용
		mView.addObject("exception", e);
		//viewpage로 forward이동
		mView.setViewName("error/db_fail");
		return mView;
	}
}
