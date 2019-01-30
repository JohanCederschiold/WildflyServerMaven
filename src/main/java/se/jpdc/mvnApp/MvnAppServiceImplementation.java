package se.jpdc.mvnApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import se.jpdc.mvnApp.domain.Raceturtle;

@Stateless
public class MvnAppServiceImplementation implements MvnAppService {

	@Override
	public void addTurtle(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjavatest?password=SQL@2018&useSSL=false&user=root&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
			PreparedStatement prepStat = connection.prepareStatement("insert into turtle (fldname) values (?)");
			prepStat.setString(1, name);
			prepStat.execute();
			
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void retireTurtle(int no) {
	}

	@Override
	public List<Raceturtle> getAllTurtles() {
		List<Raceturtle> turtles = new ArrayList<>();
		turtles.add(new Raceturtle("TurtleOne"));
		turtles.add(new Raceturtle("TurtleTwo"));
		turtles.add(new Raceturtle("TurtleThree"));
		return turtles;
	}

	@Override
	public String getNameOfTurtle(int no) {
		return "Bobby Boy";
	}

}
