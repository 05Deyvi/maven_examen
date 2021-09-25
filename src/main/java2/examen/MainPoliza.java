package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPoliza extends Poliza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner tecladoInt = new Scanner(System.in);
		String opcion;

		Poliza poliza1 = new Poliza();
		poliza1.setNombre(nombre);
		poliza1.setDescripcion(descripcion);
		poliza1.setAnioVigencia(anioVigencia);
		poliza1.setCodigoPoliza(codigoPoliza);
		poliza1.setValorPoliza(valorPoliza);

		Poliza poliza2 = new Poliza();
		poliza2.setNombre(nombre);
		poliza2.setDescripcion(descripcion);
		poliza2.setAnioVigencia(anioVigencia);
		poliza2.setCodigoPoliza(codigoPoliza);
		poliza2.setValorPoliza(valorPoliza);

		Poliza poliza3 = new Poliza();
		poliza3.setNombre(nombre);
		poliza3.setDescripcion(descripcion);
		poliza3.setAnioVigencia(anioVigencia);
		poliza3.setCodigoPoliza(codigoPoliza);
		poliza3.setValorPoliza(valorPoliza);

		Poliza poliza4 = new Poliza();
		poliza4.setNombre(nombre);
		poliza4.setDescripcion(descripcion);
		poliza4.setAnioVigencia(anioVigencia);
		poliza4.setCodigoPoliza(codigoPoliza);
		poliza4.setValorPoliza(valorPoliza);

		Poliza poliza5 = new Poliza();
		poliza5.setNombre(nombre);
		poliza5.setDescripcion(descripcion);
		poliza5.setAnioVigencia(anioVigencia);
		poliza5.setCodigoPoliza(codigoPoliza);
		poliza5.setValorPoliza(valorPoliza);

		do {

			System.out.println("BIENVENIDO A LA ASEGURADORA");
			System.out.println("****************************");
			System.out.println("elija una opcion");
			System.out.println("1.Ingresar Póliza");
			System.out.println("2.Actualizar Valor");
			System.out.println("3.Consultar Póliza");
			System.out.println("4.Imprimir Reporte");
			System.out.println("5. SALIR");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("escoja el tipo de poliza");
				System.out.println("1.poliza general");
				System.out.println("2. poliza vip");
				String opcionPoliza = teclado.next();

				switch (opcionPoliza) {
				case "1":

					System.out.println("ingrese nombre");
				      nombre = teclado.nextLine();
					System.out.println("ingrese descripcion");
					 descripcion = teclado.nextLine();
					System.out.println("ingrese año de vigencia");
					 anioVigencia = teclado.nextLine();
					System.out.println("ingrese codigo de poliza");
					 codigoPoliza = teclado.nextLine();
					System.out.println("ingrese valor de poliza");
					 valorPoliza = teclado.nextInt();
					System.out.println("ingrese datos adicionales");
					System.out.println("ingrese codigo de descuento");
					String descuento = teclado.nextLine();
					System.out.println("numero de seguro");
					String num = teclado.nextLine();
					List<Poliza> listaPoliza = new ArrayList<Poliza>();
					listaPoliza.add(poliza1);
					listaPoliza.add(poliza2);
					listaPoliza.add(poliza3);
					listaPoliza.add(poliza4);
					listaPoliza.add(poliza4);

					break;
				case "2":
					System.out.println("ingrese nombre");
					 nombre = teclado.nextLine();
					System.out.println("ingrese descripcion");
					 descripcion = teclado.nextLine();
					System.out.println("ingrese año de vigencia");
					 anioVigencia = teclado.nextLine();
					System.out.println("ingrese codigo de poliza");
					 codigoPoliza = teclado.nextLine();
					System.out.println("ingrese valor de poliza");
					 valorPoliza = teclado.nextInt();
					System.out.println("ingrese datos adicionales");
					System.out.println("ingrese ek beneficio de la poliza");
					String bene = teclado.nextLine();
					List<Poliza> listaPoliza2 = new ArrayList<Poliza>();
					listaPoliza2.add(poliza1);
					listaPoliza2.add(poliza2);
					listaPoliza2.add(poliza3);
					listaPoliza2.add(poliza4);
					listaPoliza2.add(poliza4);
					break;

				}
			case "2":
              System.out.println("ingrese codigo de poliza");
              String codigo3 = teclado.nextLine();
              boolean resultado1 = codigoPoliza.equals(codigo3);
              if(resultado1==true) {
            	  System.out.println("ingrese nuevo valor de poliza");
            	  int valor3 = teclado.nextInt();
              }else{
            	  System.out.println("no se encuentra en la base de datos");
            	  
            	  
              }

			}
		} while (!opcion.equals("3"));
	}

}
