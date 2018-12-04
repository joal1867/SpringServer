package gmail.jjoal1867.server.domain;

public class Member {
	private String id;
	private String pw;
	private String nickname;
	private String profileimg;
	
	
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", nickname=" + nickname + ", profileimg=" + profileimg + "]";
	}
}
