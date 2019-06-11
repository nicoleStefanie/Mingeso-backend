package MingesoTingeso.demo.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Long idUser;

    @Column(nullable = false, name = "nombreUsuario")
    private String nombreUsuario;

    @Column(nullable = false, name = "rolUsuario")
    private String rolUsuario;

    @Column(nullable = false, name = "correoUsuario")
    private String correoUsuario;

    @Column(nullable = false, name = "rutUsuario")
    private int rutUsuario;

    @Column(nullable = false, name = "password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    @JsonIgnore
    private List<Historial> historiales;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    @JsonIgnore
    private List<Reserva> reservas;


    public Usuario() {

    }

    public Usuario(String nombreUsuario, String rolUsuario, String correoUsuario, int rutUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.rolUsuario = rolUsuario;
        this.correoUsuario = correoUsuario;
        this.rutUsuario= rutUsuario;
        this.password = password;
    }

    public Long getIdUsuario() {
        return idUser;
    }

    public void setIdUsuario(Long idUser) {
        this.idUser= idUser;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getCorreoUsuario(){
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario){
        this.correoUsuario = correoUsuario;
    }

    public int getRutUsuario(){
        return rutUsuario;
    }

    public void setRutUsuario(int rutUsuario){
        this.rutUsuario = rutUsuario;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Historial> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(List<Historial> historiales) {
        this.historiales = historiales;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
