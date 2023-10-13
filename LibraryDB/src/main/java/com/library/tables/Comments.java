package com.library.tables;

import java.sql.Timestamp;

public class Comments {
	// Variables
	private int commentID;
	private int userID; // Foreign Key - Users.userID
	private int bookID; // Foreign Key - Books.bookID
	private Timestamp dateOfComment;
	private String commentText;
	
	// CommentID
	public int GetCommentID() {
		return commentID;
	}
	
	// UserID
	public void SetUserID(int arg) {
		this.userID = arg;
	}
	
	public int GetUserID() {
		return userID;
	}
	
	// BookID
	public void SetBookID(int arg) {
		this.bookID = arg;
	}
	
	public int GetBookID() {
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
