package cost;

import cost.pricing.HourlyStrategy;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new HourlyStrategy());
    }
}
