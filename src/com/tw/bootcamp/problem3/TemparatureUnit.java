package com.tw.bootcamp.problem3;

public enum TemparatureUnit {
	F{
		@Override
		public double convertTo(double fahrenheit) {
			return (fahrenheit-32)/1.8;
		}
	},
	C {
		public double convertTo(double degrees) {
			return degrees;
		}
	};

	public abstract double convertTo(double value);
}

