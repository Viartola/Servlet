package servlet;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculaEdad {
	public static String getEdad(Date fechaNacimiento) {
	
        if (fechaNacimiento != null) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            StringBuilder result = new StringBuilder();

            if (fechaNacimiento != null) {
                Calendar c = new GregorianCalendar();
                
                result.append("Tienes: ");

                c.setTime(fechaNacimiento);

                result.append(calcularEdad(c));
                
                result.append(" años");
            }

            return result.toString();
        }
        
        return "Error inserte fecha de nacimiento para calcular la edad";
    }
	
	private static int calcularEdad(Calendar fechaNac) {
		
        Calendar today = Calendar.getInstance();
        
        int diffYear = today.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        int diffMonth = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);

        int diffDay = today.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Si está en ese año pero todavía no los ha cumplido

        if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) 
        	
            diffYear = diffYear - 1;  
       
        if(diffYear < 0)
        	
        	diffYear = 0;

        return diffYear;
	}
}
