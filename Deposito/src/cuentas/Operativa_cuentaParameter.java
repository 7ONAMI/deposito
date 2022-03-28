package cuentas;

public class Operativa_cuentaParameter {
	private Cantida Cantidad;

	public Operativa_cuentaParameter(Cantida cantidad) {
		Cantidad = cantidad;
	}

	public Cantida getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Cantida cantidad) {
		Cantidad = cantidad;
	}
}