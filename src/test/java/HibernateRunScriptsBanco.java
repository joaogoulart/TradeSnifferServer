import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Exportar apenas script
 * 
 * @author Joao
 * 
 */
@SuppressWarnings("deprecation")
public class HibernateRunScriptsBanco {

	public static void main(String[] args) {
		String outFile = "./banco/scripts.sql";

		Configuration cfg = new AnnotationConfiguration();
		cfg.setNamingStrategy(new ImprovedNamingStrategy());

		cfg.configure();
		SchemaExport export = new SchemaExport(cfg);
		export.setDelimiter(";");
		export.setOutputFile(outFile);

		export.create(true, false);
		
		System.out.println("fim");
	}

}
