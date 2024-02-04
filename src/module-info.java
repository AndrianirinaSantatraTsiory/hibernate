/**
 * 
 */
/**
 * @author Santatra
 *
 */
module affectation_hibernate {
	requires java.persistence;
	requires java.desktop;
	requires org.hibernate.orm.core;
	requires java.sql;
	requires com.sun.istack.runtime;
	opens entity;
}