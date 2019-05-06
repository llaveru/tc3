package tc3;

import java.util.ArrayList;

public class tc3 {

	static String[][] original;
	//la dimension de la matriz se especifica en nX x nY, ej. 3x 2y
	//                                                      xxx
	//                                                      xxx
	// matriz.lenght() seria ->3
	//matriz[0].length() seria->2
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicializarMatrizOriginal(3,2);
		original[0][0]="x";
		original[1][0]="x";
		original[2][0]="o";
		
		original[0][1]="x";
		original[1][1]="o";
		original[2][1]="x";
		
		System.out.println(original.length); //las columnas
		System.out.println(original[0].length);//las filas
		ArrayList<String> extra = new ArrayList();
		extra.add("xxx0");
		extra.add("x0x0");
		extra.add("00xx");
		
		
		
		//convertirListadoToMatriz(extra);
		dibujarMatriz(convertirListadoToMatriz(extra));
		
		//dibujarOriginal();
				System.out.println(original.length);
				System.out.println("");
				System.out.println(original[0].length);
		System.out.println("________");		
		dibujarEspejo(convertirListadoToMatriz(extra),"hor");
	}
	
	
	static void inicializarMatrizOriginal(int x, int y) {
		original = new String[x][y];
	}
	

	static void dibujarMatriz(String[][] matriz) {
		System.out.println("dibujando la matriz");
		int columnas= matriz.length;
		int filas = matriz[0].length;
		for (int y=0; y<filas; y++) {
			for (int x=0;x<columnas; x++) {
					System.out.print(matriz[x][y]);		}
			System.out.println();
		}
		
	}

	
	
	static void dibujarOriginal() {
		
		for (int y=0;y<2;y++) {
			for (int x=0;x<original.length;x++) {
					System.out.print(original[x][y]);		}
			System.out.println();
		}
		
	}
	
	static void dibujarEspejo(String[][] original,String reflejo) {
		ArrayList<String> lineas=new ArrayList<>();
		if (reflejo.equalsIgnoreCase("hor")) {
			int columnas= original.length;
			int filas = original[0].length;
			//System.out.println("filas->"+String.valueOf(filas));
			//System.out.println("cols->"+String.valueOf(columnas));
		
		String stringFila="";
		
		for (int y=0;y<filas;y++) {
			for (int x=0;x<columnas;x++) {
				stringFila=stringFila+original[x][y];
						
				
			}
		lineas.add(stringFila);
		stringFila="";
		}
		
		
		}
		
		for (int fila = lineas.size()-1;fila+1>0;fila--) {
			System.out.println(lineas.get(fila));	
		}
		

		
	}
	

	static String[][] convertirListadoToMatriz(ArrayList<String> listado) {
		int filas = listado.size(); //el numero de filas
		int columnas = listado.get(0).length();//el largo de cada fila
		System.out.println("dimension listado: "+columnas+" - "+filas);
		
		String[][] matriz = new String[columnas][filas];
		for (int y=0; y<(filas); y++) {
			for (int x=0; x<(columnas); x++) {
				matriz[x][y]=String.valueOf(listado.get(y).charAt(x));
				
			}
		}
		
		return matriz;
		
	}
	
	static void incrementarMatrizVertical(String[][] original, String[][] extra) {
		
	}


}//fin de la clase 
