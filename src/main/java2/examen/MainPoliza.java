package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainPoliza extends Poliza{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String opcion;
		
		Poliza poliza1 = new Poliza();
		poliza1.setNombre(nombre);
		poliza1.setDescripcion(descripcion);
		poliza1.setAnioVigencia(anioVigencia);
		poliza1.setCodigoPoliza(codigoPoliza);
		poliza1.setValorPoliza(valorPoliza);
		poliza1.
		
		
		List<Poliza> listaAuto = new ArrayList<Poliza>();
		
		do {

			System.out.println("BIENVENIDO A LA ASEGURADORA");
			System.out.println("****************************");
			System.out.println("elija una opcion");
			System.out.println("Ingresar Póliza");
			System.out.println("Actualizar Valor");
			System.out.println("Consultar Póliza");
			System.out.println("Imprimir Reporte");
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
					String nombre = teclado.nextLine();
					System.out.println("ingrese descripcion");
					String des = teclado.nextLine();
					System.out.println("ingrese año de vigencia");
					String vige = teclado.nextLine();
					System.out.println("ingrese codigo de poliza");
					String codigo = teclado.nextLine();
					System.out.println("ingrese valor de poliza");
					String valor = teclado.nextLine();
					System.out.println("ingrese datos adicionales");
					System.out.println("ingrese codigo de descuento");
					String descuento = teclado.nextLine();
					System.out.println("numero de seguro");
					String num = teclado.nextLine();
					
					break;
				case "2":
					System.out.println("ingrese nombre");
					String nombre2 = teclado.nextLine();
					System.out.println("ingrese descripcion");
					String des2 = teclado.nextLine();
					System.out.println("ingrese año de vigencia");
					String vige2 = teclado.nextLine();
					System.out.println("ingrese codigo de poliza");
					String codigo2 = teclado.nextLine();
					System.out.println("ingrese valor de poliza");
					String valor2 = teclado.nextLine();
					System.out.println("ingrese datos adicionales");
					System.out.println("ingrese ek beneficio de la poliza");
					String bene = teclado.nextLine();

				}

			}
		} while (!opcion.equals("3"));
	}

}
