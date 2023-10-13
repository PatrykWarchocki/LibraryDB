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
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="comments", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"commentID"})})
public class Comments {
	// Variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="commentID", nullable=false, unique=true)
	private int commentID;
	
    @OneToOne
    @JoinColumn(name = "userID")
	private Users userID; // Foreign Key - Users.userID
    
    @OneToOne
    @JoinColumn(name = "bookID")
	private Books bookID; // Foreign Key - Books.bookID
    
    @Column(name="dateOfComment", nullable=true)
	private Timestamp dateOfComment;
    
    @Column(name="login", length=280, nullable=true)
	private String commentText;
	
	// CommentID
	public int GetCommentID() {
		return commentID;
	}
	
	// UserID
	public void SetUserID(Users arg) {
		this.userID = arg;
	}
	
	public Users GetUserID() {
		return userID;
	}
	
	// BookID
	public void SetBookID(Books arg) {
		this.bookID = arg;
	}
	
	public Books GetBookID() {
		return bookID;
	}
	
	// Date Of Comment
	public void SetDateOfComment(Timestamp arg) {
		this.dateOfComment = arg;
	}
	
	public Timestamp GetDateOfComment() {
		return dateOfComment;
	}
	
	// Comment Text
	public void SetCommentText(String arg) {
		this.commentText = arg;
	}
	
	public String GetCommentText() {
		return commentText;
	}
}
