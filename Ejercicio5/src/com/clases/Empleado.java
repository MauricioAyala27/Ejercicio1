package com.clases;

public class Empleado extends Cargo{
	
	private String dui;
	private String nombreEmpleado;
	private int edad;
	private String genero;
	private double sueldo;
	
	public Empleado() {
	}

	public Empleado(String nombreCargo, String departamento, int cantidadVacantes, String dui, String nombreEmpleado,
			int edad, String genero, double sueldo) {
		super(nombreCargo, departamento, cantidadVacantes);
		this.dui = dui;
		this.nombreEmpleado = nombreEmpleado;
		this.edad = edad;
		this.genero = genero;
		this.sueldo = sueldo;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	public void obtenerDatos() {
		
		System.out.println("\n\n\n:::::::::::DATOS CLIENTE:::::::::::\n"+
						   "DUI: " + this.dui + 
						   "\nNombre Empleado: " + this.nombreEmpleado +
						   "\nEdad: " + this.edad +
						   "\nGenero: " + this.genero +
						   "\nSueldo: " + this.sueldo +
						   "\nCargo: " + this.getNombreCargo() +
						   "\nDepartamento: " + this.getDepartamento());
		
	}
	
	
	
	

}
