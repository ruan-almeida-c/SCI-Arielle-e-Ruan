package cursoView;
import CursoControl.Controlador_Usuarios;

public class interfaceCurso {
    
    public static void main(String[] args) {
        Controlador_Usuarios ctlUsuario = new Controlador_Usuarios();
        
        /*ctlUsuario.CadastroAluno("Ari", "233", "rua 2", "2334532", "ar@bol", 0);
        ctlUsuario.CadastroAluno("Arie", "263", "rua 2", "2334532", "ar@bol", 1);

        ctlUsuario.ConsultaAluno("233");
        
        ctlUsuario.alterarCadastroAluno(1, "233", "Pudim");
        
        ctlUsuario.ConsultaAluno("233");

        ctlUsuario.removerAluno("233");
        
        ctlUsuario.ConsultaAluno("233");
        
        ctlUsuario.ConsultaAluno("263");
*/
        
        ctlUsuario.CadastroProfessor("Mar", "2", "Bangu", "2233323", 30, 4);
        
        ctlUsuario.ConsultaProfessor("2");
        
        ctlUsuario.alterarCadastroProfessor(5, "2", "33.70");
        ctlUsuario.alterarCadastroProfessor(6, "2", "3");
        ctlUsuario.ConsultaProfessor("2");
    }
    
}
