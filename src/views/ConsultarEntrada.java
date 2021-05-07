package views;

import controllers.EntradaController;
import models.Entrada;

public class ConsultarEntrada {
	public static void renderizar() {
		System.out.println("\n".repeat(15));	
		System.out.println("\n-- LISTAR ENTRADAS --\n");
		for(Entrada entradaCadastrada : EntradaController.listar()) {
			System.out.println(entradaCadastrada);
		}
	}
}
