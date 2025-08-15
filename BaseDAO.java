// Visibilidade de pacote 
class BaseDAO {

    protected Connection con() throws SQLException {
        return ConnectionFactory.getInstance().get();
    }
}
