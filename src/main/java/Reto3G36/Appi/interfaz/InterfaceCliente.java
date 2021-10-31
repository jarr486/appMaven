package Reto3G36.Appi.interfaz;

import Reto3G36.Appi.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
}
