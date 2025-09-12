package MappingsPractice;

import jakarta.persistence.*;

@Entity
public class Invoice {
    private String invoiceNumber;
    private String invoiceDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Invoice_id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Provider")
    private DCN_details DCN_Number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Currency_code")
    private Currency CurrencyCode;


    public Invoice(DCN_details DCN_Number, String invoiceNumber, String invoiceDate, int amount, Currency CurrencyCode) {
        this.DCN_Number = DCN_Number;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.CurrencyCode = CurrencyCode;
    }

    private int amount;

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DCN_details getDCN_Number() {
        return DCN_Number;
    }

    public void setDCN_Number(DCN_details DCN_Number) {
        this.DCN_Number = DCN_Number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Currency getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(Currency currencyCode) {
        this.CurrencyCode = currencyCode;
    }
}
