create tale board_cafe_comment(
	num number primary key
	writer varchar2(100),
	content varchar2(500),
	target_id varchar2(100), --댓글 달린 게시글의 작성자 아이디--
	ref_group number, --원글의 글 번호--
	comment_group number, --댓글 그룹 번호--
	deleted char(3) default 'no', --삭제된 댓글 여부--
	regdate date
);

create sequence board_cafe_comment_seq;