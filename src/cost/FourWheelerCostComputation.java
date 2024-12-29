package cost;

import cost.pricing.MinuteStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation() {
        super(new MinuteStrategy());
    }
}
