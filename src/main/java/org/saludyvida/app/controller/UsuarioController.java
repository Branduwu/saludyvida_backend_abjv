package org.saludyvida.app.controller;
import org.saludyvida.app.models.Usuarios;
import org.saludyvida.app.service.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UsuarioController {

   
    @Autowired
    private UsuarioServicios usuarioService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuarios());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(Usuarios usuario) {
    	usuarioService.guardarUsuario(usuario);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    @GetMapping("/usuarios/{id}")
    public String mostrarDetallesUsuario(@PathVariable Long id, Model model) {
        Usuarios usuario = usuarioService.obtenerUsuarioPorId(id);
        model.addAttribute("usuario", usuario);
        return "detallesUsuario";
    }

    @GetMapping("/usuarios/editar/{id}")
    public String mostrarFormularioEditarUsuario(@PathVariable Long id, Model model) {
        Usuarios usuario = usuarioService.obtenerUsuarioPorId(id);
        model.addAttribute("usuario", usuario);
        return "editarUsuario";
    }

    @PostMapping("/usuarios/editar/{id}")
    public String actualizarUsuario(Usuarios usuario, @PathVariable Long id) {
    	usuarioService.actualizarUsuario(usuario, id);
        return "redirect:/usuarios/{id}";
    }

    @GetMapping("/usuarios/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
    	usuarioService.eliminarUsuario(id);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuariosActivos", usuarioService.obtenerUsuariosActivos());
        model.addAttribute("usuariosInactivos", usuarioService.obtenerUsuariosInactivos());
        return "listaUsuarios";
    }
}