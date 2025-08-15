// Visibilidade de pacote
class ConnectionFactory {

    // Atributo global / estático
    private static ConnectionFactory instance;

    // Construtor privado
    private ConnectionFactory() {
    }

    public static ConnectionFactory getInstance() {
        if (instance == null)
            instance = new ConnectionFactory();
        return instance;
    }

    // Criação da conexão com o seu banco de dados.
    public Connection get() throws SQLException {
        //TODO
        return null;
    }
}
