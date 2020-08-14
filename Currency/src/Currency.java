public abstract class Currency {
    private final String denomimation;
    private final double value;

    protected Currency(String denomimation, double value) {
        this.denomimation = denomimation;
        this.value = value;
    }

    public String getDenomimation() {
        return denomimation;
    }

    public double getValue() {
        return value;
    }
}

class OnePence extends Currency{
    protected OnePence(String denomimation, double value) {
        super("One Pence", 0.01);
    }
}


class TwoPence extends Currency{
    protected TwoPence(String denomimation, double value) {
        super("Two Pence", 0.02);
    }
}

class FivePence extends Currency{
    protected FivePence(String denomimation, double value) {
        super("Five Pence", 0.05);
    }
}


class TenPence extends Currency{
    protected TenPence(String denomimation, double value) {
        super("Ten Pence", 0.1);
    }
}



class TwentyPence extends Currency{
    protected TwentyPence(String denomimation, double value) {
        super("Twenty Pence", 0.2);
    }
}



class FiftyPence extends Currency{
    protected FiftyPence(String denomimation, double value) {
        super("Fifty Pence", 0.5);
    }
}



class OnePound extends Currency{
    protected OnePound(String denomimation, double value) {
        super("One Pound", 1.0);
    }
}



class TwoPound extends Currency{
    protected TwoPound(String denomimation, double value) {
        super("Two Pound", 2.0);
    }
}



class FivePound extends Currency{
    protected FivePound(String denomimation, double value) {
        super("Five Pound", 5.0);
    }
}




class TenPound extends Currency{
    protected TenPound(String denomimation, double value) {
        super("Ten Pound", 10.0);
    }
}



class TwentyPound extends Currency{
    protected TwentyPound(String denomimation, double value) {
        super("Twenty Pound", 20.0);
    }
}



class FiftyPound extends Currency{
    protected FiftyPound(String denomimation, double value) {
        super("Fifty Pound", 50.0);
    }
}



