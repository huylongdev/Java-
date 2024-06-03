package Model;
import java.util.Scanner;


public class NGUOIDUNG {
	private byte ID_NGUOIDUNG;
	private byte ID_NHANSU;
	private String USERNAME;
	private String PASSWORD;
	private int LEVER_USER;
	
	public NGUOIDUNG (byte ID_NGUOIDUNG,byte ID_NHANSU, String USERNAME,String PASSWORD,
			 int LEVER_USER) {
			this.ID_NGUOIDUNG = ID_NGUOIDUNG;
			this.ID_NHANSU = ID_NHANSU;
			this.USERNAME = USERNAME;
			this.PASSWORD = PASSWORD;
			this.LEVER_USER = LEVER_USER;
	}

	public byte getID_NGUOIDUNG() {
		return ID_NGUOIDUNG;
	}

	public void setID_NGUOIDUNG(byte ID_NGUOIDUNG) {
		this.ID_NGUOIDUNG = ID_NGUOIDUNG;
	}

	public byte getID_NHANSU() {
		return ID_NHANSU;
	}

	public void setID_NHANSU(byte ID_NHANSU) {
		this.ID_NHANSU = ID_NHANSU;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}

	public int getLEVER_USER() {
		return LEVER_USER;
	}

	public void setLEVER_USER(int LEVER_USER) {
		this.LEVER_USER = LEVER_USER;
	}


	
}
