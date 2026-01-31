package org.tatajavaclients.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteResponseDTO {

    @JsonProperty("id")
    private String id;

    @NotNull(message = "El nombre no puede ser nulo.")
    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("genero")
    @Size(max = 10)
    private String genero;

    @JsonProperty("edad")
    private int edad;

    @NotNull(message = "La identificacion no puede ser nula.")
    @JsonProperty("identificacion")
    @Size(max = 30)
    private String identificacion;

    @NotNull(message = "La dirección no puede ser nula.")
    @JsonProperty("direccion")
    private String direccion;

    @NotNull(message = "El teléfono no puede ser nulo.")
    @JsonProperty("telefono")
    @Size(max = 10)
    private String telefono;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
