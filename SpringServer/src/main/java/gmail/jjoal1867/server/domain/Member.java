package gmail.jjoal1867.server.domain;

public class Member {
	private String type;
	private String id;
	private String pw;
	private String name;
	private String nickname;
	private String phone;
	private String plusphone;
	private String address;
	private String profileimg;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPlusphone() {
		return plusphone;
	}
	public void setPlusphone(String plusphone) {
		this.plusphone = plusphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}
	
	
	@Override
	public String toString() {
		return "Member [type=" + type + ", id=" + id + ", pw=" + pw + ", name=" + name + ", nickname=" + nickname
				+ ", phone=" + phone + ", plusphone=" + plusphone + ", address=" + address + ", profileimg="
				+ profileimg + "]";
	}
}
