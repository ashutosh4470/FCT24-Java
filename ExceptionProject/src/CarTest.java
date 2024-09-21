
public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		try {
			Car car = new Car();
			car.startTheCar();
			car.longDrive();
			System.out.println("End main");
		} catch (TyrePuncturedException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (SpeedLimitExceedException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (SpeedBreakerBouncedException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (FuleRunsOutException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (SignalBreakException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (EngineOverheatedException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (CarKeyNotFoundException e) {
			System.err.println("Catch the thrown object here..." + e);
		} catch (CarNotFoundException e) {
			System.err.println("Catch the thrown object here..." + e);
		}
	}
}

class TyrePuncturedException extends RuntimeException {
	TyrePuncturedException(String msg) {
		super(msg);
	}
}

class SpeedLimitExceedException extends RuntimeException {
	SpeedLimitExceedException(String msg) {
		super(msg);
	}
}

class SpeedBreakerBouncedException extends RuntimeException {
	SpeedBreakerBouncedException(String msg) {
		super(msg);
	}
}

class SignalBreakException extends RuntimeException {
	SignalBreakException(String str) {
		super(str);
	}
}

class FuleRunsOutException extends RuntimeException {
	FuleRunsOutException(String str) {
		super(str);
	}
}

class EngineOverheatedException extends RuntimeException {
	EngineOverheatedException(String str) {
		super(str);
	}
}

class CarKeyNotFoundException extends Exception {
	CarKeyNotFoundException(String str) {
		super(str);
	}
}

class CarNotFoundException extends Exception {
	CarNotFoundException(String str) {
		super(str);
	}
}

class Car {
	boolean carFound = true;
	boolean carKeyFound = false;

	void startTheCar() throws CarKeyNotFoundException, CarNotFoundException {
		double v = Math.random() % 10;
		if (v == 0.95) {
			carFound = false;
			throw new CarNotFoundException("Ayyo....Car stolen someone");
		}
		if (v > 0.50 && carFound) {
			System.out.println("Car Key found");
			carKeyFound = true;
		} else {
//			System.out.println("Car Key Not found");
			CarKeyNotFoundException carKeyNotFound = new CarKeyNotFoundException("Car key not found");
			carKeyFound = false;
			throw carKeyNotFound;
		}
	}

	void longDrive() {
		for (int i = 1; i <= 30; i++) {
			System.out.println("Kilometers Driven .." + i);
			double v = Math.random() % 10;
			if (v > 0.93 && v < 0.95)
				throw new SpeedLimitExceedException("Oh No!  Speed limit exceeded...");
			if (v > 0.53 && v < 0.55)
				throw new TyrePuncturedException("Ooops! Tyre punctured ...");
			if (v > 0.23 && v < 0.25)
				throw new SpeedBreakerBouncedException("Oh No! Speed Breaker bounced...");
			if (v > 0.10 && v < 0.15)
				throw new SignalBreakException("Ooops! You break singal...");
			if (v > 0.95 && v < 0.99)
				throw new FuleRunsOutException("Oh no! Fuel tank is empty...");
			if (v > 0.75 && v < 0.80)
				throw new EngineOverheatedException("Oh no! Fuel tank is empty...");

		}
	}
}