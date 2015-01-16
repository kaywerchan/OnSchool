package com.xiaonei.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity(name = "productcomment")
public class ProductComment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "comentid")
	private long comentId;
	
	@Column(name = "content" ,nullable=false)
	private String content;
	
	@Column(name = "likenum", nullable=false)
	private long likeNum = 0;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "commentdate", nullable=false)
	private Date commentDate;

	public long getComentId() {
		return comentId;
	}

	public void setComentId(long comentId) {
		this.comentId = comentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(long likeNum) {
		this.likeNum = likeNum;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	
	
	
	
	

}
