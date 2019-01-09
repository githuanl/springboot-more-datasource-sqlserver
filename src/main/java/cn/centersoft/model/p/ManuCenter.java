package cn.centersoft.model.p;

import javax.persistence.*;


@Entity
@Table(name = "Base_manucenter")
public class ManuCenter {

    @Id
    @GeneratedValue
    private Long autoid;

    private String code;
    private String manucenter;
    private String wfcode;
    private String wlcode;

    public Long getAutoid() {
        return autoid;
    }

    public void setAutoid(Long autoid) {
        this.autoid = autoid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManucenter() {
        return manucenter;
    }

    public void setManucenter(String manucenter) {
        this.manucenter = manucenter;
    }

    public String getWfcode() {
        return wfcode;
    }

    public void setWfcode(String wfcode) {
        this.wfcode = wfcode;
    }

    public String getWlcode() {
        return wlcode;
    }

    public void setWlcode(String wlcode) {
        this.wlcode = wlcode;
    }
}
