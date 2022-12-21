data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun usuariosMatriculados() {
        for (usuarios in inscritos) {
            println("Nome: ${usuarios.nome} " + "email: ${usuarios.email}")
        }
    }
}