import java.io.Serializable;

public class Cotxes implements Serializable {
	//Implementa la interfície Serializable
	private String marca;
	private String model;
	private String any;
	private String matricula;

	//constructor amb paràmetres
	public Cotxes (String marca, String model, String any, String matricula){
		//per no confondre el paràmetre amb el camp de variable
		this.marca = marca;
		this.any = any;
		this.model = model;
		this.matricula = matricula;
	}
	public Cotxes (){//constructor per defecte
		this.marca = null;
	}
	//per donar el valor als camps de variable private
	public void setMarca(String comarca){marca = comarca;}
	public void setAny(String poblacio){ any = poblacio;}
	//per consultar el valor dels camps de variable private
	public String getMarca(){return marca;}
	public String getAnys(){return any;}
	public String getModel(){
		return model;
	}
	public String getMatricula(){
		return matricula;
	}

}