package entity;

import javax.persistence.*;

@Entity
@Table(
        name = "KULLANICI"
)
public class Kullanıcı {

    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 50, name = "ADI")
    private String adi;

    @Column(length = 50, name = "SOYADI")
    private String soyadi;

    @Column(length = 50, name = "EMAIL")
    private String email;

    @Column(length = 15, name = "TELEFON")
    private String telefon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Kullanıcı{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
