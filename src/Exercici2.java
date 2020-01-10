import java.io.*;

public class Exercici2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Camp variable tipus Comarca
		Cotxes cotxe;
		//Declaració del fitxer
		File fitxer = new File("/home/user/Escriptori/comarquesObject.txt");
		//Crea el flux de sortida
		FileOutputStream fileout = new FileOutputStream(fitxer);
		FileInputStream filein = new FileInputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectOutputStream dataOuComarq = new ObjectOutputStream(fileout);
		ObjectInputStream dataInComarq = new ObjectInputStream(filein);
		//Les dades per generar els objectes Comarca
		String marca[] = {"Bugatti", "Lamborghini", "Seat", "Peugeot"};
		String model[] = {"Deportiu","Tot-Terreny", "Electric", "Gasolina"};
		String any[] = {"2010", "2014", "2016", "2011"};
		String matricula[] = {"190249", "22713", "184403", "9550"};
		
		//Recorre els arrays 
		for (int i=0; i<marca.length; i++){//Crea la comarca
			cotxe = new Cotxes(marca[i],model[i], any[i], matricula[i]);
			dataOuComarq.writeObject(cotxe);//L'escriu al fixer
		}
		
		try {
			while (true){//Llegeix el fitxer
				//Llegeix la comarca
				
				cotxe = (Cotxes) dataInComarq.readObject();
				System.out.println("Marca del cotxe: " +cotxe.getMarca()+
						" Anys"+ cotxe.getAnys() + "Model: " + cotxe.getModel() +
						"Matricula: " + cotxe.getMatricula());
				
			}
			
		} catch (EOFException eo) {	
			
		}
		
		dataOuComarq.close();//Tanca el stream de sortida
		dataInComarq.close();//Tanca el stream d'entrada
		
	}
}



