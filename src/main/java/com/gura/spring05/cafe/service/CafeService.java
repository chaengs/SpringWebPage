package com.gura.spring05.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.cafe.dto.CafeCommentDto;
import com.gura.spring05.cafe.dto.CafeDto;

public interface CafeService {
	//새글을 저장하는 메소드 
	public void saveContent(CafeDto dto);
	
	public void getList(ModelAndView mView, HttpServletRequest request);
	
	public void getDetail(int num, ModelAndView mView);
	
	//글 삭제
	public void deleteContent(int num);
	
	public void updateContent(CafeDto dto);
	
	//댓글 저장
	public void saveComment(HttpServletRequest request);
	
	//댓글 삭제
	public void deleteComment(HttpServletRequest request);
	
	//댓글 수정
	public void updateComment(CafeCommentDto dto);
	
	//댓글 추가 응답
	public void moreCommentList(HttpServletRequest request);
}