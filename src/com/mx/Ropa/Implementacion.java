package com.mx.Ropa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Implementacion implements IMetodos {

	/**
	 * HashMap
	 * 
	 * MashMap libreria de java.util KeyDataType -> clase contenedora de datos clave
	 * ValueDataType -> clase contenedora de datos primitivo valor nombre HashMap ->
	 * asignado por el programador new ->palabra reservada para invocar al
	 * constructor,
	 */

	HashMap<Integer, Ropa> hash = new HashMap<Integer, Ropa>();

	@Override
	public void guardar(Ropa ropa) {
		// TODO Auto-generated method stub
		hash.put(ropa.getClave(), ropa);
	}

	@Override
	public Ropa buscar(Ropa ropa) {
		// TODO Auto-generated method stub
		return hash.get(ropa.getClave());
	}

	@Override
	public void editar(Ropa ropa) {
		// TODO Auto-generated method stub
		hash.replace(ropa.getClave(), ropa);
	}

	@Override
	public void eliminar(Ropa ropa) {
		// TODO Auto-generated method stub
		hash.remove(ropa.getClave());

	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);

	}

	// Metodo personalizado
	public void contar() {
		System.out.println("El HashMap contiene: "
				+ hash.size() + " elementos");
	}
	
	// Metodo para eliminar por Marca
	public void eliminarPorMarca(String marca) {
		System.out.println("Eliminando elementos con marca: " + marca);
		Iterator<Map.Entry<Integer, Ropa>> iterator =  hash.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, Ropa> entry = iterator.next();
			Ropa ropa = entry.getValue();
			if (ropa.getMarca().equalsIgnoreCase(marca)) {
				System.out.println("Eliminando ropa por clave: " +ropa.getClave());
				iterator.remove();
			}
		}
		
	}//Finaliza eliminarPorMarca
	
//	// Metodo para eliminar por clave
//	public void eliminarPorClave(String clave) {
//		System.out.println("Eliminando elementos con clave: " + clave);
//		Iterator<Map.Entry<Integer, Ropa>> iterator =  hash.entrySet().iterator();
//		
//		while(iterator.hasNext()) {
//			Map.Entry<Integer, Ropa> entry = iterator.next();
//			Ropa ropa = entry.getValue();
//			if (ropa.getMarca().equalsIgnoreCase(clave)) {
//				System.out.println("Eliminando ropa por clave: " +ropa.getClave());
//				iterator.remove();
//			}
//		}
//		
//	}//Finaliza eliminarPorClave

}
