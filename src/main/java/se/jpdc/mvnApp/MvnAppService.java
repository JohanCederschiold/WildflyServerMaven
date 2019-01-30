package se.jpdc.mvnApp;

import java.util.List;
import javax.ejb.Remote;
import se.jpdc.mvnApp.domain.Raceturtle;

@Remote
public interface MvnAppService {
	
	public void addTurtle(String name);
	public void retireTurtle(int no);
	public List<Raceturtle> getAllTurtles();
	public String getNameOfTurtle (int no);
}
