sealed class Usuario {

    class Estudiante(val id: String, val nombre:String, val carrera:String): Usuario()
    class Profesor(val id: String, val nombre:String, val departamento:String): Usuario()
    class Visitante(val id: String, val nombre:String): Usuario()


}