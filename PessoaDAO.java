public class PessoaDAO extends BaseDAO {

    public void inserir(Pessoa pessoa){
        String insert = " Insert into pessoa ...";
        // try-with-resources
        // Fecha a conexão com o banco de dados automaticamente.
        try(Connection con = con();
            PreparedStatement pre = con.prepareStatement(insert)){
            //TODO
        }catch(SQLExceptin e){
            System.out.println("Erro ao inserir pessoas: "+e.getMessage());
        }
    }
}
