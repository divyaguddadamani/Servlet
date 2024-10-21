package com.xworz.java.dto;

import java.io.Serializable;

public class Feedbackdto  implements Serializable{

	private String name;
	private String Email;
	private String Comment;
	
	public Feedbackdto() {
	}

	public Feedbackdto(String name, String email, String comment) {
		super();
		this.name = name;
		Email = email;
		Comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	@Override
	public String toString() {
		return "Feedbackdto [name=" + name + ", Email=" + Email + ", Comment=" + Comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Comment == null) ? 0 : Comment.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Feedbackdto))
			return false;
		Feedbackdto other = (Feedbackdto) obj;
		if (Comment == null) {
			if (other.Comment != null)
				return false;
		} else if (!Comment.equals(other.Comment))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
