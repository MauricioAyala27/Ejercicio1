package com.vistas;

import java.util.Scanner;

import com.clases.CuentaBancaria;

public class VistaCuenta {

	public static void main(String[] args) {
		
		try {
			
			CuentaBancaria cb = new CuentaBancaria();
			Scanner sn = new Scanner(System.in);
			
			System.out.println("::::::::BIENVENIDO::::::::");
			System.out.println("Digite el nombre del cliente: ");
			cb.setNombreCliente(sn.nextLine());
			System.out.println("Digite el numero de cuenta: ");
			cb.setNumeroCuenta(sn.nextLine());
			System.out.println("Digite el tipo de interes: ");
			cb.setTipoInteres(Double.parseDouble(sn.nextLine()));
			System.out.println("Digite el saldo del cliente: ");
			cb.setSaldo(Double.parseDouble(sn.nextLine()));
			sn.close();
			
			System.out.println("\n\n::::::::DATOS DEL CLIENTE::::::::\n"
								+"Nombre del cliente:" + cb.getNombreCliente() +
								"\nNumero de Cuenta:" + cb.getNumeroCuenta() +
								"\nTipo de Interes:" + cb.getTipoInteres() +
								"\nSaldo:" + cb.getSaldo());
			
			
		}catch(Exception e) {
			System.out.println("Ocurrio un error" + e.toString());
		}

	}

}
