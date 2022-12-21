fun main() {
    // Simulações com objetos
    val usuarioTeste = Usuario(nome = "Ana Guerra", email = "ana.guerrads@hotmail.com")
    val segundoUsuarioTeste = Usuario(nome = "Felipe Guerra", email = "felipeguerrads@hotmail.com")

    val conteudosTeste: List<ConteudoEducacional> = listOf(
        ConteudoEducacional(
        nome = "Windows",
        duracao = 70),
        ConteudoEducacional(
            nome = "Linux",
            duracao = 90),
        ConteudoEducacional(
            nome = "mac",
            duracao = 90
        )
    )

    val formacaoTeste = Formacao(
        nome = "Sistemas Operacionais Linux, Windows e mac",
        conteudos = conteudosTeste,
        nivel =  Nivel.BASICO
    )

    println("Quantidade de conteúdos: ${conteudosTeste.size}")
    println("Conteúdos: $conteudosTeste")
    println("Formação: ${formacaoTeste.nome} (${formacaoTeste.nivel})")
    println("Inscritos: ${formacaoTeste.inscritos.size}")
    formacaoTeste.matricular(usuarioTeste)
    formacaoTeste.matricular(segundoUsuarioTeste)
    formacaoTeste.usuariosMatriculados()
    println("Inscritos: ${formacaoTeste.inscritos.size}")
}