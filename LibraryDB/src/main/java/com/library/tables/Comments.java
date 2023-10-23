package com.library.tables;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {
	// Variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="commentID", nullable=false)
	private int commentID;
	
    @OneToOne
    @JoinColumn(name = "userID")
	private Users userID; // Foreign Key - Users.userID
    
    @OneToOne
    @JoinColumn(name = "bookID")
	private Books bookID; // Foreign Key - Books.bookID
    
    @Column(name="dateOfComment", nullable=true)
	private Timestamp dateOfComment;
    
    @Column(name="commentText", length=280, nullable=true)
	private String commentText;
	
	// CommentID
	public int getCommentID() {
		return commentID;
	}
	
	// UserID
	public void setUserID(Users arg) {
		this.userID = arg;
	}
	
	public Users getUserID() {
		return userID;
	}
	
	// BookID
	public void setBookID(Books arg) {
		this.bookID = arg;
	}
	
	public Books getBookID() {
		return bookID;
	}
	
	// Date Of Comment
	public void setDateOfComment(Timestamp arg) {
		this.dateOfComment = arg;
	}
	
	public Timestamp getDateOfComment() {
		return dateOfComment;
	}
	
	// Comment Text
	public void setCommentText(String arg) {
		this.commentText = arg;
	}
	
	public String getCommentText() {
		return commentText;
	}
}
