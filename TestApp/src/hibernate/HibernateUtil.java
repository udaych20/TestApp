package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	public static StandardServiceRegistry registry;
	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			// Create registry
			registry = new StandardServiceRegistryBuilder().configure().build();
			// Create MetadataSources
			MetadataSources sources = new MetadataSources(registry);

			// Create Metadata
			Metadata build = sources.getMetadataBuilder().build();

			// Create SessionFactory
			sessionFactory = build.getSessionFactoryBuilder().build();
			
		}
		return sessionFactory;
		
	}

	public static void shutDownRegistry() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
