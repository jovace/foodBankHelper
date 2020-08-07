package jovace.foodBankHelper.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonaEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPersona;
	private String nombre;
	private String identificacion;
	private Date f_nacimiento;
	private String nacionalidad;
	
	public PersonaEntity() {}
	
	@Override
	public String toString() {
		return String.format("Persona[id=%d, nombre='%s', identificacion='%s'", 
				idPersona, 
				nombre, 
				identificacion);
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Date getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(Date f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
