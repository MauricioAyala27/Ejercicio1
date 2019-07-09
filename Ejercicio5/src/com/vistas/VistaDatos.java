package com.vistas;

import java.util.Scanner;

import com.clases.Empleado;

public class VistaDatos {

	public static void main(String[] args) {
		
		Empleado em = new Empleado();
		Scanner sc = new Scanner(System.in);
		
		try {
			
			
			System.out.println(":::::::::BIENVENIDO AL SISTEMA:::::::::");
			System.out.println("Digite su DUI: ");
			em.setDui(sc.nextLine());
			System.out.println("Digite el nombre del empleado: ");
			em.setNombreEmpleado(sc.nextLine());
			System.out.println("Digite la edad del empleado: ");
			em.setEdad(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite el genero del empleado: ");
			em.setGenero(sc.nextLine());
			System.out.println("Digite el sueldo del empleado: ");
			em.setSueldo(Double.parseDouble(sc.nextLine()));
			System.out.println("Digite el cargo del empleado: ");
			em.setNombreCargo(sc.nextLine());
			System.out.println("Digite el departamento del empleado: ");
			em.setDepartamento(sc.nextLine());
			sc.close();
			
			em.obtenerDatos();
			
			
			
		}catch(Exception e) {
			System.out.println("Ocurrio un error " + e.toString());
		}

	}

}
