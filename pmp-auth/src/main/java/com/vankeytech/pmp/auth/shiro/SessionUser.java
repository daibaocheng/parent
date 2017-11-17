package com.vankeytech.pmp.auth.shiro;
import java.io.Serializable;

/**
 * 简单用户对象，用于在Session中保存用户对象
 * @author chenqiu
 *
 */
public class SessionUser implements Serializable{
	private static final long serialVersionUID = 1L;
	private final Long id;
	private final String username;
	private final String email;
	private final String phone;
	private String roleName;
	public SessionUser(Long id, String username, String email, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
	public final Long getId() {
		return id;
	}

	public final String getUsername() {
		return username;
	}

	public final String getPhone() {
		return phone;
	}

	public final String getEmail() {
		return email;
	}

	public final String getRoleName() {
		return roleName;
	}

	public final void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
