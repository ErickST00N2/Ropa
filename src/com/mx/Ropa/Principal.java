package com.mx.Ropa;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ropa ropa1 = new Ropa(1, "jeans", "Levis", "32", "EUA", 800);
		Ropa ropa2 = new Ropa(2, "pantalon", "Chalino", "30", "MX", 200);
		Ropa ropa3 = new Ropa(3, "Jeans", "Levis", "34", "USA", 350);
		Ropa ropa4 = new Ropa(4, "Sweater", "H&M", "40", "China", 29.99);
		Ropa ropa5 = new Ropa(5, "Shorts", "Puma", "34", "India", 19.99);
		Ropa ropa6 = new Ropa(6, "camisa", "Aldo conti", "L", "MX", 500);
		Ropa ropa7 = new Ropa(7, "pantalon", "Lacoste", "32", "CH", 1800);
		Ropa ropa8 = new Ropa(8, "playera", "Polo", "18", "TAIWAN", 600);
		Ropa ropa9 = new Ropa(9, "short", "Lacoste", "18", "EUA", 800);

		// Auxiliar
		Ropa ropa = new Ropa();

		// Implementacion
		Implementacion imp = new Implementacion();

		// Guardar
		imp.guardar(ropa1);
		imp.guardar(ropa2);
		imp.guardar(ropa3);
		imp.guardar(ropa4);
		imp.guardar(ropa5);
		imp.guardar(ropa6);
		imp.guardar(ropa7);
		imp.guardar(ropa8);
		imp.guardar(ropa9);

		// Mostrar
