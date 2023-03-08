package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trayecto t1 = new Trayecto (1, 1, 3, "eco");
		Trayecto t2 = new Trayecto (2, 5, 2, "normal");
		Trayecto t3 = new Trayecto (3, 2, 5, "eco");
		
		
		double consumo;
		int id, numero;
		
		List <Trayecto> listado = new ArrayList <Trayecto>();
		listado.add(t1);
		listado.add(t2);
		listado.add(t3);
		
		String modo;
		
		String eco = "eco";
		String normal = "normal";
		String deportivo = "deportivo";
		Coche cocheUsuario = new Coche(listado);
		
		int respuesta = 0;
		System.out.println("Bienvenido");
		
		
		do {
			System.out.println("-1- Buscar trayectos por modo de conduccion");
			System.out.println("-2- Buscar trayecto de mayor duracion");
			System.out.println("-3- Buscar por consumo");
			System.out.println("-4- Trayecto con menor combustible");
			System.out.println("-5- Modificar modo del trayecto");
			System.out.println("-6- Lista ordenada por modo");
			System.out.println("-7- Lista ordenada por duracion");
			System.out.println("-8- Ver trayectos aleatorios");
			System.out.println("-9- Media de consumo");
			System.out.println("-10- Ver todos los trayectos");
			respuesta=Leer.datoInt();
			
			
			switch(respuesta) {
				case 1:
					System.out.println("Indique el modo de conducción");
					System.out.println("1-eco, 2-normal, 3-deportivo");
					respuesta = Leer.datoInt();
						if(respuesta == 1) 							
								System.out.println(cocheUsuario.buscarPorModo(eco));
								
						if(respuesta == 2)	
								System.out.println(cocheUsuario.buscarPorModo(normal));
								
						if(respuesta== 3)
								System.out.println(cocheUsuario.buscarPorModo(deportivo));					
					break;
					
				case 2:
					System.out.println(cocheUsuario.trayectoMayorDuracion());
					break;
					
				case 3:
					System.out.println("Indique el consumo");
					consumo=Leer.datoDouble();
					System.out.println(cocheUsuario.buscarPorConsumo(consumo));					
					break;
					
				case 4:
					System.out.println(cocheUsuario.menorConsumo());
					break;
				
				case 5:
					System.out.println("Indique el id del trayecto");
					id=Leer.datoInt();
					System.out.println("Indique el modo");
					modo = Leer.dato();
					cocheUsuario.modificarTrayecto(cocheUsuario.buscarPorId(id), modo);
					break;
					
				case 6:
					Collections.sort(listado);
					
					for(int i = 0; i< listado.size(); i++) {
						System.out.println(listado.get(i));
					}
					break;
					
				case 7:
					Collections.sort(listado, new CompararPorDuracion());					
					for(int i = 0; i<listado.size(); i++) {
						System.out.println(listado.get(i));
					}
					break;
					
				case 8:
					System.out.println("Indique el número de trayectos");
					numero=Leer.datoInt();
					
					Collections.shuffle(listado);

					for(int i = 0; i<numero; i++) {
						System.out.println(listado.get(i));
					}
					break;

				case 9:
					System.out.println("El consumo medio es de:");
					System.out.printf("%.2f l\n" ,cocheUsuario.mediaConsumo());
					break;
					
				case 10:
					cocheUsuario.imprimirTrayectos();
					break;
					
				case 0:
					System.out.println("Saliendo");
					break;
					
				default:
					System.out.println("Opción incorrecta");
					break;
			}
			
		}while(respuesta != 0);
		
		System.out.println("Gracias por utilizar Trayectorium");
	}

}
