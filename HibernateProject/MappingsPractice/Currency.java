package MappingsPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Currency {



    @Id
    private String CurrencyCode;
    private String CurrencyName;

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public Currency(String currencyCode, String currencyName) {
        CurrencyCode = currencyCode;
        CurrencyName = currencyName;
    }


    public Currency() {
    }
}
