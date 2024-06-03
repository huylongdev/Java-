package Model;

public class PHONGBAN {
    protected byte ID_PHONG;
    protected String TEN_PHONG;

    public PHONGBAN(byte ID_PHONG, String TEN_PHONG) {
        this.ID_PHONG = ID_PHONG;
        this.TEN_PHONG = TEN_PHONG;
    }

    public byte getID_PHONG() {
        return ID_PHONG;
    }

    public void setID_PHONG(byte ID_PHONG) {
        this.ID_PHONG = ID_PHONG;
    }

    public String getTEN_PHONG() {
        return TEN_PHONG;
    }

    public void setTEN_PHONG(String TEN_PHONG) {
        this.TEN_PHONG = TEN_PHONG;
    }
}
