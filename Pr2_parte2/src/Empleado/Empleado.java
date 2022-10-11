package Empleado;

public class Empleado {

	enum TipoEmpleado{vendedor,encargado}
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float Nomina,Salario;
		if(tipo == TipoEmpleado.vendedor) {
			Salario=2000;
			if(ventasMes>=1500)
				Salario += 200;
			else if(ventasMes>=1000 && ventasMes<1500)
				Salario += 100;
			Nomina = Salario + horasExtra*30;
			return Nomina;
		}else {
			Salario=2500;
			if(ventasMes>=1500)
				Salario += 200;
			else if(ventasMes>=1000 && ventasMes<1500)
				Salario += 100;
			Nomina = Salario + horasExtra*30;
			return Nomina;
		}
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion;
		if(nominaBruta <= 2100) {
			retencion = 0;
			return nominaBruta*(1-retencion);
		}
		else if(nominaBruta > 2100 && nominaBruta <=2500) {
			retencion = (float) 0.15;
			return nominaBruta*(1-retencion);
		}
		else {
			retencion = (float) 0.18;
			return nominaBruta*(1-retencion);
		}
		
	}
}
