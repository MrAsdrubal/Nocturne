package Logica;

import DataBase.ConexionBD;

public class Usuario extends ConexionBD {

        private String codigoUnico;
        private String nombre;
        private String apellido;
        private String constraseña;

        public Usuario(String codigoÚnico, String nombre, String apellido, String contraseña) {
            this.codigoUnico = codigoÚnico;
            this.nombre = nombre;
            this.apellido = apellido;
            this.constraseña = contraseña;
        }

        public String getCodigoUnico() {
            return codigoUnico;
        }

        public void setCodigoUnico(String codigoUnico) {
            this.codigoUnico = codigoUnico;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getConstraseña() {
            return constraseña;
        }

        public void setConstraseña(String constraseña) {
            this.constraseña = constraseña;
        }

    }
