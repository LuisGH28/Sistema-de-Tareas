package gm.tareas.servicio;

import gm.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicios {

  public List<Tarea> listarTareas();

  public Tarea buscarTareaPorId(Integer idTarea);

  public void guardarTarea(Tarea tarea);

  public void eliminarTarea(Tarea tarea);

}
