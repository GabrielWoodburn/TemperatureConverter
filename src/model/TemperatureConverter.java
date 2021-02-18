/**  * @author Gabriel Woodburn - gwoodburn  * CIS175 - Spring 2021  * 02/17/2021  */
package model;

public class TemperatureConverter {

	private double fahrenheitTemperature;
	private double celsiusTemperature;
	private final double NINE_FIFTHS = 1.8;
	private final double FIVE_NINTHS = 5.0/9.0;
	private final int THIRTY_TWO = 32;
	
	public TemperatureConverter(double fahrenheitTemperature)
	{
		this.fahrenheitTemperature = fahrenheitTemperature;
		this.celsiusTemperature = calculateCelsius(fahrenheitTemperature);
	}
	 
	public TemperatureConverter(double fahrenheitTemperature, double celsiusTemperature)
	{
		this.fahrenheitTemperature = calculateFahrenheit(fahrenheitTemperature);
		this.celsiusTemperature = celsiusTemperature;
	}
	
	public double getFahrenheitTemperature() {
		return fahrenheitTemperature;
	}

	public void setFahrenheitTemperature(double fahrenheitTemperature) {
		this.fahrenheitTemperature = fahrenheitTemperature;
	}

	public double getCelsiusTemperature() {
		return celsiusTemperature;
	}

	public void setCelsiusTemperature(double celsiusTemperature) {
		this.celsiusTemperature = celsiusTemperature;
	}
	
	public double calculateCelsius(double fahrenheitTemperature)
	{
		return (fahrenheitTemperature - THIRTY_TWO) * FIVE_NINTHS;
	}
	
	public double calculateFahrenheit(double celsiusTemperature)
	{
		return (celsiusTemperature * NINE_FIFTHS) + THIRTY_TWO;
	}
}
