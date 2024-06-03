package Model;

public class HOPCHITIET {
    protected String hop_chiTtiet;
    protected byte ID_hop;
    protected byte ID_nhanSu;
    protected String readon;

    public HOPCHITIET(String hop_chiTtiet, byte ID_hop, byte ID_nhanSu, String readon) {
        this.hop_chiTtiet = hop_chiTtiet;
        this.ID_hop = ID_hop;
        this.ID_nhanSu = ID_nhanSu;
        this.readon = readon;
    }

    public String getHop_chiTtiet() {
        return hop_chiTtiet;
    }

    public void setHop_chiTtiet(String hop_chiTtiet) {
        this.hop_chiTtiet = hop_chiTtiet;
    }

    public byte getID_hop() {
        return ID_hop;
    }

    public void setID_hop(byte ID_hop) {
        this.ID_hop = ID_hop;
    }

    public byte getID_nhanSu() {
        return ID_nhanSu;
    }

    public void setID_nhanSu(byte ID_nhanSu) {
        this.ID_nhanSu = ID_nhanSu;
    }

    public String getReadon() {
        return readon;
    }

    public void setReadon(String readon) {
        this.readon = readon;
    }
}
