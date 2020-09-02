package main.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1944783231083610409L;

	private Integer id;
	private String email;
	private String username;
	private String password;
	private String avatar;
	private Integer roleId;

	public User() {
		super();
	}

	public User(Integer id, String email, String username, String password, String avatar, Integer roleId) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.avatar = avatar;
		this.roleId = roleId;
	}
}
