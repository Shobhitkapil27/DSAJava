package MappingsPractice;

import jakarta.persistence.*;

@Entity
public class DCN_details {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DCN_Number")
    @JoinColumn(name = "Provider_id")
    private int DCN_Number;
    private String Country_code;


    public int getDCN_Number() {
        return DCN_Number;
    }

    public void setDCN_Number(int DCN_Number) {
        this.DCN_Number = DCN_Number;
    }

    public String getCountry_code() {
        return Country_code;
    }

    public void setCountry_code(String country_code) {
        Country_code = country_code;
    }

    public DCN_details( String country_code) {
        Country_code = country_code;
    }
}
