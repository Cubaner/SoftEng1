import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mitarbeiter extends Person implements Serializable{
	
	@Id @GeneratedValue
	private int id;
	

	public Mitarbeiter(){
		super();
	}
}
