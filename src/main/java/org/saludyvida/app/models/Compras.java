package org.saludyvida.app.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compras;

    @Column(name = "Id_usuario")
    private Long id_usuario;

    @Column(name = "id_tipo_pago")
    private Long id_tipo_pago;

    @Column(name = "fecha_compra")
    private Date fecha_compra;

    @Column(name = "pago_total")
    private Long pago_total;

    // Constructores, getters y setters
}