package strategy.tax;

public class IncomeTax extends Tax {
	private double incomeTaxRatio;

	public void setIncomeTaxRatio(double incomeTaxRatio) {
		this.incomeTaxRatio = incomeTaxRatio;
	}

	public double getIncomeTaxRatio() {
		return incomeTaxRatio;
	}
}
