package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioDAO {

    private Connection conexao;
    private String query;

    public UsuarioDAO() {
        conexao = ConexaoMySQL.getIstancia().getConexao();
    }

    public void criarUsuario(Usuario u){
        query = "INSERT INTO usuario(email, senha) VALUES (?,?)";
        try{
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void deletarUsuario(int id){
        query = "DELETE FROM usuario WHERE id_usuario = ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> listarUsuarios(){
        query = "SELECT * FROM usuario";
        ArrayList<Usuario> lista = new ArrayList<>();

        try {
            PreparedStatement stmt = conexao.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                int idUsuario = rs.getInt("id_usuario");
                lista.add(new Usuario(email, senha, idUsuario));
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lista;
    }
    public void atualizarUsuario(Usuario u){
        query = "UPDATE usuario SET email = ?, senha = ? WHERE id_usuario = ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getIdUsuario());
            stmt.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}