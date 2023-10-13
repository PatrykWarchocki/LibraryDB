package com.library.tables;

import java.sql.Timestamp;

public class Comments {
	// Variables
	private int commentID;
	private Users userID; // Foreign Key - Users.userID
	private Books bookID; // Foreign Key - Books.bookID
	private Timestamp dateOfComment;
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
