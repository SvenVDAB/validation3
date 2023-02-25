package be.vdab.validation3.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class PrijsValidator implements ConstraintValidator<Prijs, BigDecimal> {
    @Override
    public void initialize(Prijs constraintAnnnotation) {
    }

    @Override
    public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            return false;
        }
        var aantalCijfersNaKomma = value.scale();
        if (aantalCijfersNaKomma > 2) {
            return false;
        }
        var totaalAantaklCijfers = value.precision();
        return totaalAantaklCijfers - aantalCijfersNaKomma <= 7;
    }
}
