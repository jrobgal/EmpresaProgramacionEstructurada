import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppEmpresa {
    public static void main(String[] args) throws Exception {
		double total = 0;

        //Definicion de las estructuras de almacenamiento
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> cargos = new ArrayList<String>();
		ArrayList<Double> salarios = new ArrayList<Double>();

		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la cantidad de empleados"));

		for(int emp = 0; emp < cantidad; emp++) {
			//Lectura de los datos de un empleado
			String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
			String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
			double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));

			//Almacenamiento de los datos en el ArrayList
			nombres.add(nombre);
			cargos.add(cargo);
			salarios.add(salario);
		}
			//Numero de empleados
			System.out.println("El numero de empleados es: " + cantidad);

			//Nombre y salario de cada empleado
			System.out.println("Los nombres y salarios de los empleados son: ");
			for(int i = 0; i < cantidad; i++) {
				System.out.println("Nombre: " + nombres.get(i) + " Salario: " + salarios.get(i));
			}

			//El total de dinero pagado por todos los empleados
			for(int i = 0; i < cantidad; i++) {
				total = total + salarios.get(i);
			}
			System.out.println("El total de dinero pagado a todos los empleados es: " + total);

			//Nombre, cargo y salario del empleado que mas salario gana
			int posicion = 0;
			double mayorSalario = salarios.get(0);
			for(int i = 1; i < cantidad; i++) {
				if(salarios.get(i) > mayorSalario) {
					mayorSalario = salarios.get(i);
					posicion = i;
				}
			}
			System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) 
			+ " Salario: " + salarios.get(posicion));
	}
}
