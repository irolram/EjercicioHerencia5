sealed class Usuario {

    class Estudiante(val id: String, val nombre:String, val carrera:String): Usuario()
    class Profesor(val id: String, val nombre:String, val departamento:String): Usuario()
    class Visitante(val id: String, val nombre:String): Usuario()

    companion object{
        fun comprobarPrestamo(usuario: Usuario, libro: Libro){
            when(usuario){
                is Usuario.Estudiante -> println("Prestamo aceptado")
                is Usuario.Profesor -> println("Prestamo aceptado")
                is Usuario.Visitante -> println("Prestamo denegado")
            }
        }
    }

}