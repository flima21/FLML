# FLML CORPORATION PROJETO DE LINGUAGENS DE PROGRAMAÇÃO
#### DISCIPLINA QUALIDADE DE TESTE DE SOFTWARE 

## AUTORES 
:octocat: <a href="https://github.com/danilobarros3" target="__blank">Danilo Vieira Barros</a><br>
:octocat: <a href="https://github.com/EduardoHS-ZWrld" target="__blank">Eduardo Henrique dos Santos</a><br>
:octocat: <a href="https://github.com/flima21" target="__blank">Felipe Pedroso de Lima</a>

O FLML CORPORATION é um projeto desenvolvido na matéria de linguagens de promoção com o Professor Fábio Colombini, com o objetivo de simular o funcionamento de uma locadora de jogos onde o funcionário parametriza todos os dados de locação e o cliente final consegue atribuir o jogo escolhido ao seu cadastro.

# DESENVOLVIMENTO
O projeto foi desenvolvido com o auxílio da IDE NetBeans e com a utilização do Java Swing para implementação. 

# INSTLAÇÃO 
Utilize o comando `git clone https://github.com/flima21/FLML.git`

# DIRETÓRIOS
<ul>
    <li>
        build: Pasta com todas as classes que são executas quando o sistema é compilado.
        <ul>
            <li><b>conexoes:</b> Diretório que contém as classes responsáveis pela conexão com o banco de dados.</li>
            <li><b>connection:</b> Diretório vazio voltado para caso haja mais de um tipo de conexão com banco de dados.</li>
            <li><b>control:</b>Diretório vázio voltado para criação de classes testes.</li>
            <li><b>database:</b>Diretório com o objetivo de armazenar dumps do banco de dados.</li>
            <li><b>entity:</b>Diretório com as entidades principais que são executadas durante todo o sistema.</li>
            <li><b>images:</b>Diretório com as imagens e ícones que o sistema exibe em suas execuções.</li>
        </ul>
    </li>
    <li><b>nbproject:</b>Diretório gerado pelo NetBeans.</li>
    <li><b>src:</b>Diretório responsável pelo endereçamento das classes de execução.</li>
    <li><b>diagrams:</b>Diretório quem contém os planos de testes e diagramas</li>
</ul>

# COMPOSIÇÃO DE TESTES E QUALIDADE DE SOFTWARE
Para realização dos testes foram criados cenários baseados em metódologias que foram seguidas de forma escalar, segue abaixo:
1. Criação dos diagramas de caso de uso, atividas e sequência
2. Criação do plano de teste
3. Requisitos funcionais e não funcionais 
4. Documentação (Apenas da tela de Login) seguintes os requisitos do <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Javadoc</a>

## TESTE DE SISTEMA
Para realizar os testes de sistema foi utilizado um plano de teste constituído em uma estrutura tabular, conforme abaixo:

<table>
    <thead>
        <th>ID</th>
        <th>TITULO</th>
        <th>FUNCIONALIDADE/COMPONENTE</th>
        <th>EXECUÇÃO</th>
        <th>RESULTADO ESPERADO</th>
        <th>STATUS</th>
        <th>OBS</th>
    </thead>
    <tbody></tbody>
</table>

### PONTOS LEVADOS EM CONSIDERACAÇÃO
1. Mapeamento de toda estrutura de sistema, ou seja, as telas: Cadastro/Consulta
2. Teste das classes, como por exemplo, a tela de Login a qual foi realizada várias tentativas de "logar" no sistema
passando os parâmetros errados e depois corretos para verificar o comportamento 
3. Teste de campos que não podia ser cadastrados de forma vazia
4. Teste de perfomance no momento que os campos são extrapolados a sua capacidade máxima

# REQUISITOS NÃO FUNCIONAIS
Do ponto de vista requisitos funcionais, que está relacionado a experiência como usuário foi realizado os seguintes fatores
, onde foi identificado fragilidades e pontos a serem corrigidos.
1. Funcionalidade 
2. Usabilidade
3. Segurança

Para maiores informações consultar o arquivo em `diagrams/`



