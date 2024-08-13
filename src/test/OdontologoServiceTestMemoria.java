package test;

import dao.impl.DaoEnMemoria;
import model.Odontologo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTestMemoria {

    OdontologoService odontologoService = new OdontologoService(new DaoEnMemoria());

    @Test
    @DisplayName("Testear que un odontologo fue cargado correctamente")
    void caso1(){
        //Dado
        Odontologo odontologo = new Odontologo("987654", "Carmen", "Gutierrez");
        //cuando
        Odontologo odontologoDesdeMemoria = odontologoService.guardarOdontologo(odontologo);
        // entonces
        assertNotNull(odontologoDesdeMemoria.getId());
    }

    @Test
    @DisplayName("Testear que se listan todos los odontologos")
    void caso2() {
        // Dado
        Odontologo odontologo1 = new Odontologo("123456", "Juan", "Perez");
        Odontologo odontologo2 = new Odontologo("789012", "Maria", "Lopez");

        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);

        // Cuando
        List<Odontologo> odontologos = odontologoService.listarTodos();

        // Entonces
        assertEquals(2, odontologos.size());


    }

}