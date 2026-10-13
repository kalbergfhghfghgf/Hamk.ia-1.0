package com.meuapp.iaoffline

import androidx.compose.ui.graphics.Color

/**
 * ARQUIVO DE PERSONALIZAÇÃO — pode mexer aqui sem medo.
 * Só troque o que está entre aspas ou o código da cor. Não apague as outras partes.
 */
object Marca {
    /** Nome da IA (aparece no topo, na abertura e nas conversas). */
    const val NOME = "jHamk.ia"

    /** Nome do modelo da IA (aparece em Ajustes > Modelo local). */
    const val MODELO = "KMA Ilimitada"

    /** Quem desenvolveu (aparece na abertura, no cadastro, nos ajustes e a IA sabe disso). */
    const val DESENVOLVEDOR = "KMA Ilimitada"
    const val CREDITO = "Desenvolvida por KMA Ilimitada"

    /** Quanto tempo a tela de abertura fica na tela, em milésimos de segundo (2500 = 2,5 segundos). */
    const val SPLASH_MS = 2500L

    /** Cor principal do app (verde neon). Formato: 0xFF + 6 letras/números da cor. */
    val COR_DESTAQUE = Color(0xFF22FF2A)

    /** Cor do anel de dentro da abertura (azul ciano). */
    val COR_SECUNDARIA = Color(0xFF00E5FF)
}
