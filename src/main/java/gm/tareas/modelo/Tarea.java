package gm.tareas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tarea {

  // The following code create the columns in the database table
  // @GeneratedValue(strategy = GenerationType.IDENTITY) is used to auto increment the idTarea column
  // @Entity is used to create a table in the database 
  // the variables are the columns in the table

  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idTarea;
  private String nombreTarea;
  private String responsable;
  private String estatus;

  
}
