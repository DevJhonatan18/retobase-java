package arcmop.blog.springbootest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Operacion {

	@Id
	@GeneratedValue
	private int id;

	double sumando01;
	double sumando02;
	double resultado;

	public Operacion(double sumando01, double sumando02, double resultado) {

		this.sumando01 = sumando01;
		this.sumando02 = sumando02;
		this.resultado = resultado;
	}

	public Operacion() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSumando01() {
		return sumando01;
	}

	public void setSumando01(double sumando01) {
		this.sumando01 = sumando01;
	}

	public double getSumando02() {
		return sumando02;
	}

	public void setSumando02(double sumando02) {
		this.sumando02 = sumando02;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
