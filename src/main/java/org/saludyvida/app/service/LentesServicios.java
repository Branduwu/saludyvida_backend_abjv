package org.saludyvida.app.service;

import org.saludyvida.app.models.Lentes;
import java.util.List;

public interface LentesServicios {
    Lentes obtenerLentePorId(Long id);
    List<Lentes> obtenerLentesPorMarca(String marca);
    List<Lentes> obtenerLentesPorPrecio(Double precioMin, Double precioMax);
    Lentes guardarLente(Lentes lente);
    Lentes actualizarLente(Lentes lente, Long id);
    void eliminarLente(Long id);
}