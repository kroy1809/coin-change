public abstract class Currency {
    private final String denomimation;
    private final double value;
    private final int count;

    protected Currency(String denomimation, double value, int count) {
        this.denomimation = denomimation;
        this.value = value;
        this.count = count;
    }

    @Override
    public String toString() {
        return denomimation;
    }

    public double getValue() {
        return value;
    }
}

class OnePence extends Currency{
    public OnePence() {
        super("One Pence", 0.01, 0);
    }
}


class TwoPence extends Currency{
    public TwoPence() {
        super("Two Pence", 0.02, 0);
    }
}

class FivePence extends Currency{
    public FivePence() {
        super("Five Pence", 0.05, 0);
    }
}


class TenPence extends Currency{
    public TenPence() {
        super("Ten Pence", 0.1, 0);
    }
}



class TwentyPence extends Currency{
    public TwentyPence() {
        super("Twenty Pence", 0.2, 0);
    }
}



class FiftyPence extends Currency{
    public FiftyPence() {
        super("Fifty Pence", 0.5, 0);
    }
}



class OnePound extends Currency{
    public OnePound() {
        super("One Pound", 1.0, 0);
    }
}



class TwoPound extends Currency{
    public TwoPound() {
        super("Two Pound", 2.0, 0);
    }
}



class FivePound extends Currency{
    public FivePound() {
        super("Five Pound", 5.0, 0);
    }
}




class TenPound extends Currency{
    public TenPound() {
        super("Ten Pound", 10.0, 0);
    }
}



class TwentyPound extends Currency{
    public TwentyPound() {
        super("Twenty Pound", 20.0, 0);
    }
}



class FiftyPound extends Currency{
    public FiftyPound() {
        super("Fifty Pound", 50.0, 0);
    }
}