//		imp.mostrar();
//
//		// Buscar
//		ropa = new Ropa(8);
//		ropa = imp.buscar(ropa);
//		System.out.println("Ropa encontrada: \n " + ropa);
//
//		// Editar
//		ropa = new Ropa(5);
//		ropa = imp.buscar(ropa);
//		ropa.setTalla("Grande");
//		ropa.setPrecio(2000);
//		imp.editar(ropa);
//		imp.mostrar();
//
//		// Eliminar
//		ropa = new Ropa(1);
//		ropa = imp.buscar(ropa);
//		imp.eliminar(ropa);
//		imp.mostrar();
//		System.out.println("Elemento eliminado: " + ropa.getTipo() + "\n Exitosamente!");
//
//		// Contar
//		imp.contar();

		//// MENU ////
		int menuP = 0, menuS = 0;
		Scanner sc = new Scanner(System.in);
		String auxP = null;
		int claveAux;
		do {
			mostrarMenu();
			menuP = sc.nextInt();

			// INCIAR SWITCH
			switch (menuP) {
			case 1:
				System.out.println("Esta es la informacion que contiene el hash");
				if (imp.hash.isEmpty()) {
					System.out.println("No hay datos en este HashMap");
				} else {
					imp.mostrar();
				}

				break; // Ciere del case 1 - MOSTRAR - de el switch principal

			case 2:

				ropa = new Ropa();
				System.out.println("+++++++++Agregar+++++++++");
				System.out.println("Agregar La Clave: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setClave(sc.nextInt());

				System.out.println("Agregar El Tipo: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setTipo(sc.nextLine());

				System.out.println("Agregar La Marca: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setMarca(sc.nextLine());

				System.out.println("Agregar El Origen: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setOrigen(sc.nextLine());

				System.out.println("Agregar La Talla: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setTalla(sc.nextLine());

				System.out.println("Agregar El Precio: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setPrecio(sc.nextDouble());

				if (imp.hash.containsValue(ropa)) {
					System.out.println("No se puede agregar esta prenda porque exite una igual registrada.");
				} else {
					imp.guardar(ropa);
				}

				break; // Cierre del case 2 - AGREGAR - de el switch principal

			case 3:
				System.out.println("Eliminar por marca");
				imprimirDatosHash(imp);
				
				if (imp.hash.size() < 1) {
					System.out.println("No se encontrón ningun registro");
					break;
				}
				
				System.out.println("Escribe la marca que desea eliminar: ");
				sc.nextLine(); 
				auxP = sc.nextLine();

				//
				if (!imp.hash.containsValue(auxP)) {
					System.out.println("No se encontró ninguna marca");
					break;
				}

				imp.eliminarPorMarca(auxP);

				System.out.println("Eliminando elementos con marca: " + auxP);

				
				System.out.println("Elementos con la marca: " + auxP + " Eliminados");
				imp.mostrar();

				break; // Cierre del case 3 - ELIMINAR - de el switch principal

			case 4:
				System.out.println("Eliminar por clave");
				imprimirDatosHash(imp);
				if (imp.hash.size() < 1) {
					System.out.println("No se encontrón ningun registro");
					break;
				}
				
				System.out.println("Escribe la clave que desea eliminar: ");
//				sc.nextLine();
				sc = new Scanner(System.in);
				claveAux = sc.nextInt();

				if (!imp.hash.containsKey(claveAux)) {
					System.out.println("No se encontró la clave");
					break;
				}


				ropa.setClave(claveAux);
				ropa = imp.hash.get(claveAux);
				
				System.out.println(ropa);
				
				imp.eliminar(ropa);
				
				
				System.out.println("Elementos con la clave: " + claveAux + " Eliminados");
				imp.mostrar();

				break; // Cierre del case 4 - ELIMINAR - de el switch principal

			case 5:
				if (imp.hash.size() < 1) {
					System.out.println("No se encontrón ningun registro");
					break;
				}

				System.out.println("Eliminando...");
				imp.hash.clear();
				break;

			case 6:
				System.out.println("Editar");
				imprimirDatosHash(imp);
				if (imp.hash.size() < 1) {
					System.out.println("No se encontrón ningun registro");
					break;
				}

				System.out.println("Añade la clave  de la ropa a editar: ");
				claveAux = sc.nextInt();
				if (!imp.hash.containsKey(Integer.parseInt(auxP))) {
					System.out.println("No se encontro nada con esta clave");
					break;
				}
				ropa.setClave(claveAux);
				ropa = imp.buscar(ropa);

				System.out.println("Agregar El Tipo: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setTipo(sc.nextLine());

				System.out.println("Agregar La Marca: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setMarca(sc.nextLine());

				System.out.println("Agregar El Origen: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setOrigen(sc.nextLine());

				System.out.println("Agregar La Talla: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setTalla(sc.nextLine());

				System.out.println("Agregar El Precio: ");
				sc.nextLine(); // Limpiar el buffer
				ropa.setPrecio(sc.nextDouble());

				imp.editar(ropa);

				break; // Cierre

			case 7:
				System.out.println("7. Buscar Por Clave");
				imprimirDatosHash(imp);
				
				if (imp.hash.size() < 1) {
					System.out.println("No se encontrón ningun registro");
					break;
				}
				
				System.out.println("Introduce la clave de la ropa a buscar");
				claveAux = sc.nextInt();
				if (!imp.hash.containsKey(claveAux)) {
					System.out.println("No se encontro ropa con esta clave");
					break;
				}

				ropa.setClave(claveAux);
				System.out.println("La ropa encontrada es: " + imp.buscar(ropa));

				break;

			case 8:
				System.out.println("8. Buscar Por Marca");
				
				imprimirDatosHash(imp);
				if (imp.hash.size() < 1) {
					System.out.println("No se encontrón ningun registro");
					break;
				}

				System.out.println("Introduce la marca de la ropa a buscar");
				auxP = sc.nextLine();
				if (!imp.hash.containsValue(auxP)) {
					System.out.println("No se encontro ropa con esta clave");
					break;
				}

				
				ropa.setMarca(auxP);
				System.out.println("La ropa encontrada es: " + imp.hash.get(ropa));

				break;

			case 9:
				System.out.println("9. Contar Prendas");
				imp.contar();

				break;

			case 10:

				System.out.println("Hasta pronto!");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + menuP);
			}// Cierre de el default del switch principal

		} while (menuP != 10);

	}// Aqui termina el main

	private static void mostrarMenu() {

		System.out.println("Bienvenido al menu!");
		System.out.println("1. Mostrar");
		System.out.println("2. Agregar");
		System.out.println("3. Eliminar Por Maca");
		System.out.println("4. Eliminar Por clave");
		System.out.println("5. Eliminar Todo");
		System.out.println("6. Editar");
		System.out.println("7. Buscar Por Clave");
		System.out.println("8. Buscar Por Marca");
		System.out.println("9. Contar Prendas");
		System.out.println("10. S A L I R");

	}

	public static void imprimirDatosHash(Implementacion imp) {
		System.out.println("Capturar datos mediante hash: ");
		for (Ropa ropa : imp.hash.values()) {
			System.out.println("Clave: " + ropa.getClave() + " marca: " + ropa.getMarca());
		}

	}

}
