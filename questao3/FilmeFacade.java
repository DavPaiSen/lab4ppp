package questao3;

public class FilmeFacade {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaPipoca maquinaPipoca;
    private PlayerDeStreaming playerDeStreaming;
    private Projetor projetor;
    private Telao telao;


    public FilmeFacade(Amplificador amplificador, Luzes luzes, MaquinaPipoca maquinaPipoca, PlayerDeStreaming playerDeStreaming, Projetor projetor, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.maquinaPipoca = maquinaPipoca;
        this.playerDeStreaming = playerDeStreaming;
        this.projetor = projetor;
        this.telao = telao;
    }

    public void comecoDoFilme(String filme) {
        amplificador.liga();
        amplificador.ajustaVolume(7);
        luzes.liga();
        maquinaPipoca.liga();
        maquinaPipoca.estourarPipoca();
        maquinaPipoca.desliga();
        telao.abaixa();
        projetor.liga();
        luzes.desliga();
        playerDeStreaming.liga();
        playerDeStreaming.playEmUmFilme(filme);
    }

    public void fimDoFilme() {
        amplificador.desliga();
        luzes.liga();
        playerDeStreaming.desliga();
        telao.sobe();
    }
}
