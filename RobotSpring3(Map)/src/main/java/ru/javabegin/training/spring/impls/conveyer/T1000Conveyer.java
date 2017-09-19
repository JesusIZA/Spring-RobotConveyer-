package ru.javabegin.training.spring.impls.conveyer;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotConveyer;

public abstract class T1000Conveyer implements RobotConveyer {

	@Override
	public abstract Robot createRobot();

}
