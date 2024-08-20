// Criação do projeto: Atividade02_ManipulacaoVariavel
internal object Atividade02_ManipulacaoVariavel {
    @JvmStatic
    fun main(args: Array<String>) {
        // 1. Declaração de variáveis
        val nome = "João" // Nome da pessoa
        val idade = 25 // Idade da pessoa
        val salarioBrutoMensal = 2500.00 // Salário bruto mensal
        val mesesTrabalhados = 12 // Quantidade de meses trabalhados no ano
        val quantidadeProdutos = 5 // Quantidade de produtos comprados
        val valorTotalCompras = 500.00 // Valor total de compras

        // 2. Operações simples
        // Calcular o salário anual bruto
        val salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados

        // Subtrair um valor fixo de desconto do salário anual bruto
        val desconto = 2000.00 // Valor fixo de desconto
        val salarioAnualLiquido = salarioAnualBruto - desconto

        // Calcular a média do valor gasto por produto
        val mediaGastoPorProduto = valorTotalCompras / quantidadeProdutos

        // Concatenação de uma string com o nome da pessoa e o salário anual líquido
        val mensagem = "Olá $nome, seu salário anual líquido é R$ $salarioAnualLiquido."

        // 3. Exibição dos resultados
        println("Nome: $nome")
        println("Idade: $idade")
        println("Salário Bruto Mensal: R$ $salarioBrutoMensal")
        println("Meses Trabalhados: $mesesTrabalhados")
        println("Quantidade de Produtos Comprados: $quantidadeProdutos")
        println("Valor Total das Compras: R$ $valorTotalCompras")
        println("Salário Anual Bruto: R$ $salarioAnualBruto")
        println("Salário Anual Líquido após desconto: R$ $salarioAnualLiquido")
        println("Média Gasto por Produto: R$ $mediaGastoPorProduto")
        println(mensagem)
    }
}