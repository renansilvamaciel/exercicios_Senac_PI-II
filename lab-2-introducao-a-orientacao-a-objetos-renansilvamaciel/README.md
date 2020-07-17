# Introdução a Orientacao a Objetos com Java
Objetivo: Apresentar os conceitos básicos de Orientação a Objetos para viabilizar o uso de formulários e classes do projeto.

### Tarefa 1 - Projetar uma Classe 
1.1 Adicione à classe Carro, as seguintes propriedades:
* ***fabricante*** – _String_ – propriedade da ***CLASSE***
* ***rodas*** – Vetor de _String_ – propriedade da ***instância (OBJETO)***
* ***cor*** – _String_ – propriedade da ***instância (OBJETO)***
* ***modelo*** – _String_ – propriedade da ***instância (OBJETO)***
* ***velocidadeAtual*** – _Inteiro_ – propriedade da ***instância (OBJETO)***

1.2 Defina um ***construtor*** vazio para a classe:
<code>public Carro() {} </code>

1.3 Crie os métodos acessores (***_getters e setters_***) para cada propriedade. <br />
Dica: _Alt_ + _Ins_ no NetBeans
Ex:
```
//Retornar a cor do veiculo
public String getCor() {
        return cor;
}

//Definir a cor do veículo
public void setCor(String pCor) {
        this.cor = pCor;
}
```

### Tarefa 2 - Defina os comportamentos da Classe Carro
2.1 Adicione à classe Carro, os seguintes métodos:
```
public void acelerar(){
        this.velocidadeAtual+=10;
    }

public void acelerar(int numVelocidade){
          this.velocidadeAtual+=numVelocidade;
    }

public void frear(){
        this.velocidadeAtual-=10;
    }
```

### Tarefa 3 - Instanciar Objetos
3.1 Na classe Main, instancie (crie) um objeto da classe Carro e defina na propriedade *"modelo"*, o nome de sua preferência. Ex:
```
   //Instancio o objeto da classe Carro
   Carro meuCarro = new Carro();
   meuCarro.setModelo("SeuModeloDeCarroFavorito");
```
3.2 Ainda na classe Main, instancie outro objeto da classe Carro, defina a cor e o modelo de sua preferência e acelere-o:
```
   //Instancio outro objeto da classe Carro
   Carro carroRodizio = new Carro();
   carroRodizio.setModelo(“SeuOutroModelo");
   carroRodizio.setCor(“SuaCorFavorita");
   carroRodizio.acelerar();
```
3.3 Na Main, exiba uma caixa de diálogo de mensagem com as informações do segundo carro:
<code>JOptionPane.showMessageDialog(this, "Modelo: " + carroRodizio.getModelo() + ", Cor: " + carroRodizio.getCor() + " Velocidade: " + carroRodizio.getVelocidadeAtual());</code>
