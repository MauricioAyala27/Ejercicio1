package com.clases;

public class Cargo {
	
	private String nombreCargo;
	private String departamento;
	private int cantidadVacantes;
	
	public Cargo() {	
	}

	public Cargo(String nombreCargo, String departamento, int cantidadVacantes) {
		this.nombreCargo = nombreCargo;
		this.departamento = departamento;
		this.cantidadVacantes = cantidadVacantes;
	}

	public String getNombreCargo() {
		return nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCantidadVacantes() {
		return cantidadVacantes;
	}

	public void setCantidadVacantes(int cantidadVacantes) {
		this.cantidadVacantes = cantidadVacantes;
	}
	
	public void obtenerDatos() {
		System.out.println("Datos de Cargos");
	}
	
	
	
	

}
