
fun main() {

        fun comprobarPrestamo(usuario: Usuario, libro: Libro){
            when(usuario){
                is Usuario.Estudiante -> println("Prestamo de libro ${libro.titulo} a ${usuario.nombre} aceptado")
                is Usuario.Profesor -> println("Prestamo de libro ${libro.titulo} a ${usuario.nombre} aceptado")
                is Usuario.Visitante -> println("Prestamo de libro ${libro.titulo} a ${usuario.nombre} denegado")
            }
        }

    val usuario1 = Usuario.Profesor("3245356", "Pepe", "Cocina")
    val usuario2 = Usuario.Visitante("49835", "Juan")
    val usuario3 = Usuario.Estudiante("589576", "Luisa", "Periodismo")

    val libro1 = Libro("Noseque", "Nosecuanto")

    comprobarPrestamo(usuario1, libro1)
    comprobarPrestamo(usuario2, libro1)
    comprobarPrestamo(usuario3, libro1)

}