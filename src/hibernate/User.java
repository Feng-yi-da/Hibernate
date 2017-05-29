package hibernate;

import java.util.Date;

public class User {
	private String id;
	private String name;
	private String password;
	private Date createTime;
	private Date expireTime;
	private String group;
	/**
	 * 
	 * @return id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @return createTime
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * 
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	 * @return expireTime
	 */
	public Date getExpireTime() {
		return this.expireTime;
	}

	/**
	 * 
	 * @param expireTime
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * 
	 * @return all
	 */
	public String getAll() {
		return this.id + " " + this.name + " " + this.password + " " + this.createTime + " " + this.expireTime;
	}

}
