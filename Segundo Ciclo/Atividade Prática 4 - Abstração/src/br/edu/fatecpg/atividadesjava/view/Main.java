package br.edu.fatecpg.atividadesjava.view;
import br.edu.fatecpg.atividadesjava.model.*;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel Core i3", 4, "Linux Mint");
        computador.executarPrograma();
        computador.armazenarDados();
        computador.conectarInternet();

        Telescopio telescopio = new Telescopio("Lente", "Tubo", "Montagem");
        telescopio.aumentarVisao();
        telescopio.focarObjeto();
        telescopio.ajustarPosicao();

        Girafa girafa = new Girafa(5.5, "Manchas", 60);
        girafa.comerFolhas();
        girafa.correr();
        girafa.socializar();

        Gravura gravura = new Gravura("Madeira", "Xilo", "Relevo");
        gravura.criarReproducao();
        gravura.imprimirImagem();
        gravura.transferirDesign();

        TaxaDeJuros juros = new TaxaDeJuros(5.5, "Mensal", 10000);
        juros.calcularEmprestimo();
        juros.determinarRetornoInvestimento();
        juros.ajustarDividas();

        Desenho desenho = new Desenho("Lápis", "Papel", "Esboço");
        desenho.criarRepresentacao();
        desenho.transmitirIdeia();
        desenho.produzirArte();

        Trem trem = new Trem("Locomotiva", "Vagão", "Trilhos");
        trem.transportarPassageiros();
        trem.moverSobreTrilhos();
        trem.transportarCarga();

        Tigre tigre = new Tigre("Listrada", "Afiadas", "Fortes");
        tigre.caçar();
        tigre.defenderTerritorio();
        tigre.nadar();

        Roteador roteador = new Roteador("Entrada e saída", "Antenas", "Gerenciamento");
        roteador.rotearPacotes();
        roteador.conectarDispositivos();
        roteador.gerenciarSeguranca();

        Smartwatch smartwatch = new Smartwatch("OLED", "Sensor", "Bateria");
        smartwatch.monitorarSaude();
        smartwatch.exibirNotificacoes();
        smartwatch.realizarChamadas();

        Professor professor = new Professor("Técnicas de Programação", "Boa comunicação", "Experiência");
        professor.ensinar();
        professor.avaliar();
        professor.planejarAulas();

        Recessao recessao = new Recessao("Queda", "Desemprego", "Redução");
        recessao.impactarEconomia();
        recessao.reduzirConfiançaMercado();
        recessao.afetarPoliticas();

        Asteroide asteroide = new Asteroide("Rochoso", "Grande", "Órbita");
        asteroide.viajarEspaco();
        asteroide.colidir();
        asteroide.fornecerInformacoes();

        Genetica genetica = new Genetica("DNA", "46 cromossomos", "Alelos");
        genetica.transmitirCaracterísticas();
        genetica.determinarCaracteristicas();
        genetica.regularProcessos();

        Pintura pintura = new Pintura("Tela", "Pincel", "Óleo");
        pintura.criarRepresentacao();
        pintura.expressarEmocoes();
        pintura.decorarAmbientes();

        Celula celula = new Celula("Membrana", "Núcleo", "Citoplasma");
        celula.realizarFuncoesVitais();
        celula.dividir();
        celula.armazenarMaterialGenetico();

        Osmose osmose = new Osmose("Água", "Membrana", "Gradiente");
        osmose.transferirAgua();
        osmose.equilibrarConcentracao();
        osmose.manterHomeostase();

        IdadeMedia idadeMedia = new IdadeMedia("V-XV", "Feudalismo", "Religião");
        idadeMedia.modelarEstruturas();
        idadeMedia.impactarCultura();
        idadeMedia.formarBasesCulturais();

        ArteDigital arteDigital = new ArteDigital("Computador", "Pixels", "Interatividade");
        arteDigital.criarImagem();
        arteDigital.explorarExpressao();
        arteDigital.editarObras();

        Cinema cinema = new Cinema("Câmera 4K", "Roteiro", "Edição");
        cinema.produzirFilmes();
        cinema.exibirHistorias();
        cinema.entreterPublico();
    }
}
