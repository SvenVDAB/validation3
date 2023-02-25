package be.vdab.validation3.domain;

import be.vdab.validation3.constraints.Prijs;
import be.vdab.validation3.constraints.VerkoopPrijsAankoopPrijs;

import java.math.BigDecimal;

@VerkoopPrijsAankoopPrijs
public class Product {
    @Prijs
    private BigDecimal aankoopPrijs;
    @Prijs
    private BigDecimal verkoopPrijs;

    public BigDecimal getAankoopPrijs() {
        return aankoopPrijs;
    }

    public BigDecimal getVerkoopPrijs() {
        return verkoopPrijs;
    }

    public void setAankoopPrijs(BigDecimal aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    public void setVerkoopPrijs(BigDecimal verkoopPrijs) {
        this.verkoopPrijs = verkoopPrijs;
    }
}
