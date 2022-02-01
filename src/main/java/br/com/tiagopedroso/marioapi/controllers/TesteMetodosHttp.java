package br.com.tiagopedroso.marioapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteMetodosHttp {

    @GetMapping
    public String mostrarMensagemInicial() {
        return "<code><pre>Bem-vindo ao Mario API :)\n" +
                "──────────────███████──███████\n" +
                "──────────████▓▓▓▓▓▓████░░░░░██\n" +
                "────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██\n" +
                "──────██▓▓▓▓▓▓████████████░░░░██\n" +
                "────██▓▓▓▓▓▓████████████████░██\n" +
                "────██▓▓████░░░░░░░░░░░░██████\n" +
                "──████████░░░░░░██░░██░░██▓▓▓▓██\n" +
                "──██░░████░░░░░░██░░██░░██▓▓▓▓██\n" +
                "██░░░░██████░░░░░░░░░░░░░░██▓▓██\n" +
                "██░░░░░░██░░░░██░░░░░░░░░░██▓▓██\n" +
                "──██░░░░░░░░░███████░░░░██████\n" +
                "────████░░░░░░░███████████▓▓██\n" +
                "──────██████░░░░░░░░░░██▓▓▓▓██\n" +
                "────██▓▓▓▓██████████████▓▓██\n" +
                "──██▓▓▓▓▓▓▓▓████░░░░░░████\n" +
                "████▓▓▓▓▓▓▓▓██░░░░░░░░░░██\n" +
                "████▓▓▓▓▓▓▓▓██░░░░░░░░░░██\n" +
                "██████▓▓▓▓▓▓▓▓██░░░░░░████████\n" +
                "──██████▓▓▓▓▓▓████████████████\n" +
                "────██████████████████████▓▓▓▓██\n" +
                "──██▓▓▓▓████████████████▓▓▓▓▓▓██\n" +
                "████▓▓██████████████████▓▓▓▓▓▓██\n" +
                "██▓▓▓▓██████████████████▓▓▓▓▓▓██\n" +
                "██▓▓▓▓██████████──────██▓▓▓▓████\n" +
                "██▓▓▓▓████──────────────██████ \n" +
                "──████</pre></code>";

    }

}
