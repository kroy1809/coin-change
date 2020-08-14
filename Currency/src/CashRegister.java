import java.util.ArrayList;
import java.util.List;

public class CashRegister {
    private final List<Currency> register;

    public CashRegister() {
        this.register = new ArrayList<>();
        this.register.add(new OnePence());
        this.register.add(new TwoPence());
        this.register.add(new FivePence());
        this.register.add(new TenPence());
        this.register.add(new TwentyPence());
        this.register.add(new FiftyPence());
        this.register.add(new OnePound());
        this.register.add(new TwoPound());
        this.register.add(new FivePound());
        this.register.add(new TenPound());
        this.register.add(new TwentyPound());
        this.register.add(new FiftyPound());
    }

    public List<Currency> getRegister() {
        return register;
    }

}
